package BAE_JOON.투포인터.겹치는_건_싫어;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * https://www.acmicpc.net/problem/20922
 *
 * 💥풀이
 * https://ilmiodiario.tistory.com/156
 */
class Main {

    public static int solution(int n, int k, int[] arr) {

        int answer = 0;








        return answer;
    }

    /**
     * 정답
     */
    public static int solution2(int n, int k, int[] arr) {

        int answer = 0;
        int start = 0;
        int end = 0;
        int cnt[] = new int[100001];

        while (end < n) {
            while (end < n && cnt[arr[end]] + 1 <= k) {
                cnt[arr[end]]++;
                end++;
            }

            int len = end - start;
            answer = Math.max(answer, len);

            cnt[arr[start]]--;
            start++;
        }

        return answer;
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String[] s = br.readLine().split(" ");
//        int n = Integer.parseInt(s[0]);
//        int k = Integer.parseInt(s[1]);
//
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = Integer.parseInt(br.readLine());
//        }

        int n = 9;
        int k = 2;

        int[] arr = new int[] {3, 2, 5, 5, 6, 4, 4, 5, 7};

        System.out.println(solution2(n, k, arr));
    }

}