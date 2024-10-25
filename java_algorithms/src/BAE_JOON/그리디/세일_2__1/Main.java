package BAE_JOON.그리디.세일_2__1;

import java.io.*;
import java.util.*;

/**
 * https://www.acmicpc.net/problem/11508
 *
 * 💥풀이
 * https://velog.io/@kjihye0340/%EB%B0%B1%EC%A4%80-11508-21%EC%84%B8%EC%9D%BC
 */
class Main {

    public static void solution(int n, long[] arr) throws IOException {








    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int N = Integer.parseInt(st.nextToken());
//
//        int[] arr = new int[N];
//        for (int i = 0; i < N; i++) {
//            st = new StringTokenizer(br.readLine());
//            arr[i] = Integer.parseInt(st.nextToken());
//        }

        int N = 4;
        int[] arr = new int[] {3, 2, 3, 2};

        solution2(N, arr);
    }




    /**
     * 정답
     */
    public static void solution2(int N, int[] arr) {

        Integer[] list = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(list, (a, b) -> b - a);

        int len = N / 3;
        int pos = 0;
        int sum = 0;
        for (int i = 0; i <= len; i++) {

            for (int j = 0; j < 3; j++) {
                if (j != 2 && pos < N) {
                    sum += list[pos];
                }
                pos++;
            }


        }

        System.out.println(sum);
    }

}