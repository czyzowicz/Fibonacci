import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj wyraz ciągu: ");
        int n = input.nextInt();
        System.out.println(FibonacciSeqeunce(n));
    }

    public static int FibonacciSeqeunce(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return FibonacciSeqeunce(n-1) + FibonacciSeqeunce(n-2);
        }
    }
}
