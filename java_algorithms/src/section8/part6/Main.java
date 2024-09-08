package section8.part6;

public class Main {

    static int n;
    static int[] ch;

    public void DFS2(int L) {







    }






    public static void main(String[] args) {

        Main T = new Main();

        n = 3;
        ch = new int[n + 1];
        T.DFS2(1);
    }


    public void DFS(int L) {

        if (L == n + 1) {

            String temp = "";
            for (int i = 1; i <= n; i++) {
                int target = ch[i];
                if (target == 1) {
                    temp += (i + " ");
                }
            }

            if (temp.length() > 0) {
                System.out.println(temp);
            }
        }
        else {
            ch[L] = 1; // 사용 한다는 의미
            DFS(L + 1);

            ch[L] = 0; // 사용 안한다는 의미
            DFS(L + 1);
        }
    }

}