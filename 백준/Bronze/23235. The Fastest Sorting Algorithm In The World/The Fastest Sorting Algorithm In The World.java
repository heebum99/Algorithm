import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cnt = 0;
        while (true) {
            cnt++;
            int N = scanner.nextInt();

            if (N == 0) {
                break;
            }
            for (int i = 0; i < N; i++) {
                int num = scanner.nextInt();
            }
            System.out.print("Case "+cnt+": Sorting...");
            System.out.print(" done! ");
        }
    }
}