import java.util.Arrays;

public class Main {
    // Problem 1
    public static int findMinRecursive(int[] arr, int index){
        if (index==arr.length - 1) {
            return arr[index];
        }
        return Math.min(arr[index], findMinRecursive(arr, index + 1));
    }

    public static void main(String[] args){
        System.out.println("Min (3,6,8,9,6): " + findMinRecursive(new int[]{2, 7, 4, 0, 5}, 0));

    }
}