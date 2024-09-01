package section7.part10;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public int solution2(int n, int c, int[] arr) {

        int answer = 0;


        return answer;
    }


    public static void main(String[] args) {

        Main T = new Main();
        Scanner kb = new Scanner(System.in);

//        int n = kb.nextInt();
//        int c = kb.nextInt();
//
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = kb.nextInt();
//        }
//        System.out.print(T.solution(n, c, arr));

        System.out.print(T.solution(5, 3, new int[] {1, 2, 8, 4, 9}));
    }

    /**
     *
     */
    public int solution(int n, int c, int[] arr) {

        int answer = 0;
        Arrays.sort(arr);

        int lt = arr[0];
        int rt = arr[arr.length - 1];

        while (lt <= rt) {

            int mid = (lt + rt) / 2;
            if (this.count(arr, mid) < c) {
                rt = mid - 1;
            }
            else {
                answer = mid;
                lt = mid + 1;
            }
        }

        return answer;
    }

    private int count(int[] arr, int mid) {

        int ep = arr[0];
        int count = 1;

        for (int i = 1; i < arr.length; i++) {
            int target = arr[i];
            if (target - ep >= mid) {
                ep = target;
                count++;
            }

        }

        return count;
    }

}