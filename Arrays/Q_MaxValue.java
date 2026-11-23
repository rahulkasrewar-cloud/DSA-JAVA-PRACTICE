
public class Q_MaxValue {
    public static void main(String[] args) {

        int[] arr = { 1, 3, 24, 6, 9};
        System.out.println(maxRange(arr, 1,3));
        
    }

     static int maxRange ( int[] arr, int start , int end) {
        int maxval = arr[start] ;
        for ( int i = start; i <= end; i++) {

            if ( arr[i] > maxval) {
                maxval = arr[i];

        }
    }
      return maxval;
}

}

    // static int max ( int[] arr) {
    //     int maxval = arr[0] ;
    //     for ( int i = 0; i < arr.length; i++) {

    //         if ( arr[i] > maxval) {
    //             maxval = arr[i];
    //         }
    //       }
    //        return maxval;
    //     }
    
        

       

