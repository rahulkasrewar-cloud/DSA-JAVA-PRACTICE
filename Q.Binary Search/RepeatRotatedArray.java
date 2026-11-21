
public class RepeatRotatedArray {
    public static void main(String[] args) {
        int[] arr = {2,5,6,0,0,1,2};  // not necessarily with distinct values.
        int target = 0;
        int ans = RotatedArray(arr, target);
        System.out.println(ans);
    }
    static int RotatedArray(int[] nums, int target){
    int start = 0;
    int end = nums.length - 1;

    while ( start <= end ) {
        int mid = start + (end - start + 1) / 2;
         
        //if Target is found then return the index        // case 1.
        if ( nums[mid] == target){
            return mid;
        
        }
          // 2. Handle duplicates where start, mid, and end are equal

          if (nums[start] == nums[mid] && nums[mid] == nums[end]) {
            start++;
            end--;
            continue;
          }

         // check if the left side is sorted
        if(nums[start] <= nums[mid]) {

            // Check if target lies within the sorted left half
            if(target >= nums[start] && target < nums[mid]) {      // case 3.
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        // 4. Otherwise, the right half must be sorted

        if ( target > nums[mid] && target <= nums[end]) {
            start = mid + 1;
        } else {
            end = mid - 1;
        }

        }
        return -1;
    }

}

