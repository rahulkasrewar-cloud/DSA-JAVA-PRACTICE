
public class WorstCase {   // WorstCase of binary search 
    public static void main(String[] args) {  // time complexcity is O( log n ). SPACE COMPLEXITY ALSO SAME.

        int[] arr = {-12, -7, -3, 0, 3, 7, 8, 13, 16, 17, 19, 22}; // if you know the array is sorted.means A or D.
        int target = 17;
        int ans = worstcase(arr, target);
        System.out.println(ans);
    }
    static int worstcase(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while ( start <= end) {
            // FIND THE MIDDLE ELEMENT
            int mid = start + ( end - start ) / 2;

            if ( target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
         return -1;
    }
   
    
}
