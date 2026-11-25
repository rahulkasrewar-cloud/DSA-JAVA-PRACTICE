public class BinaryGap {
    public int binaryGap(int n) {
        int lastPos = -1;
        int maxGap = 0;
        int pos = 0;

        while (n > 0) {
            if ((n & 1) == 1) {
                if (lastPos != -1) {
                    maxGap = Math.max(maxGap, pos - lastPos);
                }
                lastPos = pos;
            }
            n >>= 1;
            pos++;
        }
        return maxGap;
    }
    public static void main(String[] args) {
        BinaryGap sol = new BinaryGap();
        System.out.println(sol.binaryGap(22));
    }
}
