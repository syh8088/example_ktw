package COMPANY_EMULSION.section2.part4;

import java.util.*;

class Solution {

    public int[] solution2(int c, int r, int k) {

        int[] answer = new int[2];










        
        return answer;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        System.out.println(Arrays.toString(T.solution2(6, 5, 12)));
        System.out.println(Arrays.toString(T.solution2(6, 5, 20)));
        System.out.println(Arrays.toString(T.solution2(6, 5, 30)));
        System.out.println(Arrays.toString(T.solution2(6, 5, 31)));
    }


    int[] dx = {0, 1, 0, -1};
    int[] dy = {1, 0, -1, 0};

    public int[] solution(int c, int r, int k) {

        int[] answer = new int[2];
        if (k > c * r) {
            return new int[] {0, 0};
        }

        int[][] arr = new int[c][r];

        int d1 = 0;
        int count = 1;

        int x = 0;
        int y = 0;

        while (count < k) {

            int nx = x + dx[d1];
            int ny = y + dy[d1];

            if (nx < 0 || nx >= c || ny < 0 || ny >= r || arr[nx][ny] > 0) {
                d1 = (d1 + 1) % 4;
                continue;
            }

            arr[x][y] = count;
            count++;
            x = nx;
            y = ny;
        }

        answer[0] = x + 1;
        answer[1] = y + 1;

        return answer;
    }

}