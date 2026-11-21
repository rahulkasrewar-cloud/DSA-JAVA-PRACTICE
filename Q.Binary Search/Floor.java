public class Floor {
    public static void main(String[] args) {
        int[] arr = {-12, -7, -3, 0, 3, 7, 8, 13, 16, 17, 19, 22}; 
        int target = 18;
        int ans = floor(arr, target);
        System.out.println(ans);
    }
    static int floor(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

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
        return end;
    }
    
}
