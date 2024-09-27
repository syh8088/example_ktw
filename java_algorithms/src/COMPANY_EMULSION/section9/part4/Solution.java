package COMPANY_EMULSION.section9.part4;

import java.util.*;

class Solution {

    // 상하좌우
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};

    class Edge implements Comparable<Edge> {

        public int x;
        public int y;
        public int cost;

        Edge(int x, int y, int cost) {
            this.x = x;
            this.y = y;
            this.cost = cost;
        }

        @Override
        public int compareTo(Edge ob) {
            return this.cost - ob.cost;
        }
    }

    public int solution2(int[][] board) {



        return 0;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        System.out.println(T.solution(new int[][] {
                {3, 1, 3},
                {1, 4, 2},
                {4, 2, 3}
        }));
        System.out.println(T.solution(new int[][]{{3, 2, 1, 3}, {1, 1, 4, 2}, {3, 4, 2, 1}, {1, 2, 2, 4}}));
        System.out.println(T.solution(new int[][]{{3, 2, 1, 3, 1, 2}, {2, 1, 1, 1, 4, 2}, {2, 2, 2, 1, 2, 2}, {1, 3, 3, 4, 4, 4}, {1, 2, 2, 3, 3, 4}}));
        System.out.println(T.solution(new int[][]{{3, 2, 1, 3, 1, 2, 2, 2}, {2, 1, 1, 1, 4, 2, 1, 1}, {2, 2, 2, 1, 2, 2, 3, 4}, {1, 3, 3, 4, 4, 4, 3, 1}, {1, 2, 2, 3, 3, 4, 3, 4}, {1, 2, 2, 3, 3, 1, 1, 1}}));
        System.out.println(T.solution(new int[][]{{1, 2, 3, 2, 1, 3, 1, 2, 2, 2}, {1, 2, 2, 1, 1, 1, 4, 2, 1, 1}, {3, 2, 2, 2, 2, 1, 2, 2, 3, 4}, {3, 3, 1, 3, 3, 4, 4, 4, 3, 1}, {1, 1, 1, 2, 2, 3, 3, 4, 3, 4}, {1, 1, 1, 2, 2, 3, 3, 1, 1, 1}}));
    }




    public int solution(int[][] board) {

        int n = board.length;
        int m = board[0].length;

        int[][] cost = new int[board.length][board[0].length];
        for (int i = 0; i < cost.length; i++) {
            Arrays.fill(cost[i], Integer.MAX_VALUE);
        }

        PriorityQueue<Edge> queue = new PriorityQueue<>();
        queue.offer(new Edge(0, 0, 0));

        while (!queue.isEmpty()) {

            Edge edge = queue.poll();
            if (edge.cost > cost[edge.x][edge.y]) {
                continue;
            }

            int dir = board[edge.x][edge.y] - 1;
            for (int i = 0; i < 4; i++) {

                int dx1 = dx[i];
                int dy1 = dy[i];

                int nx = edge.x + dx1;
                int ny = edge.y + dy1;

                if (nx < 0 || ny < 0 || nx >= board.length || ny >= board[0].length) {
                    continue;
                }

                if (i == dir && cost[nx][ny] > edge.cost) {
                    cost[nx][ny] = edge.cost;
                    queue.offer(new Edge(nx, ny, edge.cost));
                }
                else {
                    if (cost[nx][ny] > edge.cost + 1) {
                        cost[nx][ny] = edge.cost + 1;
                        queue.offer(new Edge(nx, ny, edge.cost + 1));
                    }
                }
            }
        }

        return cost[n - 1][m - 1];
    }
}