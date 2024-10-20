package BAE_JOON.문자열.듣보잡;

import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/1764
 */
class Main {

    public int solution(int n, int[][] arr) {

        int answer = 0;








        return answer;
    }

    public static void main(String[] args) throws Exception {

        Main T = new Main();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        int n = Integer.parseInt(inputs[0]);
        int m = Integer.parseInt(inputs[1]);

        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(br.readLine());
        }

        List<String> result = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            String temp = br.readLine();
            if (set.contains(temp)) {
                result.add(temp);
            }
        }

        Collections.sort(result);

        System.out.println(result.size());
        for (String s : result) {
            System.out.println(s);
        }
    }

    /**
     * 내가 풀어보기
     */
    public int solution2(int n, int[][] arr) {


        return 0;
    }
}