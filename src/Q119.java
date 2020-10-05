public class Q119 {
    public static void main(String[] args) {
        System.out.println(toBinaryString(5));
    }

    private static String toBinaryString(int n) {
        StringBuilder sb = new StringBuilder();
        while (n != 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }
}
