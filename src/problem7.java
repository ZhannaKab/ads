import java.util.Scanner;

public class problem7 {
    public static void reverseInput(int n, Scanner scanner) {
        if (n == 0) {
            return;
        }
        int num = scanner.nextInt();
        reverseInput(n - 1, scanner);
        System.out.print(num + " ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        int n = scanner.nextInt();

        System.out.println();
        reverseInput(n, scanner); // Запускаем рекурсивный ввод
        scanner.close();
    }
}
