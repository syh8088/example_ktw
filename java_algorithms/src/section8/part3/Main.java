package section8.part3;

public class Main {

    public int DFS2(int n) {

        return 0;
    }


    public static void main(String[] args) {

        Main T = new Main();
        System.out.print(T.DFS(5));
    }

    /**
     *
     */
    public int DFS(int n) {

        if (n == 1) return 1;
        else {

            int target = DFS(n - 1);
            return target * n;
        }
    }


}