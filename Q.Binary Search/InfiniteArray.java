public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 8, 7, 4, 12, 14, 17, 19, 22, 25};
        int target = 12;
        System.out.println(ans(arr, target));
    }
    static int ans(int[] arr, int target) {
        // First find the range
        // First Start with a box of size 2.
        int start = 0;
        int end = 1;

        // Condition for the target to lie in the range.
        while ( target > arr[end]) {

            int temp = end + 1;  // This is my new start.
            end = end + ( end - start + 1) * 2;
            start = temp;
        }
        return binarySearch(arr, target, start, end);
    }
     static int binarySearch(int[] arr, int target, int start, int end) {

        while (start <= end) {
            int mid = start + ( end - start) / 2;

            if ( target < arr[mid]) {
                end = start - 1;
            } else if ( target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
