import java.util.Scanner;

/**
 * Created by Natig on 6/26/16.
 */
public class ResetABit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, k, result;
        a = scanner.nextInt();
        k = scanner.nextInt();
        result = a & (~(1 << k));
        System.out.println(result);
    }
}
