/*package Recursion;

public class Recursion {

    private static void iterPrint(int i){
        while (i>=0) {
            System.out.print(i + " ");
            i--;
        }
    }

    private static void recuPrint(int i){
        if (i >= 0) {
            System.out.print(i + " ");
        i--;
        recuPrint(i);
        }
        System.out.println(" r:" + i);
    }

    //routes(o, x) = 1;
    //routs(y, 0) = 1;
    //routes(y, x) = routes(y - 1, x) + routes(y, x - 1);

    private static int routes(int y, int x){
        if (y == 0 || x == 0) return 1;
        return routes(y - 1, x) + routes(y, x - 1);
    }

    static int X = 8;
    static int Y = 8;
    static int QUEENS = 8;
    static int board[][] = new int[Y][X];

    static void init(){
        for (int i = 0; i < Y; i++) {
            for (int j = 0; j < X; j++) {
                board[i][j] = 0;
            }
        }
    }

    static void printBoard(){
        for (int i = 0; i < Y; i++) {
            for (int j = 0; j < X; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    /*private static boolean queens(int n){
        if (!checkBoard()) return false;
        if (n == QUEENS + 1) return true;

        for (int i = 0; i < Y; i++) {
            for (int j = 0; j < X; j++) {
                if (board[i][j] == 0)
                board[i][j] = n;
                queens(n + 1);
                if (queens(n + 1)) return  true;
                board[i][j] = 0;

            }
        }
    }

    public static void main(String[] args) {
        //iterPrint(5);
        //recuPrint(5);
        //basicRoutes();
        init();
        queens(1);
        printBoard();
    }

    private static void basicRoutes() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("%7d", routes(i, j));
            }
            System.out.println();
        }
    }
}
*/