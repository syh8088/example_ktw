package section3.part9;

import java.util.Scanner;

public class Main {

    public int solution2(int n, int[][] arr) {

        return 0;
    }

    public static void main(String[] args) {

        Main T = new Main();
        Scanner kb = new Scanner(System.in);

//        int n = kb.nextInt();
//        int[][] arr = new int[n][n];
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                arr[i][j] = kb.nextInt();
//            }
//        }

        System.out.print(T.solution2(5, new int[][] {
                { 10, 13, 10, 12, 15 },
                { 12, 39, 30, 23, 11 },
                { 11, 25, 50, 53, 15 },
                { 19, 27, 29, 37, 27 },
                { 19, 13, 30, 13, 19 }
        }));

    }

    public int solution(int n, int[][] target) {

        int answer = Integer.MIN_VALUE;
        int sum1, sum2;


        for (int i = 0; i < n; i++) {

            sum1 = sum2 = 0;
            for (int j = 0; j < n; j++) {
                sum1 += target[i][j];
                sum2 += target[j][i];
            }

            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
        }

        // 대각선 구하기
        sum1 = sum2 = 0;
        for (int i = 0; i < n; i++) {
            sum1 += target[i][i];
            sum2 += target[i][n - i - 1];
        }

        answer = Math.max(answer, sum1);
        answer = Math.max(answer, sum2);

        return answer;
    }
}