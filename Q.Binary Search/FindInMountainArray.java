
public class FindInMountainArray {
    public static void main(String[] args) {
        
        
    }
    int search(int[] arr, int target) {
        int peak = peakIndexinMountainArray(arr);
        int firstTry = OrderAgnosticBS(arr, target, 0, peak);
        if (firstTry != -1) {
            return firstTry;
        }
        // Try to search in second half

        return OrderAgnosticBS(arr, target, peak+1, arr.length - 1);
    }
    public int peakIndexinMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + ( end - start) / 2;

            if ( arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
         return start;
    }
     static int OrderAgnosticBS(int[] arr,int target, int start, int end) {

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
