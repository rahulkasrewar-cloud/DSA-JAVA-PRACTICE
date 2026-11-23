
import java.util.Arrays;

public class Q_Swap {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 8, 6, 2, 9};
        swap(arr, 0,3);

        System.out.println(Arrays.toString(arr));
        
    }
    
    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    
}
