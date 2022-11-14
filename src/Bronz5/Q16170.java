package Bronz5;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Q16170 {
    public static void main(String[] args) {
        Date day = new Date();
        SimpleDateFormat date = new SimpleDateFormat("yyyy MM dd");
        String toDay = date.format(day);
        String[] ymd = toDay.split(" ");
        for(int i=0; i<3; i++) {
            System.out.println(ymd[i]);
        }
    }
}
