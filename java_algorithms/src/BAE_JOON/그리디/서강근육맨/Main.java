package BAE_JOON.그리디.서강근육맨;

import java.io.*;
import java.util.*;

/**
 * https://www.acmicpc.net/problem/20300
 *
 * 💥풀이
 *
 */
class Main {

    public static void solution(int n, int[] arr) throws IOException {








    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        long[] arr = new long[n];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        solution2(n, arr);
    }

    /**
     * 정답
     */
    public static void solution2(int n, long[] arr) {

        long answer = Integer.MIN_VALUE;

        Long[] list = Arrays.stream(arr).boxed().toArray(Long[]::new);
        Arrays.sort(list, (a, b) -> Math.toIntExact(b - a));

        int lt;
        int rt;
        if (n % 2 == 0) {

            lt = 0;
            rt = list.length - 1;
        }
        else {
            long max = list[0];
            answer = max;
            lt = 1;
            rt = list.length - 1;
        }

        while (lt <= rt) {
            long ltValue = list[lt];
            long rtValue = list[rt];

            answer = Math.max(ltValue + rtValue, answer);

            lt++;
            rt--;
        }


        System.out.println(answer);
    }
}