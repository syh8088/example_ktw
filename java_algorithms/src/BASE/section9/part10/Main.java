package BASE.section9.part10;

import java.util.Scanner;

public class Main {

    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] board;
    static int answer = 0;

    public void DFS2(int x, int y) {




        
    }


    public static void main(String[] args) {

        Main T = new Main();
        Scanner kb = new Scanner(System.in);
//        board = new int[7][7];
//        for (int i = 0; i < 7; i++) {
//            for (int j = 0; j < 7; j++) {
//                board[i][j] = kb.nextInt();
//            }
//        }

        board = new int[][] {
                {0, 0, 0, 0, 0, 0, 0},
                {0, 1, 1, 1, 1, 1, 0},
                {0, 0, 0, 1, 0, 0, 0},
                {1, 1, 0, 1, 0, 1, 1},
                {1, 1, 0, 0, 0, 0, 1},
                {1, 1, 0, 1, 1, 0, 0},
                {1, 0, 0, 0, 0, 0, 0}
        };
        board[0][0] = 1;

        T.DFS2(0, 0);
        System.out.println(answer);
    }

    public void DFS(int x, int y) {

        if (x == 6 && y == 6) {
            answer++;
        }
        else {
            for (int k = 0; k < 4; k++) {
                int nx = x + dx[k];
                int ny = y + dy[k];

                // 경계선 밖인가?
                if (nx >= 0 && nx <= 6 && ny >= 0 && ny <= 6) {

                    // 갈수있는 통로인가?
                    int target = board[nx][ny];
                    if (target == 0) {
                        board[nx][ny] = 1;
                        DFS(nx, ny);
                        board[nx][ny] = 0;
                    }
                }

            }
        }


    }

}