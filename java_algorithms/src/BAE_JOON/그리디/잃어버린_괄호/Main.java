package BAE_JOON.그리디.잃어버린_괄호;

import java.io.*;
import java.util.*;

/**
 * https://www.acmicpc.net/problem/1541
 *
 * 💥풀이
 * https://st-lab.tistory.com/148
 */
class Main {

    public static void solution() throws IOException {








    }

    public static void main(String[] args) throws Exception {

        solution2();
    }

    /**
     * 정답
     */
    public static void solution2() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = Integer.MAX_VALUE;	// 초기 상태 여부 확인을 위한 값으로 설정
        StringTokenizer subtraction = new StringTokenizer(br.readLine(), "-");

        while (subtraction.hasMoreTokens()) {
            int temp = 0;

            // 뺄셈으로 나뉜 토큰을 덧셈으로 분리하여 해당 토큰들을 더한다.
            StringTokenizer addition = new StringTokenizer(subtraction.nextToken(), "+");

            // 덧셈으로 나뉜 토큰들을 모두 더한다.
            while (addition.hasMoreTokens()) {
                temp += Integer.parseInt(addition.nextToken());
            }

            // 첫 번째토큰인 경우 temp값이 첫 번째 수가 됨
            if (sum == Integer.MAX_VALUE) {
                sum = temp;
            }
            else {
                sum = sum - temp;
            }
        }

        System.out.println(sum);
    }

}