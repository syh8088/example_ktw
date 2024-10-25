package BAE_JOON.투포인터.블로그;

import java.io.*;
import java.util.*;

/**
 * https://www.acmicpc.net/problem/21921
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
        int X = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

//        int N = 5;
//        int X = 2;
//        int[] arr = new int[] {1, 4, 2, 5, 1};

//        int N = 7;
//        int X = 5;
//        int[] arr = new int[] {1, 1, 1, 1, 1, 5, 1};

//        int N = 5;
//        int X = 3;
//        int[] arr = new int[] {0, 0, 0, 0, 0};

        solution2(N, X, arr);
    }

    /**
     * 정답
     */
    public static void solution2(int N, int X, int[] arr) {

        int answer = 0;
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < X - 1; i++) {
           int target = arr[i];
           sum += target;
        }

        int lt = 0;
        for (int i = X - 1; i < N; i++) {
            int target = arr[i];
            sum += target;


            answer = Math.max(answer, sum);
            map.put(sum, map.getOrDefault(sum, 0) + 1);

            sum -= arr[lt];
            lt++;
        }

        if (answer == 0) {
            System.out.println("SAD");
        }
        else {
            System.out.println(answer);
            System.out.println(map.get(answer));
        }
    }

}