package section5.part1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public char solution2(int n, String target) {

        char answer = ' ';
        return answer;
    }


    public static void main(String[] args) {

        Main T = new Main();
        Scanner kb = new Scanner(System.in);

//        int n = kb.nextInt();
//        int k = kb.nextInt();
//        int[] arr = new int[n];
//
//        for (int i = 0; i < n; i++) {
//            arr[i] = kb.nextInt();
//        }
//        System.out.print(T.solution(n, k, arr));

        System.out.print(T.solution(15, "BACBACCACCBDEDE"));

    }

    public char solution(int n, String target) {

        char answer = ' ';

        Map<Character, Integer> map = new HashMap<>();

        char[] charArray = target.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int max = Integer.MIN_VALUE;
        for (char key : map.keySet()) {
            Integer cnt = map.get(key);
            if (cnt > max) {
                max = cnt;
                answer = key;
            }
        }

        return answer;
    }

}