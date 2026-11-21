
public class SimpleBinary {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 8, 9, 11, 14, 17, 19};
        int target = 5;
        int ans = simpleBinary(arr, target);
        System.out.println(ans);
    }
    static int simpleBinary(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while ( start <= end) {
            int mid = start + (end - start) / 2;

            if ( arr[mid] == target){
                return mid;
            } if ( isAsc){
                if( target < arr[mid]){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                } 
            } else {

        if (target > arr[mid]) {
        end = mid - 1;
        } else {
          start = mid + 1;
        }

        }
    }
     return -1;

}
    
}
