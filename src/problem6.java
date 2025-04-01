import java.util.Scanner;

public class problem6 {
    public static long power(int a, int n){
        if (n==0) return 1;
        return a*power(a, n-1);
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        scanner.close();
        System.out.println(power(n,a) );
    }
}
