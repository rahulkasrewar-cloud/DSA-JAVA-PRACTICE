public class TimesofRotation {
    public static void main(String[] args) {
        int[] arr = { 5, 6, 7, 1, 2};
        System.out.println(countRotation(arr));
    }
    static int countRotation(int[] arr) {
    int pivot = findpivot(arr);
    return pivot + 1;
    }
    static int findpivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        // If the array is not rotated at all
        if (nums[start] <= nums[end]) {
            return -1;
        }
        while (start < end) {
            int mid = start + (end - start) / 2;
            // If mid element is greater than end, pivot/min is in the right half
            if (nums[mid] > nums[end]) {
                start = mid + 1;
            } 
            else {
                end = mid;
            }
        }
        return start; // 'start' will point to the minimum element index
    }
}


