public class Q113 {
    public static void main(String[] args) {
        if (args.length != 3) {
            return;
        }
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = Integer.parseInt(args[i]);
        }
        if (arr[0] == arr[1] && arr[1] == arr[2]) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }
}