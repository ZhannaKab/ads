import java.util.Scanner;

public class problem5 {
    public static long fibonacci(int n){
        if (n<=1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        System.out.println(fibonacci(n) );}
}
