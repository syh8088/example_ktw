package BASE.section5.part4;

import java.util.*;

public class Main {


    public int solution2(String s, String t) {

        int answer = 0;





        

        return answer;
    }



    public static void main(String[] args) {

        Main T = new Main();
        Scanner kb = new Scanner(System.in);

//        String a = kb.next();
//        String b = kb.next();
//        System.out.print(T.solution2(a, b));

        System.out.print(T.solution2("bacaAacba", "abc"));

    }

    public int solution(String a, String b) {

        int answer = 0;
        Map<Character, Integer> am = new HashMap<>();
        Map<Character, Integer> bm = new HashMap<>();

        for (char x : b.toCharArray()) {
            bm.put(x, bm.getOrDefault(x, 0) + 1);
        }

        int L = b.length() - 1;
        for (int i = 0; i < L; i++) {
            am.put(a.charAt(i), am.getOrDefault(a.charAt(i), 0) + 1);
        }

        int lt = 0;
        for (int rt = L; rt < a.length(); rt++) {
            am.put(a.charAt(rt), am.getOrDefault(a.charAt(rt), 0) + 1);
            if (am.equals(bm)) {
                answer++;
            }

            am.put(a.charAt(lt), am.get(a.charAt(lt)) - 1);
            if (am.get(a.charAt(lt)) == 0) {
                am.remove(a.charAt(lt));
            }

            lt++;
        }

        return answer;
    }


}