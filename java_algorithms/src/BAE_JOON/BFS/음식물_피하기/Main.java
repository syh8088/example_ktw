package BAE_JOON.BFS.음식물_피하기;

import java.io.*;
import java.util.*;

/**
 * https://www.acmicpc.net/problem/1743
 *
 * 💥풀이
 *
 */
class Main {

    // 상하좌우
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    static int[][] dfs;
    static int count;
    static int count2;
    static int answer;

    public static void solution(int N, int M, int k, int[][] arr) throws IOException {

        answer = 0;
        count = 0;

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= M; j++) {
                if (dfs[i][j] == 0 && arr[i][j] == 1) {
                    count = 1;
                    dfs[i][j] = 1;
                    BFS(i, j, N, M, arr);
                    answer = Math.max(answer, count);
                }

            }
        }

        System.out.println(answer);
    }

    public static void BFS(int x, int y, int N, int M, int[][] arr) {

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x, y});

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {

                int[] poll = queue.poll();

                for (int j = 0; j < 4; j++) {
                    int nx = poll[0] + dx[j];
                    int ny = poll[1] + dy[j];

                    if (nx <= 0 || ny <= 0 || nx > N || ny > M) {
                        continue;
                    }

                    if (dfs[nx][ny] == 0 && arr[nx][ny] == 1) {
                        dfs[nx][ny] = 1;
                        count++;
                        queue.offer(new int[]{nx, ny});
                    }
                }

            }
        }
    }

    public static void main(String[] args) throws Exception {

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String[] s = br.readLine().split(" ");
//        int N = Integer.parseInt(s[0]);
//        int M = Integer.parseInt(s[1]);
//        int k = Integer.parseInt(s[2]);
//
//        int[][] arr = new int[N + 1][M + 1];
//
//        StringTokenizer st;
//        for (int i = 0; i < k; i++) {
//            st = new StringTokenizer(br.readLine(), " ");
//            int x = Integer.parseInt(st.nextToken());
//            int y = Integer.parseInt(st.nextToken());
//
//            arr[x][y] = 1;
//        }


        int N = 3;
        int M = 4;
        int k = 5;

        dfs = new int[N + 1][M + 1];

        int[][] arr = new int[][] {
                {0, 0, 0, 0, 0},
                {0, 1, 0, 0, 0},
                {0, 0, 1, 1, 0},
                {0, 1, 1, 0, 0}
        };

        solution(N, M, k, arr);

//        solution(5, new char[][] {
//                { 'R', 'R', 'R', 'R', 'R' },
//                { 'R', 'R', 'R', 'B', 'B' },
//                { 'G', 'G', 'B', 'B', 'B' },
//                { 'B', 'B', 'B', 'R', 'R' },
//                { 'B', 'B' ,'R', 'R', 'R' },
//        });
    }

}