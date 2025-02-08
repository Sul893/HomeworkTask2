import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArrayUtils {
    public static int getSum(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    public static double average(int[] array) {
        if (array.length == 0) return 0;
        return (double) getSum(array) / array.length;
    }

    public static int max_value(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static int min_value(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static int mode(int[] array) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        int mode = array[0];
        int maxCount = 0;
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mode = entry.getKey();
            }
        }
        return mode;
    }

    public static int[] sort_ascending(int[] array) {
        Arrays.sort(array);
        return array;
    }
}
