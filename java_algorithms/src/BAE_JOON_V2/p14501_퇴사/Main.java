package BAE_JOON_V2.p14501_퇴사;

import java.io.*;
import java.util.*;

/**
 * https://www.acmicpc.net/problem/14501
 *
 * 💥풀이
 *
 */
class Main {

    public static void solution(int N, List<Period> periods) {








    }

    static class Period implements Comparable<Period> {
        int T;
        int P;

        public Period(int t, int p) {
            T = t;
            P = p;
        }

        @Override
        public int compareTo(Period o) {
            if (o.P == this.P) {
                return this.T - o.T;
            }

            return o.P - this.P;
        }
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());

        List<Period> periods = new ArrayList<>();
        StringTokenizer st2;
        for (int i = 0; i < N; i++) {
            st2 = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st2.nextToken());
            int y = Integer.parseInt(st2.nextToken());
            periods.add(new Period(x, y));
        }

        solution2(N, periods);
    }

    /**
     * 정답
     */
    public static void solution2(int N, List<Period> periods) {

        int day = 0;
        int i = 0;
        int sum = 0;
        while (day < N) {

            Period period = periods.get(i);
            int t = period.T;
            day = day + t;
            i = i + t;

            if (day > N) {
                break;
            }

            sum += period.P;
        }

        System.out.println(sum);
    }

}