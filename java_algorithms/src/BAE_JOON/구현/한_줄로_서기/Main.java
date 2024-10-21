package BAE_JOON.구현.한_줄로_서기;

import java.io.*;
import java.util.*;

/**
 * https://www.acmicpc.net/problem/1138
 *
 * 💥풀이
 * https://dy-coding.tistory.com/entry/%EB%B0%B1%EC%A4%80-1138%EB%B2%88-%ED%95%9C-%EC%A4%84%EB%A1%9C-%EC%84%9C%EA%B8%B0-java
 */
class Main {

    public static int[] solution(int n, int[] arr) {

        int answer = 0;

        return null;
    }

    /**
     * 정답
     */
    public static int[] solution2(int n, int[] intArr) {

        int[] answer = new int[n + 1];

        // i는 intArr[i]번 인덱스를 의미, j는 intArr[i]가 들어갈 자리
        for (int i = 1; i <= n; i++) {
            int j = 1;

            while (true) {
                if (intArr[i] == 0 && answer[j] == 0) {
                    answer[j] = i;
                    break;
                }
                else if (answer[j] == 0) {
                    intArr[i]--;
                }

                //answer[j] == 0에도 j++해주는 이유는
                //intArr[i] != 0 && answer[j] == 0일 때 j번 자리는 비어있지만
                //intArr[i]가 0이 아니면 그 왼쪽에 자신보다 큰 수가 와야하기 때문에
                //한 칸 옆으로 이동해준다.
                j++;
            }
        }

        return answer;
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//        int n = Integer.parseInt(br.readLine());
//
//        int[] arr = new int[n];
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        for(int i = 0; i < n; i++) {
//            arr[i] = Integer.parseInt(st.nextToken());
//        }

        int n = 4;
        int[] arr = new int[] {0, 2, 1, 1, 0};


        for (int x : solution2(n, arr)) {
            System.out.print(x + " ");
        }
    }

}