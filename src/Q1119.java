import edu.princeton.cs.algs4.StdOut;

public class Q1119 {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            StdOut.println(i + " " + F(i));
        }
    }

    private static long F(int n) {
        if (n < 0) {
            return 0;
        }
        long[] result = new long[n + 2];
        result[0] = 0;
        result[1] = 1;
        for (int i = 2; i <= n; i++) {
            result[i] = result[i - 1] + result[i - 2];
        }
        return result[n];
    }
}