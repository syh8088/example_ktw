package COMPANY_EMULSION.section8.part2.solution;

import java.util.*;

class Solution {

    public int solution(int[] pool, int a, int b, int home) {

        int[][] ch = new int[2][10001];
        for (int x : pool) {
            ch[0][x] = 1;
            ch[1][x] = 1;
        }

        Queue<int[]> queue = new LinkedList<>();
        ch[0][0] = 1;
        ch[1][0] = 1;
        queue.offer(new int[]{0, 0});

        int L = 0;
        while (!queue.isEmpty()) {

            int len = queue.size();
            for (int i = 0; i < len; i++) {
                int[] target = queue.poll();

                if (target[0] == home) {
                    return L;
                }

                int nx = target[0] + a;
                if (nx <= 10001 && ch[0][nx] == 0) {
                    ch[0][nx] = 1;
                    queue.offer(new int[]{nx, 0});
                }

                nx = target[0] - b;
                if (nx >= 0 && ch[1][nx] == 0 && target[1] == 0) {
                    ch[1][nx] = 1;
                    queue.offer(new int[]{nx, 1});
                }
            }

            L++;
        }

        return -1;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        System.out.println(T.solution(new int[]{11, 7, 20}, 3, 2, 10));
        System.out.println(T.solution(new int[]{1, 15, 11}, 3, 2, 5));
        System.out.println(T.solution(new int[]{9, 15, 35, 30, 20}, 2, 1, 25));
        System.out.println(T.solution(new int[]{5, 12, 7, 19, 23}, 3, 5, 18));
        System.out.println(T.solution(new int[]{10, 15, 20}, 3, 2, 2));
    }
}