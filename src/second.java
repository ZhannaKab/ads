import java.util.Arrays;

public class second {
    public static double findAverageRecursive(int[] arr, int index, int sum) {
        if (index == arr.length) {
            return (double) sum / arr.length;
        }
        return findAverageRecursive(arr, index + 1, sum + arr[index]);
    }

    public static void main(String[] args) {
        System.out.println("Average (3,4,6,7,5): " + findAverageRecursive(new int[]{3,4,6,7,5}, 0, 0));
    }
}