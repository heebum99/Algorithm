import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); //입력 횟수
        String [] input = new String[n]; //입력받을 문자열 배열
        String [] result = new String[n]; //첫번째 문자와 마지막 문자를 담고있는 문자열 결과 배열

        for (int i = 0; i < n; i++) { //입력받은 정수의 횟수만큼 입력을 받음.
            input[i] = scanner.next();
        }

        for (int i = 0; i < n; i++) { //입력받은 정수의 횟수만큼 입력을 받음.
            result[i] = ""+input[i].charAt(0) + input[i].charAt(input[i].length()-1);
            System.out.println(result[i]);
        }
    }
}
