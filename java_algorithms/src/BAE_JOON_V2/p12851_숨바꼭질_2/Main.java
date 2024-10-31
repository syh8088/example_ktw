package BAE_JOON_V2.p12851_숨바꼭질_2;

import java.io.*;
import java.util.*;

/**
 * https://www.acmicpc.net/problem/12851
 *
 * 💥풀이
 * https://dy-coding.tistory.com/entry/%EB%B0%B1%EC%A4%80-12851%EB%B2%88-%EC%88%A8%EB%B0%94%EA%BC%AD%EC%A7%88-2
 */
class Main {

    public static void solution2() {







    }

    static int count;
    static int N;
    static int K;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] time;
    static int min;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//        N = Integer.parseInt(br.readLine());
//        K = Integer.parseInt(br.readLine());

        N = 5;
        K = 17;

        time = new int[100001];
        count = 0;
        min = Integer.MAX_VALUE;

        solution();

        System.out.println(min);
        System.out.println(count);
    }

    /**
     * 정답
     */
    public static void solution() {

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(N);
        time[N] = 1;

        while (!queue.isEmpty()) {

            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int poll = queue.poll();

                for (int x : new int[] { poll - 1, poll + 1, poll * 2 }) {
                    if (x > 0 && x < 100001) {

                        if (x == K) {
                            min = time[poll];
                            count++;
                        }

                        // next에 처음 들어가면 offer해주고 next가 now보다 1시간이 더 걸리면
                        // 경우의 수가 추가될 수도 있으니 offer
                        if (time[x] == 0 || time[x] == time[poll] + 1) {
                            queue.offer(x);
                            time[x] = time[poll] + 1;
                        }
                    }
                }
            }
        }

    }



}