public class Pattern12 {
    public static void main(String[] args) {
        printpattern(5);
    }
    static void printpattern(int n){
        for(int row = n; row >= 1; row--){
            for(int s = 0; s <= n - row; s++){
                System.out.print(" ");
            }
            if( row == 1 ){
                System.out.print("*");
            } else if(row == n){
                for(int i = 0; i < 2 * n - 1; i++){
                    System.out.print("*");
                }
            } else {
                System.out.print("*");
                for(int sp = 1; sp <= 2 * row - 3; sp++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
