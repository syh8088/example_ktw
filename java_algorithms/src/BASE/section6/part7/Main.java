package BASE.section6.part7;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public String solution4(String a, String b) {

        String answer = "YES";



        

        return answer;
    }


    public static void main(String[] args) {

        Main T = new Main();
        Scanner kb = new Scanner(System.in);

//        String a = kb.next();
//        String b = kb.next();
//        System.out.print(T.solution(a, b));

        System.out.print(T.solution2("CBA", "CBDAGE"));
    }

    /**
     * 내가 풀어본거
     */
    public String solution2(String a, String b) {

        String answer = "YES";

        HashMap<Character, Integer> map = new HashMap<>();
        char[] charArray = a.toCharArray();
        for (char c : charArray) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        char[] charArray1 = b.toCharArray();
        Queue<Character> queue = new LinkedList<>();
        for (char c : charArray1) {
            if (map.containsKey(c)) {
                queue.offer(c);
            }
        }

        String test = "";
        while (!queue.isEmpty()) {
            Character c = queue.poll();
            test += c;
        }

        return (test.equals(a)) ? "YES" : "NO";
    }

    /**
     * 문제 해설용
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