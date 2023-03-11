import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); //라운드 수
        int max = (n+1)*3; //최대 작업 수
        int min = (n+1)*2; //최소 작업 수

        System.out.print(min + " " + max);
    }
}