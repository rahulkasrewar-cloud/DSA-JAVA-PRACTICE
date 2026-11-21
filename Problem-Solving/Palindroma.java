
import java.util.Scanner;

public class Palindroma {
    public static void main(String[] args) {            // 1331 - Reversed: 1331 (Palindrome)
        Scanner scanner = new Scanner(System.in);       // 123 - Reversed: 321 (Not a palindrome)

        System.out.println("Enter the String : ");
        String text = scanner.nextLine();

        // Reverse the string using StringBuilder

        String Reversed = new StringBuilder(text).reverse().toString();

        if ( text.equals(Reversed)) {
            System.out.println(text + " is the Palindroma : ");
        }else {
            System.out.println(text + " is not Palindroma : ");
            scanner.close();

        }
    }
    
}
