public class Q1120 {
    public static void main(String[] args) {
        System.out.println(ln(3));
    }

    private static double ln(int N) {
        if (N == 1) {
            return 0;
        }
        return ln(N - 1) + Math.log(N);
    }
}
