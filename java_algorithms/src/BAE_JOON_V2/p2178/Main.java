package BAE_JOON_V2.p2178;

import java.io.*;
import java.util.*;

/**
 * https://www.acmicpc.net/problem/2178
 *
 * 💥풀이
 *
 */
class Main {

    public static void solution(int n, long[] arr) throws IOException {








    }

    static int N; // 세로
    static int M; // 가로

    static int[][] board;
    static int[][] dis;

    // 상 하 좌 우 범위 체크에서 사용할 배열
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    static int count = 0;

    public static void main(String[] args) throws Exception {

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st;
//
//        st = new StringTokenizer(br.readLine());
//        N = Integer.parseInt(st.nextToken()); // 가로
//        M = Integer.parseInt(st.nextToken()); // 세로
//
//        // 1. 지도 만들기
//        map = new char[M][N];
//
//        for (int i = 0; i < M; i++) {
//            String str = br.readLine();
//            for (int j = 0; j < N; j++) {
//                char ch = str.charAt(j);
//                map[i][j] = ch;
//            }
//        }
        N = 4 - 1; // 세로
        M = 6 - 1; // 가로
        board = new int[][] {
                {1, 0, 1, 1, 1, 1},
                {1, 0, 1, 0 ,1 ,0},
                {1, 0, 1, 0, 1, 1},
                {1, 1, 1, 0, 1, 1}
        };

        solution2();
        System.out.println(dis[N][M]);
    }

    /**
     * 정답
     */
    public static void solution2() {

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {0, 0});
        dis = new int[board.length][board[0].length];
//        dis[0][0] = 1;
        dis[0][0] = 1;

        int L = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] poll = queue.poll();

                int x = poll[0];
                int y = poll[1];

//                if (x == N && y == M) {
//                    return L;
//                }

                for (int k = 0; k < 4; k++) {
                    int nx = x + dx[k];
                    int ny = y + dy[k];

                    if (nx < 0 || ny < 0 || nx > N || ny > M) {
                        continue;
                    }

                    if (board[nx][ny] == 0) {
                        continue;
                    }

                    if (dis[nx][ny] > 0) {
                        continue;
                    }

                    queue.offer(new int[] {nx, ny});
                    dis[nx][ny] = dis[x][y] + 1;
                }
            }

            L++;
        }
    }


}