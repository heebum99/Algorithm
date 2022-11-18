import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int L = scanner.nextInt(); //1m^2 당 사람 수
        int P = scanner.nextInt(); //파티장 넓이
        int participants[] = new int[5]; //참가자 수

        for (int i = 0; i < participants.length; i++) {
            participants[i] = scanner.nextInt();
        }

        for (int i = 0; i < participants.length; i++) {
            System.out.print(participants[i] - L * P + " ");
        }
    }
}
