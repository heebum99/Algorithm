package Bronze4;

import java.util.Scanner;

public class Q2530 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = scanner.nextInt(); //현재 시간
        int minute = scanner.nextInt(); //현재 분
        int second = scanner.nextInt(); //현재 초
        int lead_time = scanner.nextInt(); //필요 시간(초 단위로)
        int total_second = hour * 3600 + minute * 60 + second + lead_time; //초 단위로 변경

        hour = total_second / 3600 % 24;
        minute = total_second %3600 /60 %60;
        second = total_second % 60;

        System.out.println(hour + " " + minute + " " + second);

    }
}
