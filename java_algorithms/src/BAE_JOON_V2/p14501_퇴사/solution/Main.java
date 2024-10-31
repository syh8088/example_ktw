package BAE_JOON_V2.p14501_퇴사.solution;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


/**
 * https://velog.io/@yoonuk/%EB%B0%B1%EC%A4%80-14501-%ED%87%B4%EC%82%AC-Java%EC%9E%90%EB%B0%94
 */
public class Main {

    /**
     * 백준 15486 퇴사2 (https://www.acmicpc.net/problem/15486)
     */
    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

//        int n = Integer.parseInt(reader.readLine());
//
//        int[] t = new int[n];
//        int[] p = new int[n];
//
//        StringTokenizer st;
//        for (int i = 0; i < n; i++) {
//            st = new StringTokenizer(reader.readLine());
//
//            t[i] = Integer.parseInt(st.nextToken());
//            p[i] = Integer.parseInt(st.nextToken());
//        }

        int n = 7;
        int[] t = new int[] {0, 3, 5, 1, 1, 2, 4, 2};
        int[] p = new int[] {0, 10, 20, 10, 20, 15, 40, 200};

        //dp : N일에 얻을 수 있는 최대 수익
        int[] dp = new int[n + 2];


        for (int i = n; i > 0; i--) {
            int next = i + t[i]; // 다음 날짜

            if (next > n + 1) { // 일할 수 있는 날짜를 넘어가는 경우
                // 일을 하지 못하므로 바로 다음 DP값(더 앞쪽의 날짜)로 설정
                dp[i] = dp[i + 1];
            }
            else { // 일할 수 있는 날짜인 경우
                // 1. 일하지 않았을 때(DP[i + 1])
                // 2. 일 했을 때 총 벌 수 있는 금액(P[i] + DP[next])
                // 위 두 경우 중 더 큰 값을 DP에 넣어준다.
                dp[i] = Math.max(dp[i + 1], p[i] + dp[next]);
            }
        }

        System.out.println(dp[1]);

    }//main
}//Resign2

