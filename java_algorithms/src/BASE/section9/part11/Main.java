package BASE.section9.part11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point {

    public int x;
    public int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {

    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] board;
    static int[][] dis;

    public void BFS2(int x, int y) {




        


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
                {1, 1, 0, 1, 0, 0, 0},
                {1, 0, 0, 0, 1, 0, 0},
                {1, 0, 1, 0, 0, 0, 0}
        };
        dis = new int[7][7];
        T.BFS2(0, 0);
        if (dis[6][6] == 0) {
            System.out.println(-1);
        }
        else {
            System.out.println(dis[6][6]);
        }

    }

    public void BFS(int x, int y) {

        Queue<Point> Q = new LinkedList<>();
        Q.offer(new Point(x, y));

        board[x][y] = 1;
        while (!Q.isEmpty()) {
            Point point = Q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = point.x + dx[i];
                int ny = point.y + dy[i];

                // 경계선 밖인가?
                if (nx >= 0 && nx <= 6 && ny >= 0 && ny <= 6) {
                    // 갈수있는 통로인가?
                    int target = board[nx][ny];
                    if (target == 0) {
                        board[nx][ny] = 1;
                        Q.offer(new Point(nx, ny));
                        dis[nx][ny] = dis[point.x][point.y] + 1;
                    }

                }
            }
        }

    }

}