import java.util.Scanner;

public class second {
    public static boolean isPrimeRecursive(int n, int divisor) {
        if (n < 2) return false;
        if (divisor * divisor > n) return true;
        if (n % divisor == 0) return false;
        return isPrimeRecursive(n, divisor + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        System.out.println(isPrimeRecursive(n, 2) ? "Prime" : "Composite");
    }
}
