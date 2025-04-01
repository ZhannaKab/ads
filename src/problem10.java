import java.util.Scanner;

public class problem10 {
    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        scanner.close();

        System.out.println(findGCD(a, b));
    }
}

