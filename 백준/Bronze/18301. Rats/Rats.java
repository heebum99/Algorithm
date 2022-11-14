import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N1 = scanner.nextInt();
        int N2 = scanner.nextInt();
        int N3 = scanner.nextInt();
        int N = ((N1 + 1) * (N2 + 1) / (N3 + 1)) - 1;

        System.out.println(N);
    }
}
