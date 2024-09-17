package BASE.section9.part14;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point {

    public int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}


class Main {

    static int answer = 0;

    static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};

    static int[][] board;
    static int n;

    static Queue<Point> queue = new LinkedList<>();

    public void BFS2() {







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

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
//                board[i][j] = kb.nextInt();
                if (board[i][j] == 1) {
                    answer++;
                    board[i][j] = 0;
                    BFS(i, j, board);
                }
            }
        }

        System.out.println(answer);
    }

    public static void BFS(int x, int y, int[][] board) {

        queue.offer(new Point(x, y));

        while (!queue.isEmpty()) {
            Point point = queue.poll();

            for (int i = 0; i < 8; i++) {
                int nx = point.x + dx[i];
                int ny = point.y + dy[i];
                if (nx >= 0 && nx < n && ny >= 0 && ny < n) {

                    int target = board[nx][ny];
                    if (target == 1) {
                        board[nx][ny] = 0;
                        queue.offer(new Point(nx, ny));
                    }
                }
            }
        }

    }


}