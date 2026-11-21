
import java.util.Scanner;

public class SimpleIntrest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Principle Amount: ");
        double p = scanner.nextDouble();

        System.out.println("Enter Duration ( in years): ");
        double t = scanner.nextDouble();

        System.out.println("Enter Interest rate: ");
        double r = scanner.nextDouble();

        double simpleInterest = ( p*t*r )  / 100;
        System.out.println("simple Interest is: " + simpleInterest);
        scanner.close();

    }
    
}
