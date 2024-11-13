package BAE_JOON_V2.p14502_연구소;

import java.io.*;
import java.util.*;

/**
 * https://www.acmicpc.net/problem/14502
 *
 * 💥풀이
 *
 */
class Main {

    public static void main(String[] args) throws Exception {

        Main T = new Main();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

//        int N = Integer.parseInt(br.readLine());
//        int[][] arr = new int[N][N];
//
//        for (int i = 0; i < N; i++) {
//            st = new StringTokenizer(br.readLine());
//            for (int j = 0; j < N; j++) {
//                arr[i][j] = Integer.parseInt(st.nextToken());
//            }
//        }
//        T.solution(N, arr);

        N = 7;
        M = 7;
        answer = 0;

        arr = new int[][] {
                { 2, 0, 0, 0, 1, 1, 0 },
                { 0, 0, 1, 0, 1, 2, 0 },
                { 0, 1, 1, 0, 1, 0, 0 },
                { 0, 1, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 1, 1 },
                { 0, 1, 0, 0, 0, 0, 0 },
                { 0, 1, 0, 0, 0, 0, 0 }
        };
        solution3(0);
        System.out.println(answer);
    }

    static int N;
    static int M;
    static int[][] arr;

    // 상하좌우
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    static int answer;

    public static void solution3(int index) {


    }

}