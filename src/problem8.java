import java.util.Scanner;

public class problem8 {
    public static boolean isAllDigits(String s, int index) {
        if (s == null || s.isEmpty()) return false;
        if (index == s.length()) return true;
        if (!Character.isDigit(s.charAt(index))) return false;
        return isAllDigits(s, index + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String s = scanner.next();
        scanner.close();

        System.out.println(isAllDigits(s, 0));
    }
}
