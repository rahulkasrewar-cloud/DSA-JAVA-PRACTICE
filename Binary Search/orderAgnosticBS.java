public class orderAgnosticBS {
    public static void main(String[] args) {
  //    int[] arr = {-12, -7, -3, 0, 3, 7, 8, 13, 16, 17, 19, 22};  // ASCENDING ORDER.
        int[] arr = { 99, 85, 76, 64, 51, 42, 38, 22, 10, - 4, -12}; // DECENDING ORDER.
        int target = 22;
        int ans = OrderAgnosticBS(arr, target);
        System.out.println(ans);
    }
    static int OrderAgnosticBS(int[] arr,int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

            while ( start <= end) {
            int mid = start + (end - start) / 2;

            if ( arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1 ;
                }else {
                    start = mid + 1;
                }
            } else {
            if (target > arr[mid]) {
                    end = mid - 1 ;
                }else {
                    start = mid + 1;
                }
        }
    }
     return -1;

    }
    
}
