package COMPANY_EMULSION.section4.part4.solution;

import java.util.*;

class Solution {

    public int getTime(String time) {

        int H = Integer.parseInt(time.split(":")[0]);
        int M = Integer.parseInt(time.split(":")[1]);
        return H * 60 + M;
    }

    public int solution(int[] laser, String[] enter) {

        int answer = 0;
        int n = enter.length;
        int[][] inList = new int[n][2];

        for (int i = 0; i < n; i++) {

            String[] split = enter[i].split(" ");

            int a = getTime(split[0]);
            int b = Integer.parseInt(split[1]);

            inList[i][0] = a;
            inList[i][1] = b;
        }

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(inList[0][1]);
        int fT = inList[0][0];
        int pos = 1;

        for (int t = fT; t <= 1200; t++) {
            if (pos < n) {
                int target = inList[pos][0];
                if (t == target) {
                    if (queue.isEmpty() && target > fT) {
                        fT = target;
                    }
                    queue.offer(inList[pos][1]);
                    pos++;
                }
            }

            if (t == fT && !queue.isEmpty()) {
                int idx = queue.poll();
                fT += laser[idx];
            }

            answer = Math.max(answer, queue.size());
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        System.out.println(T.solution(new int[]{30, 20, 25, 15}, new String[] {
                "10:23 0", // 623 -> 653
                "10:40 3", // 640
                "10:42 2", // 642
                "10:52 3", // 652
                "11:10 2"  // 670
        }));
        System.out.println(T.solution(new int[]{30, 20, 25, 15}, new String[]{"10:23 0", "10:40 3", "10:42 2", "10:52 3", "15:10 0", "15:20 3", "15:22 1", "15:23 0", "15:25 0"}));
        System.out.println(T.solution(new int[]{30, 20, 25, 15}, new String[]{"10:20 1", "10:40 1", "11:00 1", "11:20 1", "11:40 1"}));
    }
}