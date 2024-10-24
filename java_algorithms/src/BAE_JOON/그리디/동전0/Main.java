package BAE_JOON.그리디.동전0;

import java.io.*;
import java.util.*;

/**
 * https://www.acmicpc.net/problem/11047
 *
 * 💥풀이
 * https://st-lab.tistory.com/143
 */
class Main {

    public static void solution(int n, long[] arr) throws IOException {








    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//        int N = Integer.parseInt(st.nextToken());
//        long K = Long.parseLong(st.nextToken());
//
//        int[] arr = new int[N];
//        for (int i = 0; i < N; i++) {
//            st = new StringTokenizer(br.readLine());
//            arr[i] = Integer.parseInt(st.nextToken());
//        }

        int N = 10;
        long K = 4200;
        int[] arr = new int[] {1, 5, 10, 50, 100, 500, 1000, 5000, 10000, 50000};

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