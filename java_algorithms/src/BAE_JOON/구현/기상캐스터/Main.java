package BAE_JOON.구현.기상캐스터;

import java.io.*;
import java.util.*;

/**
 * https://www.acmicpc.net/problem/10709
 *
 * 💥풀이
 * https://bono039.tistory.com/m/1254
 */
class Main {

    public static void solution2(int p, int m, int[] lArray, String[] nArray) {













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


    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int h = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());

        char[][] arr = new char[h][w];
        for (int i = 0 ; i < h ; i++) {
            char[] ch = br.readLine().toCharArray();
            for (int j = 0 ; j < w ; j++) {
                arr[i][j] = ch[j];
            }
        }

//        int h = 3;
//        int w = 4;
//        char[][] arr = new char[][] {
//            {'c', '.', '.', 'c'},
//            {'.', '.', 'c', '.'},
//            {'.', '.', '.', '.'},
//        };

//        int h = 6;
//        int w = 8;
//        char[][] arr = new char[][] {
//                {'.', 'c', '.', '.', '.', '.', '.', '.'},
//                {'.', '.', '.', '.', '.', '.', '.', '.'},
//                {'.', 'c', 'c', 'c','.', '.', 'c', '.'},
//                {'.', '.', '.', '.', 'c', '.', '.', '.'},
//                {'.', '.', 'c', '.', 'c', 'c', '.', '.'},
//                {'.', '.', '.', '.', 'c', '.', '.', '.'},
//        };

        solution(h, w, arr);
    }

}