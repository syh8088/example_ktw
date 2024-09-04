package section6.part1;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public String solution2(String str) {

        String answer = "YES";

        return answer;
    }


    public static void main(String[] args) {

        Main T = new Main();
        Scanner kb = new Scanner(System.in);

//        String str = kb.next();
//        System.out.print(T.solution(str));

        System.out.print(T.solution2("(()(()))(()")); // NO
//        System.out.print(T.solution2("(())()")); // YES
    }

    public String solution(String str) {

        Stack<Character> stack = new Stack<>();

        char[] charArray = str.toCharArray();

        stack.add(charArray[0]);
        for (int i = 1; i < charArray.length; i++) {
            char c = charArray[i];
            if (c == '(') {
                stack.push(c);
            }
            else {
                if (stack.empty()) return "NO";
                stack.pop();
            }
        }

        return (stack.empty()) ? "YES" : "NO";
    }

}