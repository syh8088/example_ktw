package BASE.section6.part5;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public int solution2(String str) {

        int answer = 0;

        return answer;
    }

    public static void main(String[] args) {

        Main T = new Main();
        Scanner kb = new Scanner(System.in);

//        String str = kb.next();
//        System.out.print(T.solution(str));

        System.out.print(T.solution2("()(((()())(())()))(())"));
    }

    public int solution(String str) {

        int answer = 0;

        Stack<Character> stack = new Stack<>();

        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {

            char c = charArray[i];

            if (c == '(') {
                stack.push(c);
            }
            else {
                stack.pop();
                if (charArray[i - 1] == '(') { // 레이저 지점
                    answer += stack.size();
                }
                else { // 막대기 끝
                    answer++;
                }
            }
        }

        return answer;
    }

}