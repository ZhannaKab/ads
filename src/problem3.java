import java.util.Scanner;

public class problem3 {
    public static double findAverageRecursive(int[] arr, int index, int sum) {
        if (index == arr.length) {
            return (double) sum / arr.length;
        }
        return findAverageRecursive(arr, index + 1, sum + arr[index]);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println();
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();

        double average = findAverageRecursive(arr, 0, 0);
        System.out.println( average);
    }
}
