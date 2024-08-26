package section2.part4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public ArrayList<String> solution(int n, String[] str) {

        ArrayList<String> answer = new ArrayList<>();
        for (String x : str) {
            char[] charArray = x.toCharArray();
            System.out.println("charArray = " + charArray);

            int lt = 0, rt = x.length() - 1;
            while (lt < rt) {
                char temp = charArray[lt];
                charArray[lt] = charArray[rt];
                charArray[rt] = temp;

                lt++;
                rt--;
            }
            String temp = String.valueOf(charArray);
            answer.add(temp);
        }

        return answer;
    }

    public static void main(String[] args) {

        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String[] strArrays = new String[n];
        for (int i = 0; i < n; i++) {
            strArrays[i] = kb.next();
        }

        for (String x : T.solution(n, strArrays)) {
            System.out.print(x);
        }
    }
}