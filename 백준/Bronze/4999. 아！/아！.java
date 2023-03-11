import java.util.Scanner;

public class Main {
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