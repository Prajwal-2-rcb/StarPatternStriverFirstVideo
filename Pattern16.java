public class Pattern16 {
    public static void printPattern(int n) {
        char ch='A';
        for (int i = 0; i <n ; i++) {
            if(i>0) {
                ch = (char) (ch + 1);
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(ch);


            }
            System.out.println();


        }
    }

    public static void printPattern2(int n) {
        for (int i = 0; i < n; i++) {
            char ch=(char)('A'+i);
            for (int j = 0; j <= i; j++) {
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
