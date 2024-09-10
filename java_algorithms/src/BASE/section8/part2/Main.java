package BASE.section8.part2;

public class Main {

    public void DFS2(int n) {

    }


    public static void main(String[] args) {

        Main T = new Main();
        T.DFS(11);
    }

    /**
     *
     */
    public void DFS(int n) {

       if (n == 0) return;
       else {
           DFS(n / 2);
           System.out.print(n % 2 + " ");
       }
    }


}