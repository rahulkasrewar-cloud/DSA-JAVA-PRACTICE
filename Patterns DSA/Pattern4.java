
public class Pattern4 {
    public static void main(String[] args) {
        PrintPattern(5);
    }
    static void PrintPattern(int n){
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= row; col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
