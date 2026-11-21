
public class RotatedArray {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target = 7;
        int ans = Rotated(arr, target);
        System.out.println(ans);
    }
      static int Rotated(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // If target is found, return its index
            if (nums[mid] == target) {
                return mid;
            }
            // Check if the left half is sorted
            if (nums[start] <= nums[mid]) {
                // Check if target lies within the sorted left half
                if (nums[start] <= target && target < nums[mid]) {
                    start = mid - 1; // Search left
                } else {
                    start = mid + 1;  // Search right
                }
            } 
            // Otherwise, the right half must be sorted
            else {
                // Check if target lies within the sorted right half
                if (nums[mid] < target && target <= nums[end]) {
                    start = mid + 1;  // Search right
                } else {
                    start = mid - 1; // Search left
                }
            }
        }
        return -1; // Target not found
    }
    
}
