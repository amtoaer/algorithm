public class Q1113 {
    public static void main(String[] args) {
        int[][] arr = new int[5][7];
        arr[0][1] = 1;
        printReverse(arr);
    }

    private static void printReverse(int[][] arr) {
        if (arr.length == 0) {
            return;
        }
        int length = arr[0].length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.printf("%5d", arr[j][i]);
            }
            System.out.println();
        }
    }
}
