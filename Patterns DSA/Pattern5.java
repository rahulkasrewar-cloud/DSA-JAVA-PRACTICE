
public class Pattern5 {
    public static void main(String[] args) {
        PrintPattern(5);
    }
    static void PrintPattern(int n){
        for( int row = 0; row <= 2 * n; row++){
            int TotalColInRow = row > n ? 2 * n - row : row ;
            for(int col = 0; col < TotalColInRow; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
