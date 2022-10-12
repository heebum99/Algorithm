package Bronz5;

//서울의 오늘 날짜를 출력하는 프로그램을 작성하시오.

import java.time.LocalDate;
import java.util.Date;

public class Q10699 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(LocalDate.now());
    }
}
