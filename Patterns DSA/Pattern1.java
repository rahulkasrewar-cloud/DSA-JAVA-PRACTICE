
public class Pattern1 {
    public static void main(String[] args){
        PrintPattern(5);
    }
    static void PrintPattern(int n){
        for(int row = 1; row < n; row++){
            for(int col = 0; col < row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
