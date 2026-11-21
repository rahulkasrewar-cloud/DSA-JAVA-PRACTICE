public class Pattern6 {
    public static void main(String[] args) {
        printpattern(5);
    }
    static void printpattern(int n){
        for(int row = 1; row <= n ; row++){
            int totalspaces = n - row;
            
            for(int s = 1; s <= totalspaces; s++){
                System.out.print("  ");
            }
            for(int col = 1; col <= row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
