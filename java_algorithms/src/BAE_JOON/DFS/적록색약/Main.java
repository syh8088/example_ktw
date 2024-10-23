package BAE_JOON.DFS.적록색약;

import java.io.*;
import java.util.*;

/**
 * https://www.acmicpc.net/problem/10026
 *
 * 💥풀이
 * https://superohinsung.tistory.com/102
 */
class Main {

    // 상하좌우
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    static int[][] dfs;
    static int count;
    static int count2;
    static int answer;

    public static void solution(int n, char[][] arr) throws IOException {

        answer = 0;
        count = 0;
        dfs = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (dfs[i][j] == 0) {
                    dfs[i][j] = 1;
                    DFS(i, j, arr[i][j], arr);
                    count++;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 'G') {
                    arr[i][j] = 'R'; // G를 R로 바꿔준다.
                }
            }
        }

        //
        count2 = 0;
        dfs = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (dfs[i][j] == 0) {
                    dfs[i][j] = 1;
                    DFS(i, j, arr[i][j], arr);
                    count2++;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(count).append(" ").append(count2);
        System.out.println(sb.toString());
    }

    public static void DFS(int x, int y, char target, char[][] arr) {

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && nx < arr.length && ny >= 0 && ny < arr[0].length) {

                if (dfs[nx][ny] == 0 && arr[nx][ny] == target) {
                    dfs[nx][ny] = 1;
                    DFS(nx, ny, arr[nx][ny], arr);
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        char[][] arr = new char[n][n];

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < n; j++) {
                arr[i][j] = str.charAt(j);
            }
        }
        solution(n, arr);

//        solution(5, new char[][] {
//                { 'R', 'R', 'R', 'R', 'R' },
//                { 'R', 'R', 'R', 'B', 'B' },
//                { 'G', 'G', 'B', 'B', 'B' },
//                { 'B', 'B', 'B', 'R', 'R' },
//                { 'B', 'B' ,'R', 'R', 'R' },
//        });
    }

}