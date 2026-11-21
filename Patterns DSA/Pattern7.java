public class Pattern7 {
    public static void main(String[] args) {
        printpattern(5);
    }
    static void printpattern(int n){
        for(int row = 0; row < n ; row++){
            int totalcol = n - row;
            int totalspace = n - totalcol;

            for( int s = 0; s < totalspace; s++){
                System.out.print(" ");
            }
            for(int col = 0; col < totalcol; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
