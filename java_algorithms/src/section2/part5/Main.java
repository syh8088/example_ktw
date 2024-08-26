package section2.part5;

import java.util.Scanner;

public class Main {

    public String solution(String str) {

        String answer = "";
        char[] charArray = str.toCharArray();
        int lt = 0, rt = charArray.length - 1;
        while (lt < rt) {
            if (!Character.isAlphabetic(charArray[lt])) lt++;
            else if (!Character.isAlphabetic(rt)) rt--;
            else {
                char temp = charArray[lt];
                charArray[lt] = charArray[rt];
                charArray[rt] = temp;

                lt++;
                rt--;
            }
        }

        return String.valueOf(charArray);
    }

    public static void main(String[] args) {

        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        T.solution(str);
    }
}