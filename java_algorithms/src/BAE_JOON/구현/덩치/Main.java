package BAE_JOON.구현.덩치;

import java.io.*;
import java.util.*;

/**
 * https://www.acmicpc.net/problem/7568
 *
 * 💥풀이
 * https://dev-taerin.tistory.com/32
 */
class Main {

    public static void solution2(int p, int m, int[] lArray, String[] nArray) {













    }

    /**
     * 정답
     */
    public static void solution(int n, int weight[], int height[]) {

        int[] rank = new int[n];

        for (int i = 0; i < n; i++) {
            int targetWeight = weight[i];
            int targetHeight = height[i];

            int count = 1;
            for (int j = 0; j < n; j++) {

                if (i == j) {
                    continue; // 본인과 비교 X
                }

                int comTargetWeight = weight[j];
                int comTargetHeight = height[j];
                if (targetWeight < comTargetWeight && targetHeight < comTargetHeight) {
                    count++;
                }
            }
            rank[i] = count;
        }

        for (int r : rank) {
            System.out.print(r + " ");
        }
    }


    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int weight[] = new int[n];  // 몸무게
        int height[] = new int[n];  // 키

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            weight[i] = Integer.parseInt(st.nextToken());
            height[i] = Integer.parseInt(st.nextToken());
        }


//        int n = 5;
//        int weight[] = new int[] { 55, 58, 88, 60, 46 };  // 몸무게
//        int height[] = new int[] { 185, 183, 186, 175, 155 };  // 키

        solution(n, weight, height);
    }

}