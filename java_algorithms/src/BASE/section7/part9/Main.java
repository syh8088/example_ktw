package BASE.section7.part9;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public int solution2(int n, int m, int[] arr) {

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
//        System.out.print(T.solution(n, m, arr));

        System.out.print(T.solution2(9, 3, new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9}));
    }

    /**
     *
     */
    public int solution(int n, int m, int[] arr) {

        int answer = 0;

        int lt = Arrays.stream(arr).max().getAsInt();
        int rt = Arrays.stream(arr).sum();

        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (this.count(arr, mid) <= m) {
                answer = mid;
                rt = mid - 1;
            }
            else {
                lt = mid + 1;
            }
        }

        return answer;
    }

    public int count(int[] arr, int capacity) {
        int cnt = 1;
        int sum = 0;

        for (int x : arr) {
            if (sum + x > capacity) {
                cnt++;
                sum = x;
            }
            else sum += x;
        }

        return cnt;
    }
}