import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            double N = scanner.nextDouble();

            if (N == 0) {
                System.exit(0);
            }

            System.out.println(String.format("%.2f",(Math.pow(N, 0) + Math.pow(N, 1) + Math.pow(N, 2) + Math.pow(N, 3) + Math.pow(N, 4))));

        }
    }
}
