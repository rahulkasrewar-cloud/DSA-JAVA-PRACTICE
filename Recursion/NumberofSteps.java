
public class NumberofSteps {
    public static int steps(int nums) {
        int steps = 0;

        while ( nums > 0 ){
            if( nums % 2 == 0){
                nums = nums / 2;
            } else {
                nums = nums - 1;
            }
            steps++;
        }
        return steps;
    }
    public static void main(String[] args) {
        int num = 14;
        int result = steps(num);
        System.out.println("Steps: " + result);
    }
}
