package section5.part2;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public String solution2(String target1, String target2) {

        String answer = "YES";

        return answer;
    }


    public static void main(String[] args) {

        Main T = new Main();
        Scanner kb = new Scanner(System.in);

//        String a = kb.next();
//        String b = kb.next();
//        System.out.print(T.solution(a, b));

        System.out.print(T.solution("AbaAeCe", "baeeACA"));
    }

    public String solution(String target1, String target2) {

        String answer = "YES";

        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        char[] charArray1 = target1.toCharArray();
        char[] charArray2 = target2.toCharArray();

        for (int i = 0; i < charArray1.length; i++) {
            char c = charArray1[i];
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < charArray2.length; i++) {
            char c = charArray2[i];
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }

        for (char key : map1.keySet()) {
            Integer i = map1.get(key);
            Integer j = map2.get(key);

            if (!Objects.equals(i, j)) {
                answer = "NO";
                break;
            }
        }

        return answer;
    }

}