package section2.part9;

import java.util.Scanner;

public class Main {

    public int solution(String str) {

        String answer = "";

        for (char c : str.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                answer += c;
            }
        }

        return Integer.parseInt(answer);
    }

    public static void main(String[] args) {

        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.print(T.solution(str));
    }
}