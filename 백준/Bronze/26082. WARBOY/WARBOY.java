import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt(); //경쟁사의 가격
        int B = scanner.nextInt(); //경쟁사의 성능
        int C = scanner.nextInt(); //WABOY의 가격
        System.out.println((3*B/A)*C);
    }
}