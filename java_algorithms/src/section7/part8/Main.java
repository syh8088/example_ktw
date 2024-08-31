package section7.part8;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public int solution2(int m, int[] arr) {
        int answer = 0;

        return answer;
    }


    public static void main(String[] args) {

        Main T = new Main();
        Scanner kb = new Scanner(System.in);

//        int n = kb.nextInt();
//        int m = kb.nextInt();
//
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = kb.nextInt();
//        }
//        System.out.print(T.solution(m, arr));

        System.out.print(T.solution(32, new int[] {23, 87, 65, 12, 57, 32, 99, 81}));
    }

    /**
     *
     */
    public int solution(int m, int[] arr) {
        int answer = 0;

        Arrays.sort(arr);

        int lt = 0;
        int rt = arr.length - 1;

        int mid = (lt + rt) / 2;

        if (arr[mid] == m) return mid + 1;

        if (arr[mid] > m) {
            rt = mid - 1;
        }
        else {
            lt = mid + 1;
        }

        for (int i = lt; i <= rt; i++) {
            if (arr[i] == m) {
                return i + 1;
            }
        }

        return answer;
    }
}