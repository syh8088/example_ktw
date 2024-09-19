package COMPANY_EMULSION.section8.part2;

import java.util.*;

class Solution {

    public int solution2(int[] pool, int a, int b, int home) {

        int answer = 0;




        return answer;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        System.out.println(T.solution(new int[]{11, 7, 20}, 3, 2, 10));
        System.out.println(T.solution(new int[]{1, 15, 11}, 3, 2, 5));
        System.out.println(T.solution(new int[]{9, 15, 35, 30, 20}, 2, 1, 25));
        System.out.println(T.solution(new int[]{5, 12, 7, 19, 23}, 3, 5, 18));
        System.out.println(T.solution(new int[]{10, 15, 20}, 3, 2, 2));
    }

    public int solution(int[] pool, int a, int b, int home) {

        int answer = 0;

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(0);
        int L = 0;
        int ch[] = new int[home];
        while (!queue.isEmpty()) {

            for (int i = queue.size(); i > 0; i--) {
                int poll = queue.poll();
                if (poll == home - 1) {
                  return L + 1;
                }

//                for (int j = 0; j < 2; j++) {
                    int newA = poll + a;
                    int newB = poll - b;

                    if (newA >= 0 && newA < home - 1 && ch[newA] == 0) {
                        queue.offer(newA);
                        ch[newA] = 1;
                    }

                    if (newB >= 0 && newA < home - 1 && ch[newB] == 0) {
                        queue.offer(newB);
                        ch[newB] = 1;
                    }

//                }

            }
            L++;
        }


        return -1;
    }

}