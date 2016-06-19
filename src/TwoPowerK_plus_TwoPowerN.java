import java.util.Scanner;

/**
 * Created by Natig on 6/19/16.
 * 2^k + 2^n
 * Two different integers k and n are given. Print the value 2k + 2n, using bit operations only.
 */
public class TwoPowerK_plus_TwoPowerN {
    private static Scanner scanner;
    private static int k, n, result;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        k = scanner.nextInt();
        n = scanner.nextInt();
        result = (1 << k) + (1 << n);
        System.out.println("2^" + k + " + 2^" + n + " = " + result);
    }
}
