package BASE.section7.part2;

import java.util.Scanner;

public class Main {

    public int[] solution2(int n, int[] arr) {


        return arr;
    }


    public static void main(String[] args) {

        Main T = new Main();
        Scanner kb = new Scanner(System.in);

//        int n = kb.nextInt();
//
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = kb.nextInt();
//        }
//
//        for (int x : T.solution(n, arr)) {
//            System.out.print(x + " ");
//        }

        for (int x : T.solution(6, new int[]{ 13, 5, 11, 7, 23, 15 })) {
            System.out.print(x + " ");
        }
    }

    /**
     *
     */
    public int[] solution(int n, int[] arr) {

        int m = n;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m - 1; j++) {

                int i1 = arr[j];
                int i2 = arr[j + 1];
                if (i1 > i2) {
                    arr[j] = i2;
                    arr[j + 1] = i1;
                }

            }
            m--;
        }

        return arr;
    }
}