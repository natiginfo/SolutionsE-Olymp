import java.util.Random;

/**
 * Created by Natig on 6/19/16.
 * This is for generating random alpha-numeric key in Java
 */
public class AlphaNumericKeyGenerator {

    public static void main(String[] args) {
        System.out.println(generate(5));
    }

    public static String generate(int passwordSize) {
        char[] chars = "abcdefghijklmnopqrstuvwxyz0123456789".toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < passwordSize; i++) {
            char c = chars[random.nextInt(chars.length)];
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }
}
