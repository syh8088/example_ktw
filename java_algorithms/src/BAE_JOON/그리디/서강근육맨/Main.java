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

    public static void solution(int n, long[] arr) throws IOException {








    }

    public static void main(String[] args) throws Exception {

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//
//        long[] arr = new long[n];
//        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//        for (int i = 0; i < n; i++) {
//            arr[i] = Long.parseLong(st.nextToken());
//        }

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long [] weight = new long[n];
        for(int i=0; i<n; i++){
            weight[i] = sc.nextLong();
        }
        solution2(n, weight);
    }

    /**
     * 정답
     */
    public static void solution2(int n, long[] arr) {

        long answer = Integer.MIN_VALUE;

//        Long[] list = Arrays.stream(arr).boxed().toArray(Long[]::new);
//        Arrays.sort(list, (a, b) -> Math.toIntExact( (long) b - (long) a));
        Arrays.sort(arr);

        int lt;
        int rt;
        if (n % 2 == 0) {

            lt = 0;
            rt = arr.length - 1;
        }
        else {
            long max = arr[n - 1];
            answer = max;
            lt = 0;
            rt = arr.length - 2;
        }

        while (lt <= rt) {
            long ltValue = arr[lt];
            long rtValue = arr[rt];

            answer = Math.max(ltValue + rtValue, answer);

            lt++;
            rt--;
        }


        System.out.println(answer);
    }
}