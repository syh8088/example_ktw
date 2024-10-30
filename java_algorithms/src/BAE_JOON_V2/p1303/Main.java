package BAE_JOON_V2.p1303;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/1303
 *
 * 💥풀이
 * https://velog.io/@lifeisbeautiful/Java-%EB%B0%B1%EC%A4%80-1303%EB%B2%88-%EC%A0%84%EC%9F%81%EC%A0%84%ED%88%AC-%EC%9E%90%EB%B0%94
 */
class Main {

    public static void solution(int n, long[] arr) throws IOException {








    }

    static int N; // 가로
    static int M; // 세로

    static char map[][];
    static boolean visit[][];

    static int white_count;
    static int black_count;

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
        N = 5; // 가로
        M = 5; // 세로
        map = new char[][] {
                {'W', 'B', 'W', 'W', 'W'},
                {'W', 'W', 'W', 'W', 'W'},
                {'B', 'B', 'B', 'B', 'B'},
                {'B', 'B', 'B', 'W', 'W'},
                {'W', 'W', 'W', 'W', 'W'}
        };
        visit = new boolean[M][N];

        solution2();
    }

    /**
     * 정답
     */
    public static void solution2() {

        white_count = 0;
        black_count = 0;


        // 2. DFS를 이용해서 탐색하기.
        for (int i = 0; i < M; i++) { // 세로
            for (int j = 0; j < N; j++) { // 가로

                if (!visit[i][j]) {
                    char color = map[i][j];
                    count = 0;
                    DFS(i, j, color);

                    if (color == 'W') {
                        white_count += count * count;
                    }
                    else {
                        black_count += count * count;
                    }
                }

            }
        }

        System.out.println(white_count + " " + black_count);
    }

    /**
     *
     * @param i: 세로
     * @param j: 가로
     */
    public static void DFS(int i, int j, char color) {

        visit[i][j] = true;
        count += 1;

        for (int e = 0; e < 4; e++) {
            int nx = i + dx[e];
            int ny = j + dy[e];

            if (nx < 0 || ny < 0 || nx >= N || ny >= M) {
                continue;
            }

            if (map[nx][ny] != color) {
                continue;
            }

            if (visit[nx][ny]) {
                continue;
            }

            DFS(nx, ny, map[nx][ny]);
        }

    }

}