package BAE_JOON_V2.p14502_연구소;

import java.io.*;
import java.util.*;

/**
 * https://www.acmicpc.net/problem/14502
 *
 * 💥풀이
 *
 */
class Main2 {

    public static void main(String[] args) throws Exception {

        Main2 T = new Main2();

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

//    static int[][] virusArr;
    
    static int answer;
    /**
     * 정답
     */
    public static void solution3(int index) {

        if (index == 3) {
            // 바이러스를 퍼트려본다.
            // 남아있는 0 의 갯수를 센다.
            int countOf0 = BFS();
            answer = Math.max(answer, countOf0);
            return;
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (arr[i][j] == 0) {
                    arr[i][j] = 1;
                    solution3(index + 1);
                    arr[i][j] = 0;
                }
            }
        }
    }

    public static int BFS() {

        Queue<int[]> queue = new LinkedList<>();
        boolean[][] check = new boolean[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (arr[i][j] == 2) {
                    queue.offer(new int[]{i, j});
                    check[i][j] = true;
                }
            }
        }

        while (!queue.isEmpty()) {
            int[] list = queue.poll();
            int x = list[0];
            int y = list[1];

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= 0 && nx < N && ny >= 0 && ny < M && !check[nx][ny] && arr[nx][ny] == 0) {
                    check[nx][ny] = true;
                    queue.offer(new int[]{nx, ny});
                }
            }

        }

        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (arr[i][j] == 0 && !check[i][j]) {
                    count++;
                }
            }
        }

        return count;
    }

}