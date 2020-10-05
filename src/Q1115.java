import java.util.Map;
import java.util.HashMap;

public class Q1115 {
    public static void main(String[] args) {
        var result = histogram(new int[] { 0, 1, 2, 3, 0, 1, 1, 3, 2, 2, 1 }, 4);
        for (var item : result) {
            System.out.println(item);
        }
    }

    private static int[] histogram(int[] arr, int m) {
        if (m <= 0) {
            return null;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (var item : arr) {
            if (item >= 0 && item < m) {
                map.put(item, (map.get(item) == null ? 0 : map.get(item)) + 1);
            }
        }
        int[] result = new int[m];
        for (int i = 0; i < result.length; i++) {
            result[i] = map.get(i) == null ? 0 : map.get(i);
        }
        return result;
    }
}
