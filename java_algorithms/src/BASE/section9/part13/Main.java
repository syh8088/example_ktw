package BASE.section9.part13;

import java.util.Scanner;

class Main {

    static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};

    static int[][] board;

    static int n;

    public static void DFS2() {







    }

    public static void main(String[] args) {

        Main T = new Main();

        Scanner kb = new Scanner(System.in);
//        n = kb.nextInt();

        n = 7;

//        board = new int[n][m];
        board = new int[][] {
                {1, 1, 0, 0, 0, 1, 0},
                {0, 1, 1, 0, 1, 1, 0},
                {0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 1, 1},
                {1, 1, 0, 1, 1, 0, 0},
                {1, 0, 0, 0, 1, 0, 0},
                {1, 0, 1, 0, 1, 0, 0}
        };

        int answer = 0;

        for (int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                int target = board[i][j];
                if (target == 1) {
                    answer++;
                    DFS(i, j);
                }
            }
        }

        System.out.println(answer);
    }

    public static void DFS(int x, int y) {

        board[x][y] = 0;
        for (int i = 0; i < 8; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx < 0 || ny < 0 || nx >= n || ny >= n) {
                continue;
            }

            if (board[nx][ny] == 1) {
                DFS(nx, ny);
            }
        }

    }


}