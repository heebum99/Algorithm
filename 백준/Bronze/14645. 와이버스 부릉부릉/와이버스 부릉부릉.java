import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); //정거장 수
        int K = scanner.nextInt(); //출발역에서 탑승하는 사람 수
        int total = K;

        for (int i = 0; i < N; i++) {
            int A = scanner.nextInt(); //i번째 정거장에서 탑승하는 사람 수
            total += A;
            int B = scanner.nextInt(); //i번째 정거장에서 하차하는 사람 수
            if (total >= B) {
                total -= B;
            }
        }
        String bus_driver = "비와이";
        System.out.println(bus_driver);
    }
}
