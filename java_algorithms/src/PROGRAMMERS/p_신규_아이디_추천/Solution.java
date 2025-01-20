package PROGRAMMERS.p_신규_아이디_추천;

class Solution {

    public String solution2(String new_id) {

        String answer = "";





        return answer;
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        System.out.println(solution.solution2("...!@BaT#*..y.abcdefghijklm")); // "bat.y.abcdefghi"
        System.out.println(solution.solution2("z-+.^.")); // "z--"
        System.out.println(solution.solution2("=.=")); // "aaa"
        System.out.println(solution.solution2("123_.def")); // "123_.def"
        System.out.println(solution.solution2("abcdefghijklmn.p")); // "abcdefghijklmn"
    }


    public String solution(String new_id) {

        String answer = "";

        // 1 단계
        new_id = new_id.toLowerCase();

        // 2 단계
        String newString = "";
        for (char c : new_id.toCharArray()) {
            if (Character.isAlphabetic(c) || Character.isDigit(c) || c == '-' || c == '_' || c == '.') {
                newString += c;
            }
        }
        new_id = newString;

        // 3 단계
        int cnt = 0;
        StringBuilder newChar = new StringBuilder();
        for (char c : new_id.toCharArray()) {
            if (c == '.') {
                cnt++;
                if (cnt > 1) {
                    continue;
                }
            }
            else {
                cnt = 0;
            }

            newChar.append(c);
        }

        new_id = newChar.toString();

        // 4 단계
        if (new_id.length() > 0 && new_id.charAt(0) == '.') {
            new_id = new_id.substring(1);
        }

        if (new_id.length() > 0 && new_id.charAt(new_id.length() - 1) == '.') {
            new_id = new_id.substring(0, new_id.length() - 1);
        }

        // 5 단계
        if (new_id == null || new_id.length() == 0) {
            new_id = "a";
        }

        // 6 단계
        if (new_id.length() > 15) {
            new_id = new_id.substring(0, 15);
        }

        if (new_id.charAt(new_id.length() - 1) == '.') {
            new_id = new_id.substring(0, new_id.length() - 1);
        }

        // 7 단계
        if (new_id.length() <= 2) {
            char end = new_id.charAt(new_id.length() - 1);

            while (new_id.length() <= 2) {
                new_id += end;
            }
        }


        return new_id;
    }
}