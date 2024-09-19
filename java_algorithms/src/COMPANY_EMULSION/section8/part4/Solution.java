package COMPANY_EMULSION.section8.part4;

import java.util.*;

class Solution {

    public int solution2(int[][] board) {

        int answer = 0;




        return answer;
    }

    public static void main(String[] args) {

        Solution T = new Solution();
        int[][] arr = {
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 1, 1, 1, 1, 1, 0},
                {0, 0, 0, 0, 1, 0, 0, 0},
                {0, 1, 1, 0, 1, 0, 1, 1},
                {0, 1, 1, 0, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 1, 0, 0},
                {0, 1, 0, 1, 0, 0, 0, 0}
        };
        System.out.println(T.solution(arr));
    }

    // 상하좌우
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    class Point {

        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    /**
     * 내가 풀어보기
     */
    public int solution(int[][] board) {

        int[][] df = new int[board.length][board[0].length];
        board[1][1] = 1;
        int answer = 0;
        Queue<Point> queue = new LinkedList<>();
        Point point = new Point(1, 1);
        queue.offer(point);

        while (!queue.isEmpty()) {

            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Point poll = queue.poll();

                if (poll.x == 7 && poll.y == 7) {
                    return df[poll.x][poll.y];
                }

                for (int k = 0; k < 4; k++) {
                    int newX = poll.x + dx[k];
                    int newY = poll.y + dy[k];

                    if (newX < 1 || newY < 1 || newX > board.length - 1 || newY > board.length - 1) {
                        continue;
                    }

                    if (board[newX][newY] != 0) {
                        continue;
                    }

                    Point newPoint = new Point(newX, newY);
                    df[newX][newY] = df[poll.x][poll.y] + 1;
                    board[newX][newY] = 1;
                    queue.offer(newPoint);
                }
            }


        }


        return answer;
    }

}