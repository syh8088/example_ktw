package section2;

import java.util.Scanner;

public class Main {

    public String solution(String str) {

        String answer = "";

        char[] charArray = str.toCharArray();
        for (char c : charArray) {
            if (Character.isLowerCase(c)) {
                answer += Character.toUpperCase(c);
            }
            else {
                answer += Character.toLowerCase(c);
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        String str = kb.next();

        System.out.print(T.solution(str));
    }
}