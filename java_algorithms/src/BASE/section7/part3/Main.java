package BASE.section7.part3;

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

        for (int x : T.solution(6, new int[]{ 11, 7, 5, 6, 10, 9 })) {
            System.out.print(x + " ");
        }
    }

    /**
     *
     */
    public int[] solution(int n, int[] arr) {

        for (int i = 1; i < n; i++) {
            int temp = arr[i];
            int j;
            for (j = i - 1; j >= 0; j--) {
                int target = arr[j];
                if (target > temp) {
                    arr[j + 1] = target;
                }
                else {
                    break;
                }
            }

            arr[j + 1] = temp;
        }
        return arr;
    }
}