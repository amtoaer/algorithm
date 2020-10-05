import edu.princeton.cs.algs4.StdRandom;

public class Q1111 {
    public static void main(String[] args) {
        boolean[][] arr = new boolean[5][7];
        // 随机赋值为真/假
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = StdRandom.bernoulli();
            }
        }
        // 调用函数输出
        printArray(arr);

    }

    private static void printArray(boolean[][] args) {
        if (args.length == 0) {
            return;
        }
        System.out.printf("%5s", "");
        for (int i = 0; i < args[0].length; i++) {
            System.out.printf("%5d", i + 1);
        }
        System.out.println();
        for (int i = 0; i < args.length; i++) {
            System.out.printf("%5d", i + 1);
            for (int j = 0; j < args[i].length; j++) {
                String s = "";
                if (args[i][j]) {
                    s = "*";
                }
                System.out.printf("%5s", s);
            }
            System.out.println();
        }
    }
}
