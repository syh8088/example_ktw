package section8.part4;

public class Main {

    public int DFS2(int n) {

        return 0;
    }


    public static void main(String[] args) {

        Main T = new Main();
        int n = 10;
        for (int i = 1; i <= n; i++) {
            System.out.print(T.DFS(i) + " ");
        }
    }

    /**
     * 재귀 함수로 풀어보기
     */
    public int DFS(int n) {

        if (n == 1) {
            return 1;
        }
        else if (n == 2) {
            return 1;
        }
        else {
            return DFS(n - 2) + DFS(n - 1);
        }
    }


}