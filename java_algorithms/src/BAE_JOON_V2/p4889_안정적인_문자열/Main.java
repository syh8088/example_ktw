package BAE_JOON_V2.p4889_안정적인_문자열;

import java.io.*;
import java.util.*;

/**
 * https://www.acmicpc.net/problem/4889
 *
 * 💥풀이
 * https://cow-kite24.tistory.com/199
 */
class Main {

    public static void solution(int N, long[] arr) throws IOException {








    }

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int num = 1;

        while (true) {
            String str = sc.next(); // 문자열 입력

            if (str.contains("-")) { // 입력에 - 가 하나 이상 주어진다면 종료
                System.exit(0); //정상종료
            }

            solution2(num, str);
            num++;         // 다음 반복문 시작
        }
    }

    /**
     * 정답
     */
    public static void solution2(int num, String str) {

        // Stack 선언
        Stack<Character> stack = new Stack<>();

        int change = 0; // 바꾼 횟수

        for (int j = 0; j < str.length(); j++) { // 문자열을 문자로 접근 인덱스 0번부터
            if (str.charAt(j) == '{') { // 여는 괄호라면 스택에 push
                stack.push(str.charAt(j));
            }
            else { // 닫는 괄호라면?
                if (stack.isEmpty()) { // 스택이 비어있으면
                    stack.push('{'); // 닫는 괄호를 여는 괄호로 바꾸고 스택에 push
                    change++;             // 바꿨기 때문에 change ++
                }
                else if (stack.peek() == '{') { // 스택이 비어있지않고 맨 위가 여는 괄호라면
                    stack.pop(); // 짝이 지어지므로 여는괄호를 pop
                }
            }
        }

        System.out.println(num + ". " + ((stack.size() / 2) + change)); // change 횟수와 스택 길이의 반을 더한 값
        stack.clear(); // 다음을 위해 스택 비우기
    }

}