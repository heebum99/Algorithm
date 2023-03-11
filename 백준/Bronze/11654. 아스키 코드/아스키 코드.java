import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.next();
        char input = word.charAt(0);

        System.out.println((int)input);

    }
}