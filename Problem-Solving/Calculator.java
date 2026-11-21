
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // System.out.println("Enter First Number: ");
        // double num1 = scanner.nextDouble();

        // System.out.println("Enter Second Number: ");
        // double num2 = scanner.nextDouble();

        // System.out.println("Enter operator ( +,-,*,/) : ");
        // char op = scanner.next().charAt(0);

        // if (op == '+'){
        //     System.out.println("Result: " + (num1 + num2));

        // } else if  (op == '-') {
        //     System.out.println("Result: " + (num1 - num2));

        // } else if ( op == '*') {
        //     System.out.println("Result : " + ( num1 * num2));

        // } else if ( op == '/') {
        //     if ( num2 != 0) {
        //         System.out.println("Result :" + ( num1 / num2));

        //     } else {
        //         System.out.println(" Error! Division By Zero.");
        //     }
        // }  else {
        //     System.out.println("Invalid Operator! ");
        // }
             

        // REBUILDING THE CALCULATOR.
        
        while (true) {
        System.out.println("Enter The first Number :");
        double num1 = scanner.nextDouble();

        System.out.println("Enter The Second Number :");
        double num2 = scanner.nextDouble();

        System.out.println("Enter Operator ( + , - , * , / ) or 'x' to exit the operation" );
        char op = scanner.next().charAt(0);

        if ( op == 'x'  || op == 'X') {
            System.out.println("Exiting Calculator, Goodbye");
            break;
        }
        if (op == '+') {
            System.out.println("Result" + (num1 + num2));
        } else if ( op == '-') {
            System.out.println("Result" + (num1 - num2));
        }else if ( op == '*') {
            System.out.println("Result" + (num1 * num2));
        }else if ( op == '/') {
            if (num2 != 0) {
                System.out.println("Result" + (num1 / num2));
            } else {
                System.out.println("Error");
            }
        } else {
            System.out.println("Invalid Operator !!");
        }
            }
            scanner.close();
        }
}
