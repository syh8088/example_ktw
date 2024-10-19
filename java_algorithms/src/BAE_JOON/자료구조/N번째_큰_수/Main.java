package BAE_JOON.자료구조.N번째_큰_수;

import java.io.*;
import java.util.*;

/**
 * https://www.acmicpc.net/problem/2075
 */
class Main {

    public int solution(int n, int[][] arr) {

        int answer = 0;

        int[] ints = arr[n - 1];
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int i = 0; i < ints.length; i++) {
            queue.offer(ints[i]);
        }

        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < n; j++) {

                int target = arr[i][j];
                if (queue.peek() < target) {
                    queue.poll();
                    queue.offer(target);
                }
            }
        }


        return queue.poll();
    }

    public static void main(String[] args) throws Exception {

        Main T = new Main();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        System.out.println(T.solution(n, arr));

//        System.out.print(T.solution(5, new int[][] {
//                { 12, 7, 9, 15, 5 },
//                { 13, 8, 11, 19, 6 },
//                { 21, 10, 26, 31, 16 },
//                { 48, 14, 28, 35, 25 },
//                { 52, 20, 32, 41, 49 }
//        }));
    }
}