import java.util.Scanner;

/**
 * Created by Natig on 6/19/16.
 * bit operations in Java
 * The value of Fenwick function for the number n is the maximum power of two that divides n.
 * Given the number n, find its value of Fenwick function.
 */
public class FenwickFunction {
    private static Scanner scanner;

    public static void main(String[] args) {
        int n, result;
        scanner = new Scanner(System.in);
        n = scanner.nextInt();
        result = n - (n & (n - 1));
        System.out.println(result);
    }
}
