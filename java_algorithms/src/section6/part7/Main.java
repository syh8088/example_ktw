package section6.part7;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public String solution2(String a, String b) {

        String answer = "YES";

        return answer;
    }


    public static void main(String[] args) {

        Main T = new Main();
        Scanner kb = new Scanner(System.in);

//        String a = kb.next();
//        String b = kb.next();
//        System.out.print(T.solution(a, b));

        System.out.print(T.solution("CBA", "CBDAGE"));
    }

    /**
     *
     */
    public String solution(String a, String b) {

        String answer = "YES";

        Queue<Character> aQueue = new LinkedList<>();

        for (char c : a.toCharArray()) {
            aQueue.offer(c);
        }

        for (char c : b.toCharArray()) {
            if (aQueue.isEmpty()) return answer;
            if (aQueue.contains(c) && aQueue.peek() == c) {
                aQueue.poll();
            }
        }

        if (!aQueue.isEmpty()) {
            answer = "NO";
        }

        return answer;
    }

    public String solution3(String a, String b) {
        
        String answer = "YES";

        Queue<Character> aQueue = new LinkedList<>();

        for (char c : a.toCharArray()) {
            aQueue.offer(c);
        }

        for (char c : b.toCharArray()) {
            if (aQueue.contains(c) && aQueue.peek() != c) {
                return "NO";
            }
        }

        if (!aQueue.isEmpty()) {
            answer = "NO";
        }

        return answer;
    }
}