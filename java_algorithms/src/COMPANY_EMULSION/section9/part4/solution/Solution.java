package COMPANY_EMULSION.section9.part4.solution;

import java.util.*;

class Solution {

    public int solution(int[][] board) {

        int[] dx = {0, 0, 1, -1};
        int[] dy = {1, -1, 0, 0};

        int n = board.length;
        int m = board[0].length;
        int[][] cost = new int[n][m];

        for (int i = 0; i < n; i++) {
            Arrays.fill(cost[i], Integer.MAX_VALUE);
        }

        cost[0][0] = 0;

        PriorityQueue<int[]> queue = new PriorityQueue<>((a, b) -> a[2] - b[2]);
        queue.add(new int[]{0, 0, 0});

        while (!queue.isEmpty()) {

            int[] poll = queue.poll();

            int dir = board[poll[0]][poll[1]] - 1;
            if (poll[2] > cost[poll[0]][poll[1]]) {
                continue;
            }

            for (int k = 0; k < 4; k++) {

                int nx = poll[0] + dx[k];
                int ny = poll[1] + dy[k];

                if (nx < 0 || nx >= n || ny < 0 || ny >= m) {
                    continue;
                }

                int pollCost = poll[2];
                if (k == dir && cost[nx][ny] > pollCost) {
                    cost[nx][ny] = poll[2];
                    queue.offer(new int[]{nx, ny, pollCost});
                }
                else {
                    if (cost[nx][ny] > pollCost + 1) {
                        cost[nx][ny] = pollCost + 1;
                        queue.offer(new int[]{nx, ny, pollCost + 1});
                    }
                }

            }
        }

        return cost[n - 1][m - 1];
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
}