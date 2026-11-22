
public class Fibonachi {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(fib(n));
    }
    public static int fib(int n){

        if( n <= 1){
            return n;
        }
        int f0 = 0;
        int f1 = 1;

        for(int i = 2; i <= n; i++){
            int fn = f1 + f0;
            f0 = f1;
            f1 = fn;
        }
        return f1;
    }
}
