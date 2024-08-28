package section4.part3;

import java.util.Scanner;

public class Main {

    public int solution2(int n, int k, int[] arr) {

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
//        System.out.print(T.solution3(n, k, arr));

        System.out.print(T.solution3(
                10,
                3,
                new int[]{12, 15, 11, 20, 25, 10, 20, 19, 13, 15}
        ));

    }

    public int solution3(int n, int k, int[] arr) {
        int answer = 0;
        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        answer = sum;
        for (int i = k; i < n; i++) {
            sum += arr[i] - arr[i - k];
            answer = Math.max(answer, sum);
        }


        return answer;
    }

    /**
     * 내가 풀어본거
     */
    public int solution(int n, int k, int[] arr) {

        int answer = 0;

        for (int i = 0; i < n; i++) {

            int i1 = arr[i];
            if (n - k > i) {
                for (int j = i + 1; j < i + k; j++) {
                    int j1 = arr[j];
                    System.out.println("i = " + i + " j1 = " + j1);
                    i1 += j1;
                }

                answer = Math.max(answer, i1);
            }
        }


        return answer;
    }
}