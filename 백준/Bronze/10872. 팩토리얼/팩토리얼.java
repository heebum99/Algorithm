import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); //N!을 구하기 위해 정수 입력
        int result = 1;

        for (int i = N; i >= 1; i--) {
            result *= i;
        }

        if(N==0){
            result = 1;
        }

        System.out.println(result);
    }
}