
import java.util.Scanner;

public class CheckNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 134353637;
        
        int count = 0;
    
        while ( n > 0) {
            int rem = n % 10 ;
            if ( rem == 3) {
                count++;
            }
            n = n / 10;
        }
        System.out.println(count);
        scanner.close();
    }
}
