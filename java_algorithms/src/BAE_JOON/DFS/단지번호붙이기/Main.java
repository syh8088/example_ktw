package BAE_JOON.DFS.단지번호붙이기;

import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/2667
 */
class Main {
    // 상하좌우
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    static int[][] dfs;
    static int count;
    int answer;

    public void solution(int n, int[][] arr) throws IOException {

        answer = 0;
        count = 0;
        dfs = new int[n][n];
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int target = arr[i][j];
                count = 0;
                if (target == 1 && dfs[i][j] == 0) {
                    answer++;
//                    dfs[i][j] = 1;
                    DFS(i, j, arr);
                    result.add(count);
                }
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Collections.sort(result);
//        System.out.println(answer);
//        for (int x : result) {
//            System.out.println(x);
//        }

        bw.write(result.size()+"\n");
        for (int x : result) {
            bw.write(x+"\n");
        }
        bw.flush();
        bw.close();
    }

    public void DFS(int i, int j, int[][] arr) {
        for (int k = 0; k < 4; k++) {
            int x = i + dx[k];
            int y = j + dy[k];
            if (x >= 0 && x < arr.length && y >= 0 && y < arr[0].length) {
                if (dfs[x][y] == 0 && arr[x][y] == 1) {
                    dfs[x][y] = 1;
                    count++;
                    DFS(x, y, arr);
                }
            }
        }
    }



    public static void main(String[] args) throws Exception {

        Main T = new Main();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < n; j++) {
                arr[i][j] = str.charAt(j) - '0';
            }
        }
        T.solution(n, arr);

//        T.solution(7, new int[][] {
//                { 0, 1, 1, 0, 1, 0, 0 },
//                { 0, 1, 1, 0, 1, 0, 1 },
//                { 1, 1, 1, 0, 1, 0, 1 },
//                { 0, 0, 0, 0, 1, 1, 1 },
//                { 0, 1, 0, 0, 0, 0, 0 },
//                { 0, 1, 1, 1, 1, 1, 0 },
//                { 0, 1, 1, 1, 0, 0, 0 }
//        });
    }

}