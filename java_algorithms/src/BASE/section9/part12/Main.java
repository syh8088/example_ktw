package BASE.section9.part12;

import java.util.*;

class Point {

    public int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}


class Main {

    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    static int[][] board;
    static int[][] dis;

    static int n, m;
    static Queue<Point> queue = new LinkedList<>();

    public void BFS2() {



        


    }

    public static void main(String[] args) {

        Main T = new Main();

        Scanner kb = new Scanner(System.in);
//        m = kb.nextInt();
//        n = kb.nextInt();

        m = 6;
        n = 4;

//        board = new int[n][m];
        board = new int[][] {
                {0, 0, -1, 0, 0, 0},
                {0, 0, 1, 0, -1, 0},
                {0, 0, -1, 0, 0, 0},
                {0, 0, 0, 0, -1, 1}
        };

        dis = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
//                board[i][j] = kb.nextInt();
                if (board[i][j] == 1) {
                    queue.offer(new Point(i, j));
                }
            }
        }
        T.BFS();

        boolean flag = true;
        int answer = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if (board[i][j] == 0) {
                    flag = false;
                }
            }
        }

        if (flag) {
            for (int i = 0; i < n; i++) {
                for(int j = 0; j < m; j++) {
                    answer = Math.max(answer, dis[i][j]);
                }
            }
            System.out.println(answer);
        }
        else {
            System.out.println(-1);
        }
    }

    public void BFS() {

        while (!queue.isEmpty()) {
            Point point = queue.poll();

            for (int i = 0; i < 4; i++) {
                int nx = point.x + dx[i];
                int ny = point.y + dy[i];
                if (nx >= 0 && nx < n && ny >= 0 && ny < m && board[nx][ny] == 0) {
                    board[nx][ny] = 1;
                    queue.offer(new Point(nx, ny));
                    dis[nx][ny] = dis[point.x][point.y] + 1;
                }
            }
        }

    }


}