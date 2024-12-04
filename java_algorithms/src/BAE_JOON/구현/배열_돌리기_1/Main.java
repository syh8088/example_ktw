package BAE_JOON.구현.배열_돌리기_1;

import java.io.*;
import java.util.*;

/**
 * https://www.acmicpc.net/problem/16926
 *
 * 💥풀이
 * https://cocoyong.tistory.com/entry/Baekjoon-16926%EB%B2%88-%EB%B0%B0%EC%97%B4-%EB%8F%8C%EB%A6%AC%EA%B8%B0-1-JAVA
 */
class Main {

    public static void solution2(int h, int w, int[][] arr) {













    }

    /**
     * 정답
     */
    public static void solution(int h, int w, char[][] arr) {

        ArrayList<int[]> points = new ArrayList<>();
        int[][] dis = new int[h][w];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                char i1 = arr[i][j];
                if (i1 == 'c') {
                    points.add(new int[]{i, j});
                    dis[i][j] = 0;
                }
                else {
                    dis[i][j] = -1;
                }
            }
        }


        for (int i = 0; i < h ; i++) {

            for (int j = 0; j < points.size(); j++) {
                int[] ints = points.get(j);
                int x = ints[0];
                int y = ints[1];

                int nx = x;
                int ny = y + 1;
                if (ny >= 0 && ny < w && dis[nx][ny] == -1) {


                    dis[nx][ny] = i + 1;
                }
                points.get(j)[0] = nx;
                points.get(j)[1] = ny;
            }

        }

        // 출력력
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < h ; i++) {
            for(int j = 0 ; j < w ; j++) {
                sb.append(dis[i][j]).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }

    public static int N, M, R, line_count;
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//        String token[] = br.readLine().split(" ");
//        N = Integer.parseInt(token[0]);   //vertical 크기
//        M = Integer.parseInt(token[1]);   //horizontal 크기
//        R = Integer.parseInt(token[2]);   //회전수

        N = 4;
        M = 4;
        R = 2;

        line_count = Math.min(N, M) / 2;        //라인수


//        int arr[][] = new int[N][M];
//
//        for (int i = 0; i < N; i++) {           //배열 입력
//            String token2[] = br.readLine().split(" ");
//            for (int j = 0; j < M; j++) {
//                arr[i][j] = Integer.parseInt(token2[j]);
//            }
//        }

        int arr[][] = new int[][] {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        solution2(N, N, arr);

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < line_count; j++) {
                int save = arr[j][j]; //시작값을 저장하고 시작위치가 0,0 ; 1,1 ; 2,2 지정
                // 한바퀴가 다 돌았으면 다시 line_count를 초기화 시켜줘야 한다
                // 1. 오른쪽상단 -> 왼쪽상단
                for (int k = j + 1; k < M - j; k++) {
                    arr[j][k - 1] = arr[j][k];
                }
                // 2. 오른쪽하단 -> 오른쪽상단
                for (int k = j + 1; k < N - j; k++) {
                    arr[k - 1][M - j - 1] = arr[k][M - j - 1];
                }
                // 3. 왼쪽하단 -> 오른쪽하단
                for (int k = M - 2 - j; k >= j; k--) {
                    arr[N - 1 - j][k + 1] = arr[N - 1 - j][k];
                }
                // 4. 왼쪽상단 -> 왼쪽하단
                for (int k = N - j - 2; k >= j; k--) {
                    arr[k + 1][j] = arr[k][j];
                }
                // 마무리 시작값을 끼어놓으면 한 라인 끝
                arr[j + 1][j] = save;
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                sb.append(arr[i][j]).append(" ");
            }
            sb.append("\n");

        }
        System.out.print(sb);
    }

}