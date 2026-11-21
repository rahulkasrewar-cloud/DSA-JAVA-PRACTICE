public class Pattern28 {
    public static void main(String[] args) {
        PrintPattern(5);
    }
     static void PrintPattern(int n){

        for( int row = 0; row <= 2 * n; row++){
            
            int TotalColInRow = row > n ? 2 * n - row : row ;
            int Spaces = n - TotalColInRow;

            for(int s = 0; s < Spaces; s++){
                System.out.print(" ");
            }
            for(int col = 0; col < TotalColInRow; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
