
import java.util.Scanner;
import java.util.Arrays;

public class Inputs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int[] arr = new int[5];
        
        arr [0] = 23;
        arr [1] = 45;
        arr [2] = 105;
        arr [3] = 233;
        arr [4] = 456;

        // internaly its working like this { 23, 45, 105, 233, 456}

        // input using for loop

        for ( int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        in.close();

    }
    
}
