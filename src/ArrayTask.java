import java.util.Arrays;

public class ArrayTask {

    public static int[] squareAndSort(int[] numbers) {
        int[] result = new int[numbers.length];

        for (int index = 0; index < numbers.length; index++) {
            result[index] = numbers[index] * numbers[index];
        }

        Arrays.sort(result);

        return result;
    }
}