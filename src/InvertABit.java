import java.util.Scanner;

/**
 * Created by Natig on 6/26/16.
 */
public class InvertABit {
    public static void main(String[] args) {
        int a, k, result;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        k = scanner.nextInt();
        result = a ^ (1 << k);
        System.out.println(result);
    }
}
