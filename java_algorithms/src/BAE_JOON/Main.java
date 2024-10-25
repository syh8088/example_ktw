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
        long K = Long.parseLong(st.nextToken());


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
    public static void solution2(int N, long K, int[] coin) {

        int count = 0;

        for (int i = N - 1; i >= 0; i--) {

            // 현재 동전의 가치가 K보다 작거나 같아야지 구성가능하다.
            int target = coin[i];
            if (target <= K) {
                // 현재 가치의 동전으로 구성할 수 있는 개수를 더해준다.
                count += (K / target);
                K = K % target;
            }
        }

        System.out.println(count);
    }

}