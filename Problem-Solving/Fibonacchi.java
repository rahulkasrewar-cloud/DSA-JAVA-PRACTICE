
import java.util.Scanner;

public class Fibonacchi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   // adding of previous 2 numbers.

        System.out.println("Enter the number of terms : ");
        int n = scanner.nextInt();

        int a = 0 , b = 1 ;
        System.out.println("Fibonacchi Series : ");

        for (int i = 0 ; i < n ; i++) {
        System.out.println(a + " ");
        int next = a + b ;
        a=b;
        b=next;
        }
        System.out.println();
        scanner.close();
        
    } 
    
}
