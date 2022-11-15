import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); //입력받을 비밀번호 개수
        for (int i = 0; i < n; i++) {
            String password = scanner.next();
            int length = password.length();
            if (length >= 6 && length <= 9) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}