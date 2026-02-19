public class Pattern18 {

    public static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            char ch = 'E';
            for (int j = 1; j <= i; j++) {
                System.out.print((char)(ch-i+1));
                ch++;

            }
            System.out.println();
        }

    }

    public static void printPattern2(int n) {
        for (int i = 1; i <= n; i++) {
            for (char ch = (char)(('E' - i) + 1); ch <= 'E'; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n=5;
        printPattern(n);
        printPattern2(n);
    }
}
