package BAE_JOON.Prefix_Sum.피아노_체조;

import java.io.*;
import java.util.*;

/**
 * https://www.acmicpc.net/problem/21318
 *
 * 💥풀이
 *
 */
class Main {

    public static void solution2(int n, int[] arr, int Q, int[] xArray, int[] yArray) {









    }


    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int j = 0; j < n; j++) {
            arr[j] = Integer.parseInt(st.nextToken());
        }

        int Q = Integer.parseInt(br.readLine());

        int[] xArray = new int[Q];
        int[] yArray = new int[Q];
        for (int i = 0; i < Q; i++) {
            StringTokenizer stt = new StringTokenizer(br.readLine());
            xArray[i] = Integer.parseInt(stt.nextToken());
            yArray[i] = Integer.parseInt(stt.nextToken());
        }

//        int n = 9;
//        int[] arr = new int[]{ 1, 2, 3, 3, 4, 1, 10, 8, 1 };
//        int Q = 5;
//        int[] xArray = new int[]{1, 2, 4, 9, 5};
//        int[] yArray = new int[]{3, 5, 7, 9, 9};

        solution(n, arr, Q, xArray, yArray);
    }

    /**
     * 정답
     */
    public static void solution(int n, int[] arr, int Q, int[] xArray, int[] yArray) {

        int[] answer = new int[Q];

        for (int i = 0; i < Q; i++) {
            int x = xArray[i];
            int y = yArray[i];

            int pre = 0;
            int count = 0;
            for (int j = x; j <= y; j++) {
                int target = arr[j - 1];
                if (target < pre) {
                    count++;
                }

                pre = target;
            }

            answer[i] = count;
        }

        StringBuilder sb = new StringBuilder();
        for (int x : answer) {
            sb.append(x).append("\n");
        }

        System.out.println(sb.toString());
    }




}