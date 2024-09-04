package section6.part2;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public String solution2(String str) {

        String answer = "";

        return answer;
    }


    public static void main(String[] args) {

        Main T = new Main();
        Scanner kb = new Scanner(System.in);

//        String str = kb.next();
//        System.out.print(T.solution(str));

        System.out.print(T.solution2("(A(BC)D)EF(G(H)(IJ)K)LM(N)"));
    }

    public String solution(String str) {

        StringBuilder answer = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        char[] charArray = str.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];

            if (c == '(') {
                stack.push(c);
            }
            else if (c == ')') {
                while (!stack.peek().equals('(')) {
                    stack.pop();
                }
                stack.pop();
            }
            else {

                if (stack.isEmpty()) {
                    answer.append(c);
                }
                else {
                    stack.push(c);
                }
            }
        }

        return answer.toString();
    }

}