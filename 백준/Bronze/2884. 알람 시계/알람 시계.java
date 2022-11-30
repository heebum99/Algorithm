import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int M = scanner.nextInt();

        //45분 일찍 알람 설정 = 1시간을 빼주고 15분 더하기
        H -= 1;
        M += 15;

        if (M >= 60) {
            M -= 60;
            H += 1;
        }
        if (H < 0) {
            H = 24 + H;
        }
        System.out.println(H+" "+M);
    }
}
