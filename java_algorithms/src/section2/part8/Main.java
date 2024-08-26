package section2.part8;

import java.util.Scanner;

public class Main {

    public String solution(String str) {

        String answer = "NO";

        str = str.toUpperCase().replaceAll("[^A-Z]]", "");
        String temp = new StringBuilder(str).reverse().toString();

        if (str.equals(temp)) {
            answer = "YES";
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