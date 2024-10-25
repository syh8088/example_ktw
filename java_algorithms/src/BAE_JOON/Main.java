package BAE_JOON;

import java.io.*;
import java.util.*;

/**
 *
 *
 * 💥풀이
 *
 */
class Main {

    public static void solution(int n, long[] arr) throws IOException {








    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());


        /**
         * 💥example>
         * 1
         * 5
         * 10
         * 50
         * 100
         */
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
        }

        /**
         * 💥example>
         * 1 5 10 50 100
         */
        int[] arr2 = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            arr2[i] = Integer.parseInt(st.nextToken());
        }

        solution2(N, K, arr);
    }

    /**
     * 정답
     */
    public static void solution2(int N, int K, int[] arr) {








    }

}