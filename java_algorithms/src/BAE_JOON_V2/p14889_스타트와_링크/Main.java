package BAE_JOON_V2.p14889_스타트와_링크;

import java.io.*;
import java.util.*;

/**
 * https://www.acmicpc.net/problem/14889
 *
 * 💥풀이
 * https://myeongju00.tistory.com/62
 */
class Main {

    public static void solution(int n, int[][] arr) {

        N = n;
        visited = new boolean[N];
        board = arr;
        Min = Integer.MAX_VALUE;

        dfs2(0, 0);

        System.out.println(Min);
    }

    public static void dfs2(int idx, int depth) {



    }

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

        solution(4, new int[][] {
                { 0, 1, 2, 3 },
                { 4, 0, 5, 6 },
                { 7, 1, 0, 2 },
                { 3, 4, 5, 0 }
        });

//        solution3(6, new int[][] {
//                { 0, 1, 2, 3, 4, 5 },
//                { 1, 0, 2, 3, 4, 5 },
//                { 1, 2, 0, 3, 4, 5 },
//                { 1, 2, 3, 0, 4, 5 },
//                { 1, 2, 3, 4, 0, 5 },
//                { 1, 2, 3, 4, 5, 0 }
//        });
    }

    /**
     * 정답
     */
    static int[][] board;
    static boolean[] visited;
    static int N;
    static int Min;

    public static void solution3(int n, int[][] arr) {
        N = n;
        visited = new boolean[N];
        board = arr;
        Min = Integer.MAX_VALUE;
        dfs(0, 0);

        System.out.println(Min);
    }

    public static void dfs(int idx, int depth) {

        if (depth == N / 2) {
            int startTeam = 0;
            int linkTeam = 0;

            for (int i = 0; i < N - 1; i++) {
                for (int j = i + 1; j < N; j++) { // 중복 방지
                    if (visited[i] && visited[j]) {
                        startTeam += board[i][j];
                        startTeam += board[j][i];
                    }
                    else if (!visited[i] && !visited[j]) {
                        linkTeam += board[i][j];
                        linkTeam += board[j][i];
                    }
                }
            }

            // 두 팀의 점수 차이 (절댓값)
            int val = Math.abs(startTeam - linkTeam);

            if (val == 0) {
                System.out.println(val);
                System.exit(0);
            }

            Min = Math.min(val, Min);
            return;
        }

        for (int i = idx; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                dfs(i + 1, depth + 1);
                visited[i] = false;
            }
        }
    }

    /**
     * 내가 풀어보기
     */
    public void solution2(int N, int[][] arr) {

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {

            for (int j = i + 1; j < N; j++) {

                System.out.println("i = " + i);
                System.out.println("j = " + j);

                int a = arr[i][j] + arr[j][i];

                for (int e = 0; e < N; e++) {
                    for (int k = e + 1; k < N; k++) {

                        System.out.println("e = " + e);
                        System.out.println("k = " + k);

                        if (i != e && j != k) {
                            int b = arr[e][k] + arr[k][e];
                            min = Math.min(min, Math.abs(a - b));
                        }

                    }
                }
            }
        }

        System.out.println("min = " + min);
    }
}