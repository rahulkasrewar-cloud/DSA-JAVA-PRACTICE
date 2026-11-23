
import java.util.Scanner;
import java.util.Arrays;

public class Object {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //   for the Objects

        String[] str = new String[5];

        for ( int i = 0; i< str.length; i++) {
            str[i] = in.next();
            
        }

        str[2] = "Rahul";   // modifying the string or element
        System.out.println(Arrays.toString(str));
        in.close();

    }

}
