
import java.util.Scanner;

public class CurrencyConvert {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        System.out.println("Enter Amount In Rupees (INR): " );
        double rupees = scanner.nextDouble();

        // Assuming an exchange rate of 1 USD = 83 INR

        double usd = rupees / 83 ;
        System.out.printf("Amount in USD: $%.2f\n", usd);
        scanner.close();

    }
    
}
