import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year = scanner.nextInt(); //연도 입력

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) { //윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.
            System.out.println("1");
        }
        else{ //윤년이 아닐때
            System.out.println("0");
        }
    }
}