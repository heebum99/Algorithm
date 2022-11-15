import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(); //방어율
        int b = scanner.nextInt(); //방어율 무시

        int total_armor = a * (100 - b) / 100;
        //방어율이 100이상이면 0 미만이면 1을 출력
        if (total_armor >= 100) {
            System.out.println(0);
        } else {
            System.out.println(1);
        }
    }
}
