import java.util.Scanner;

/**
 * Created by Natig on 6/26/16.
 */
public class TheNumberInReverseOrder {
    public static void main(String[] args) {
        String n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextLine();
        if (n.equals("0")) {
            System.out.println("0");
        } else {
            for (int i = n.length() - 1; i >= 0; i--) {
                System.out.print(n.charAt(i));
            }
        }
    }
}
