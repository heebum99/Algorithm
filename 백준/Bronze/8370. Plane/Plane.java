import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = scanner.nextInt(); //비지니스석 열 개수
        int k1 = scanner.nextInt(); //비지니스석 열당 좌석 수
        int n2 = scanner.nextInt(); //이코노미석 열 개수
        int k2 = scanner.nextInt(); //이코노미석 열당 좌석 수

        System.out.println(n1 * k1 + n2 * k2);
    }
}