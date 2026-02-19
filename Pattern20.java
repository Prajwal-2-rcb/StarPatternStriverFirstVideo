public class Pattern20 {

    public static void printPattern(int n) {
        int inSpace=2*n-2;
        for (int i = 1; i <=(2*n)-1 ; i++) {

            int stars=i;
            if(i>n){
                stars=2*n-i;
            }
            for (int j = 1; j <=stars ; j++) {
                System.out.print("*");

            }
            for (int j = 1; j <=inSpace ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=stars ; j++) {
                System.out.print("*");
            }
            System.out.println();
            if(i<n){
                inSpace=inSpace-2;
            }
            else{
                inSpace=inSpace+2;
            }



        }
    }

    public static void main(String[] args) {
        int n=5;
        printPattern(n);

    }
}
