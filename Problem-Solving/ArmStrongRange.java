
import java.util.Scanner;

public class ArmStrongRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);       // a number that is equal to the sum of its own digits,
        System.out.println("Enter Starting Number :"); //  where each digit is raised to the power of the total number of digits in that number.
        int start = scanner.nextInt();

        System.out.println("Enter Ending Number : ");
        int end = scanner.nextInt();

        System.out.println(" ArmStrong Number between " + start + " and " + end + " : ");

        for ( int num = start ; num <= end ; num++) {
            String numStr = String.valueOf(num);
            int power = numStr.length();
            int total = 0;

            int temp = num ;
            while ( temp > 0){
                int digit = temp % 10;
                total += Math.pow(digit,power);
                temp /= 10;
            }
            if ( total == num) {
            System.out.print(num + " ");
            }
        }
        System.out.println();
        scanner.close();
    }
    
}
