public class Pattern11 {

    public static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if((i+j)%2==0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    public static void printPatternWay2(int n) {
        int start;
        for (int i = 1; i <= n; i++) {
            if(i%2==0){
                start=0;
            }
            else{
                start=1;
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(start + " ");
                start=1-start;

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n=5;
        printPattern(n);
        printPatternWay2(n);

    }
}
