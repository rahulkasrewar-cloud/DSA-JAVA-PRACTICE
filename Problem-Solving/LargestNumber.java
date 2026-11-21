
import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // System.out.println("Enter First Number:");
        // double a = scanner.nextDouble();

        // System.out.println("Enter Second Number:");
        // double b = scanner.nextDouble();

        // if ( a > b ) {
        //     System.out.println( a + "is the largest number ");
        // } else if (b > a ) {
        //     System.out.println(b + "is the largest number ");
        // } else {
        //     System.out.println("Both Numbers Are Equal ");
        // }
        // scanner.close();


        //  Q. find the largest number from the 3 numbers.

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        
        int max = a ;
        if ( b > max) {
            max = b;
        }
        if ( c > max) {
            max = c ;
        }
        System.out.println(max);
        in.close();
    }
    
}
