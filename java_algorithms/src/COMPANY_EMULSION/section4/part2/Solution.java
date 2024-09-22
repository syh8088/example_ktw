package COMPANY_EMULSION.section4.part2;

import java.util.*;

class Solution {

    public String solution2(String s) {

        String answer = "";

        Stack<String> stack = new Stack<>();
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (c == ')') {
                String temp = "";
                while (!stack.isEmpty() && !Character.isDigit(stack.peek().charAt(0))) {
                    String pop = stack.pop();
                    if (Character.isAlphabetic(pop.charAt(0))) {
                        temp =  pop + temp;
                    }
                }

                if (stack.isEmpty()) {
                    stack.push(temp);
                }
                else {
                    String pop = stack.pop();
                    if (Character.isDigit(pop.charAt(0))) {
                        String res = "";
                        int i1 = Integer.parseInt(pop);
                        for (int i2 = 0; i2 < i1; i2++) {
                            res += temp;
                        }

                        if (!res.isEmpty()) {
                            stack.push(res);
                        }
                    }
                }


            }
            else {
                stack.push(String.valueOf(c));
            }
        }

        for (String x : stack) {
            answer += x;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        System.out.println(T.solution2("3(a2(b))ef"));
        System.out.println(T.solution2("2(ab)k3(bc)"));
        System.out.println(T.solution2("2(ab3((cd)))"));
        System.out.println(T.solution2("2(2(ab)3(2(ac)))"));
        System.out.println(T.solution2("3(ab2(sg))"));
    }

    public String solution(String s) {

        String answer = "";



        return answer;
    }
}