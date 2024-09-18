package COMPANY_EMULSION.section7.part3;

import java.util.*;

class Solution {

    int answer = Integer.MAX_VALUE;
    int n;
    int m;
    int ch[];
    int a[];
    int b[];

    public int solution(int[][] cans) {



        n = cans.length;
        m = n / 2;
        ch = new int[n];
        a = new int[m];
        b = new int[m];

        DFS(0, 0, cans);

        return answer;
    }

    public void DFS(int L, int i, int[][] cans) {

        if (L == m) {

            ArrayList<Integer> A = new ArrayList<>();
            ArrayList<Integer> B = new ArrayList<>();
            for (int j = 0; j < ch.length; j++) {
                if (ch[j] == 1) {
                    A.add(j);
                }
                else {
                    B.add(j);
                }
            }

            int sumA = 0;
            int sumB = 0;
            for (int j = 0; j < ch.length / 2; j++) {

                int a1 = A.get(j);
                int b1 = B.get(j);
                int aValue = cans[a1][0];
                int bValue = cans[b1][1];
                sumA += aValue;
                sumB += bValue;

            }
            answer = Math.min(answer, Math.abs(sumA - sumB));
        }
        else {
            for (int j = i; j < n; j++) {
                ch[j] = 1;
                DFS(L + 1, j + 1, cans);
                ch[j] = 0;
            }
        }

    }



    public static void main(String[] args) {

        Solution T = new Solution();
        System.out.println(T.solution(new int[][]{
                {87, 84},
                {66, 78},
                {94, 94},
                {93, 87},
                {72, 92},
                {78, 63}
        }));
        System.out.println(T.solution(new int[][]{{10, 20}, {15, 25}, {35, 23}, {55, 20}}));
        System.out.println(T.solution(new int[][]{{11, 27}, {16, 21}, {35, 21}, {52, 21}, {25, 33},{25, 32}, {37, 59}, {33, 47}}));
    }
}
