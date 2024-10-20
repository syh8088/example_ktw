package BAE_JOON.그리디.회의실_배정;

import java.io.*;
import java.util.*;

/**
 * https://www.acmicpc.net/problem/1931
 *
 * 💥풀이
 * https://st-lab.tistory.com/145
 */
class Main {

    public static int solution(int n, int[][] time) {

        int answer = 0;

        Arrays.sort(time, (a, b) -> a[1] == b[1] ? a[0] - b[0] : a[1] - b[1]);

        int endTime = 0;
        for (int i = 0; i < time.length; i++) {
            int[] ints = time[i];
            int start = ints[0];
            int end = ints[1];

            if (endTime <= start) {
                answer++;
                endTime = end;
            }
        }

        return answer;
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;

        int[][] time = new int[n][2];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            time[i][0] = Integer.parseInt(st.nextToken());	// 시작시간
            time[i][1] = Integer.parseInt(st.nextToken());	// 종료시간
        }

        System.out.println(solution(n, time));
    }

    /**
     * 내가 풀어보기
     */
    public int solution2(int n, int[][] arr) {


        return 0;
    }
}