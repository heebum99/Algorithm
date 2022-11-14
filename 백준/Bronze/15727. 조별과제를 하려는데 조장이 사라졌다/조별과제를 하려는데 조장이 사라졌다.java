import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int L = scanner.nextInt(); //성우의 위치와 집까지의 거리
        double sung = 5; //성우가 1분에 갈 수 있는 최대 거리
        double result = L/sung;

        System.out.println((int)Math.ceil(result));

    }
}