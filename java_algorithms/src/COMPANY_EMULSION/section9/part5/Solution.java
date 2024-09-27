package COMPANY_EMULSION.section9.part5;

import java.util.*;

class Solution {

    // 상하좌우
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    int answer;
    int[][] disArr;

    public int solution(int[][] board, int[] s, int[] e) {

        answer = 0;
        disArr = new int[board.length][board[0].length];

        int bsf = BSF(board, s, e);
        return answer;
    }

    public int BSF(int[][] board, int[] s, int[] e) {

        int L = 0;
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(s);

        while (!queue.isEmpty()) {

            int size = queue.size();
            for (int i = 0; i < size; i++) {

                int[] target = queue.poll();
                int x = target[0];
                int y = target[1];

                for (int j = 0; j < dy.length; j++) {

                    int nx = x + dx[j];
                    int ny = y + dy[j];

                    if (nx == e[0] && ny == e[1]) {
                        return L + 1;
                    }

                    if (nx < 0 || ny < 0 || nx >= board.length || ny >= board[0].length) {
                        continue;
                    }

                    if (board[nx][ny] != 0) {
                        continue;
                    }

                    board[nx][ny] = 2;
                    disArr[nx][ny] = disArr[x][y] + 1;
                    queue.offer(new int[]{nx, ny});
                }
            }
            L++;
        }

        return -1;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        System.out.println(T.solution(new int[][]{
                {0, 0, 1, 0, 0, 0},
                {0, 0, 1, 0, 0, 0},
                {0, 0, 0, 0, 1, 0},
                {1, 0, 1, 1, 1, 0},
                {1, 0, 0, 0, 0, 0}
        }, new int[]{1, 0}, new int[]{4, 5}
        ));
        System.out.println(T.solution(new int[][]{{0, 0, 1, 0, 0, 0}, {0, 0, 1, 0, 0, 0}, {0, 0, 0, 0, 1, 0}, {1, 0, 1, 1, 1, 0}, {1, 0, 0, 0, 0, 0}}, new int[]{0, 0}, new int[]{4, 2}));
        System.out.println(T.solution(new int[][]{{1, 0, 1, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 1, 0}, {1, 1, 0, 1, 1}, {0, 0, 0, 0, 0}}, new int[]{0, 3}, new int[]{4, 2}));
        System.out.println(T.solution(new int[][]{{0, 1, 0, 1, 0, 0}, {0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 1, 0}, {0, 1, 1, 0, 1, 1}, {0, 0, 0, 0, 0, 0}}, new int[]{0, 0}, new int[]{4, 5}));
        System.out.println(T.solution(new int[][]{{0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0}, {0, 1, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 1, 0, 0, 0, 0, 0}}, new int[]{0, 0}, new int[]{4, 3}));
    }
}
