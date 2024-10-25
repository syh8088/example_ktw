package BAE_JOON.투포인터.주몽;

import java.io.*;
import java.util.*;

/**
 * https://www.acmicpc.net/problem/1940
 *
 * 💥풀이
 * https://thaud153.tistory.com/84
 */
class Main {

    public static void solution(int N, int M, long[] arr) throws IOException {








    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

//        int N = 6;
//        int M = 9;
//        int[] arr = new int[] {2, 7, 4, 1, 5, 3};

        solution2(N, M, arr);
    }

    /**
     * 정답
     */
    public static void solution2(int N, int M, int[] arr) {

        int answer = 0;

        Arrays.sort(arr);
        int lt = 0;
        int rt = arr.length - 1;

        while (lt < rt) {

            int a = arr[lt];
            int b = arr[rt];
            int sum = a + b;
            if (sum == M) {
                answer++;
                rt--;
                lt++;
            }
            else if (sum < M) {
                lt++;
            }
            else if (sum > M) {
                rt--;
            }
        }

        System.out.println(answer);
    }

}