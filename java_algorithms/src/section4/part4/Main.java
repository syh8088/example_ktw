package section4.part4;

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
//        int k = kb.nextInt();
//        int[] arr = new int[n];
//
//        for (int i = 0; i < n; i++) {
//            arr[i] = kb.nextInt();
//        }
//
//        System.out.print(T.solution(n, k, arr));

        System.out.print(T.solution2(
                8,
                6,
                new int[]{1, 2, 1, 3, 1, 1, 1, 2}
        ));

    }

    public int solution(int n, int m, int[] arr) {
        int answer = 0;
        int lt = 0;
        int sum = 0;

        for (int rt = 0; rt < n; rt++) {
            sum += arr[rt];
            if (sum == m) {
                answer++;
            }

            while (sum >= m) {
                sum -= arr[lt];
                lt++;
                if (sum == m) {
                    answer++;
                }
            }
        }

        return answer;
    }

}