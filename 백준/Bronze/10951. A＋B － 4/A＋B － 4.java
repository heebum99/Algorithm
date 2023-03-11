import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A, B; //입력받을 두 정수

        while (scanner.hasNextInt()) {
            A = scanner.nextInt();
            B = scanner.nextInt();
            System.out.println(A + B);
        }

    }
}