package BASE.section7.part1;

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

        for (int x : T.solution2(6, new int[]{ 13, 5, 11, 7, 23, 15 })) {
            System.out.print(x + " ");
        }
    }

    /**
     *
     */
    public int[] solution(int n, int[] arr) {

        for (int i = 0; i < n - 1; i++) {
            int idx = i;
            for (int j = i + 1; j < n; j++) {

                int jvalue = arr[j];
                int idxvalue = arr[idx];
                if (jvalue < idxvalue) {
                    idx = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = temp;
        }

        return arr;
    }
}