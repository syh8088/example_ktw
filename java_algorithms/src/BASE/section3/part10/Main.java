package BASE.section3.part10;

import java.util.Scanner;

public class Main {

    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, 1, 0, -1};

    public int solution2(int n, int[][] arr) {

        int answer = 0;







        return answer;
    }

    public static void main(String[] args) {

        Main T = new Main();
        Scanner kb = new Scanner(System.in);

//        int n = kb.nextInt();
//        int[][] arr = new int[n][n];
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                arr[i][j] = kb.nextInt();
//            }
//        }
//        System.out.print(T.solution2(n, arr));

        System.out.print(T.solution2(5, new int[][] {
                { 5, 3, 7, 2, 3 },
                { 3, 7, 1, 6, 1 },
                { 7, 2, 5, 3, 4 },
                { 4, 3, 6, 4, 1 },
                { 8, 7, 3, 5, 2 }
        }));

    }

    public int solution(int n, int[][] target) {

        int answer = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                boolean flag = true;
                for (int k = 0; k < 4; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];

                    if (nx >= 0 && nx < n && ny >= 0 && ny < n && target[nx][ny] >= target[i][j]) {
                        flag = false;
                        break;
                    }
                }

                if (flag) {
                    answer++;
                }
            }
        }

//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//
//                int t = target[i][j];
//
//                // 좌
//                if (j != 0) {
//                    int x1 = target[i][j - 1];
//                    if (t <= x1) {
//                        continue;
//                    }
//                }
//
//                // 상
//                if (i != 0) {
//                    int x1 = target[i - 1][j];
//                    if (t <= x1) {
//                        continue;
//                    }
//                }
//
//                // 우
//                if (j != n - 1) {
//                    int x1 = target[i][j + 1];
//                    if (t <= x1) {
//                        continue;
//                    }
//                }
//
//                // 하
//                if (i != n - 1) {
//                    int x1 = target[i + 1][j];
//                    if (t > x1) {
//                        answer++;
//                    }
//                }
//            }
//        }


        return answer;
    }
}