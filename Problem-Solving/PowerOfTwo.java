
public class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        PowerOfTwo sol = new PowerOfTwo();
        int[] testCases = {1, 16, 3, 0, -2, 2};

        for (int n : testCases) {
            System.out.println("n = " + n + " -> " + sol.isPowerOfTwo(n));
        }
    }
}

