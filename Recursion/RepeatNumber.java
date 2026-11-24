
public class RepeatNumber {
    public int doubleNumber(int[] nums) {
        int ans = 0;
        for( int num : nums) {
            ans = ans ^ num;
        }
        return ans;
    }
    public static void main(String[] args) {
        RepeatNumber sol = new RepeatNumber();

        int[] arr = {4, 1, 2, 1, 2};
       
        System.out.println(" SingelNumber : " + sol.doubleNumber(arr)); 
    }
}

    

