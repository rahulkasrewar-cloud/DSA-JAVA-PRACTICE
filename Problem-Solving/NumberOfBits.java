
public class NumberOfBits {
    public int HammingWeight(int n){
        
        int count = 0;
        while( n != 0){
            n &= ( n - 1);
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        NumberOfBits sol = new NumberOfBits();
        System.out.println(sol.HammingWeight(11));
        System.out.println(sol.HammingWeight(111));
    }
}
