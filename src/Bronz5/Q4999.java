package Bronz5;

import java.util.Scanner;

/*
입력은 두 줄로 이루어져 있다. 첫째 줄은 재환이가 가장 길게 낼 수 있는 "aaah"이다.
둘째 줄은 의사가 듣기를 원하는 "aah"이다. 두 문자열은 모두 a와 h로만 이루어져 있다.
a의 개수는 0보다 크거나 같고, 999보다 작거나 같으며, 항상 h는 마지막에 하나만 주어진다.
*/
public class Q4999 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String Jawhan = scanner.next();
        String doctor = scanner.next();

        //compareTo() => 문자열이 동일하면 0, 호출하는객체가 인자보다 사전적으로 앞에있으면 양수, 뒤에있으면 음수반환
        if(Jawhan.compareTo(doctor)<=0){ //ex) 재환:aaah 의사:ah일 경우 양수반환
            System.out.println("go");
        }
        else{
            System.out.println("no");
        }
    }
}
