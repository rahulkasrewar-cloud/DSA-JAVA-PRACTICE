
public class Pattern3 {
    public static void main(String[] args) {
        PrintPattern(5);
    }
    static void PrintPattern(int n){
        for(int row = 0; row <= n; row++){
            for(int col = 0; col <= n; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
