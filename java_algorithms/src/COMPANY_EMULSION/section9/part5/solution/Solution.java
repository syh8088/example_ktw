package COMPANY_EMULSION.section9.part5.solution;

import java.util.*;

class Solution {

    public int solution(int[][] board, int[] s, int[] e) {

        int n = board.length;
        int m = board[0].length;
        int[][] cost = new int[n][m];

        for (int i = 0; i < n; i++) {
            Arrays.fill(cost[i], Integer.MAX_VALUE);
        }

        PriorityQueue<int[]> queue = new PriorityQueue<>((a, b) -> a[2] - b[2]);
        queue.add(new int[]{s[0], s[1], 0});
        cost[s[0]][s[1]] = 0;

        while (!queue.isEmpty()) {

            int[] target = queue.poll();

            if (target[2] > cost[target[0]][target[1]]) {
                continue;
            }

            for (int[] dir : new int[][]{{-1, 0}, {0, 1}, {1, 0}, {0, -1}}) {

                int nx = target[0];
                int ny = target[1];
                int len = target[2];

                while (nx >= 0 && nx < n && ny >= 0 && ny < m && board[nx][ny] == 0) {
                    nx += dir[0];
                    ny += dir[1];
                    len++;
                }

                nx -= dir[0];
                ny -= dir[1];
                len--;

                if (cost[nx][ny] > len) {
                    cost[nx][ny] = len;
                    queue.add(new int[]{nx, ny, len});
                }
            }
        }

        if (cost[e[0]][e[1]] == Integer.MAX_VALUE) {
            return -1;
        }
        else {
            return cost[e[0]][e[1]];
        }
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        System.out.println(T.solution(new int[][] {
                {0, 0, 1, 0, 0, 0},
                {0, 0, 1, 0, 0, 0},
                {0, 0, 0, 0, 1, 0},
                {1, 0, 1, 1, 1, 0},
                {1, 0, 0, 0, 0, 0}
        }, new int[]{1, 0}, new int[]{4, 5}));
        System.out.println(T.solution(new int[][]{{0, 0, 1, 0, 0, 0}, {0, 0, 1, 0, 0, 0}, {0, 0, 0, 0, 1, 0}, {1, 0, 1, 1, 1, 0}, {1, 0, 0, 0, 0, 0}}, new int[]{0, 0}, new int[]{4, 2}));
        System.out.println(T.solution(new int[][]{{1, 0, 1, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 1, 0}, {1, 1, 0, 1, 1}, {0, 0, 0, 0, 0}}, new int[]{0, 3}, new int[]{4, 2}));
        System.out.println(T.solution(new int[][]{{0, 1, 0, 1, 0, 0}, {0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 1, 0}, {0, 1, 1, 0, 1, 1}, {0, 0, 0, 0, 0, 0}}, new int[]{0, 0}, new int[]{4, 5}));
        System.out.println(T.solution(new int[][]{{0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0}, {0, 1, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 1, 0, 0, 0, 0, 0}}, new int[]{0, 0}, new int[]{4, 3}));
    }
}