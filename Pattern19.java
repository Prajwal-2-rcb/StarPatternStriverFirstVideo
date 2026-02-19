public class Pattern19 {

    public static void printPattern(int n) {
        int inSpace=0;
        for (int i = 0; i <n ; i++) {
            for (int j = 1; j <=n-i ; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= inSpace; j++) {
                System.out.print(" ");

            }
            for (int j = 1; j <=n-i; j++) {
                System.out.print("*");
            }

            System.out.println();
            inSpace=inSpace+2;

        }
        inSpace=2*n-2;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= inSpace; j++) {
                System.out.print(" ");

            }
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }

            System.out.println();
            inSpace=inSpace-2;

        }

    }

    public static void main(String[] args) {
        int n=5;
        printPattern(n);
    }
}
