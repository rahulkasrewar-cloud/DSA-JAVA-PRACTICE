
public class MountainArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 6, 4, 2};
        // Called directly because the method is static
        System.out.println("Peak index is: " + peakIndexinMountainArray(arr));
    }
    public static int peakIndexinMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + ( end - start) / 2;

            if ( arr[mid] > arr[mid + 1]) {
                // you are in DEC part of array
                // this may be the ans .but look at left side
                // this is why end != mid - 1;
                end = mid;
            } else {
                // You are in Asc part of array
                start = mid + 1; // Because we know that mid + 1 element > mid element.
            }
            // in the end, start == end and they are pointing to the largest number because of the 2 checks.   
            // start and end are always trying to find the max element in the above 2 checks.
            // Hence, when they are pointing to just one element, that is the max one because that is what the check says.
            // More elaboration: At every point of time for start and end, they have the best possible answer till that time.
            // if we are saying that only one item is remaining,hence cuz of above line that is the best possible ans.

        }
         return start; // or return end both are equal (=).
    }
    
}

/* 
public class MountainArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 6, 4, 2};
        System.out.println("Peak index is: " + peakIndexinMountainArray(arr));
    }
    public static int peakIndexinMountainArray(int[] arr) {
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
}

*/
