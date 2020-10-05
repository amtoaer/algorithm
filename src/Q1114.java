public class Q1114 {
    public static void main(String[] args) {
        System.out.println(lg(1));
        System.out.println(lg(3));
        System.out.println(lg(4));
    }

    private static int lg(int n) {
        if (n < 1) {
            return -1;
        }
        int count = 0, tmp = 1;
        while (tmp * 2 <= n) {
            tmp *= 2;
            count++;
        }
        return count;
    }
}
