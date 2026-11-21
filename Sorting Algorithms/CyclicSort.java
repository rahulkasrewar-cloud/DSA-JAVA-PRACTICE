import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 2, 3};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] nums) {
        int i = 0;
        while( i < nums.length){
            int correct = nums[i] - 1;
            if( nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }
    }
    static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
