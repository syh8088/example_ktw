package BASE.section6.part4;

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

        System.out.print(T.solution("352+*9-"));
    }

    public int solution(String str) {

        Stack<Integer> stack = new Stack<>();

        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {

            char c = charArray[i];
            if (Character.isDigit(c)) { // 숫자
                stack.push(c - 48);
            }
            else {
                int rt = stack.pop();
                int lt = stack.pop();

                if (c == '+') {
                    stack.push(lt + rt);
                }
                else if (c == '-') {
                    stack.push(lt - rt);
                }
                else if (c == '*') {
                    stack.push(lt * rt);
                }
                else if (c == '/') {
                    stack.push(lt / rt);
                }
            }

        }

        return stack.get(0);
    }

}