package COMPANY_EMULSION.section2.part7;

import java.util.*;

class Solution {

    public int solution(int[] keypad, String password) {

        int answer = 0;

        int[] dx = {0, 1, 1, 1, 0, -1, -1, -1};
        int[] dy = {-1,-1, 0, 1, 1, 1, 0, -1};


        int[][] dist = new int[keypad.length][keypad.length];
        int[][] pad = new int[3][3];
        int i = 0;
        int j = 0;
        for (int target : keypad) {
            pad[j][i] = target;
            i++;

            if (i % 3 == 0) {
                i = 0;
                j++;
            }
        }

        int d = 0;
        for (int e = 0; e < 3; e++) {
            for (int k = 0; k < 3; k++) {

//                d = (d + 1) % 8;
                for (int q = 0; q < 8; q++) {

                    int dx1 = e + dx[q];
                    int dy1 = k + dy[q];

                    if (dx1 < 0 || dx1 > pad.length || dy1 < 0 || dy1 > pad.length) {
                        continue;
                    }

                    dist[pad[e][k]][pad[dx1][dy1]] = 1;
                }
            }
        }



        return answer;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        System.out.println(T.solution(new int[] {
                2, 5, 3,
                7, 1, 6,
                4, 9, 8
        }, "7596218"));
        System.out.println(T.solution(new int[]{1, 5, 7, 3, 2, 8, 9, 4, 6}, "63855526592"));
        System.out.println(T.solution(new int[]{2, 9, 3, 7, 8, 6, 4, 5, 1}, "323254677"));
        System.out.println(T.solution(new int[]{1, 6, 7, 3, 8, 9, 4, 5, 2}, "3337772122"));
    }
}