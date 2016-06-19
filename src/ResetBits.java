import java.util.Scanner;

/**
 * Created by Natig on 6/19/16.
 * Given two integers n and k.
 * Reset (set to zero) the last k bits in the number n, and print the result.
 */
public class ResetBits {
    private static Scanner scanner;

    public static void main(String[] args) {
        int n, k, result;
        scanner = new Scanner(System.in);
        n = scanner.nextInt();
        k = scanner.nextInt();
        result = n >> k;
        result = result << k;
        System.out.println(result);
    }
}
