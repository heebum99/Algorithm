import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int R = scanner.nextInt();
        int S = scanner.nextInt();
        R*=8;
        S*=3;
        int students = 28;
        System.out.println(R+S-students);
    }
}