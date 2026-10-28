import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ArrayTaskTest {

    @Test
    void shouldReturnSquaresInAscendingOrder() {
        int[] input = {3, 2, 7, 1, 4};
        int[] expected = {1, 4, 9, 16, 49};
        int[] actual = ArrayTask.squareAndSort(input);

        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldHandleNegativeNumbers() {
        int[] input = {-4, -2, 3, 1};
        int[] expected = {1, 4, 9, 16};
        int[] actual = ArrayTask.squareAndSort(input);

        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldHandleEmptyArray() {
        int[] input = {};
        int[] expected = {};
        int[] actual = ArrayTask.squareAndSort(input);

        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldHandleDuplicateNumbers() {
        int[] input = {2, 2, 1};
        int[] expected = {1, 4, 4};
        int[] actual = ArrayTask.squareAndSort(input);

        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldHandleZeros() {
        int[] input = {0, 3, 0, 1};
        int[] expected = {0, 0, 1, 9};
        int[] actual = ArrayTask.squareAndSort(input);

        assertArrayEquals(expected, actual);
    }
}