package Bronz5;

import java.util.Scanner;

/*
�Է��� �� �ٷ� �̷���� �ִ�. ù° ���� ��ȯ�̰� ���� ��� �� �� �ִ� "aaah"�̴�.
��° ���� �ǻ簡 ��⸦ ���ϴ� "aah"�̴�. �� ���ڿ��� ��� a�� h�θ� �̷���� �ִ�.
a�� ������ 0���� ũ�ų� ����, 999���� �۰ų� ������, �׻� h�� �������� �ϳ��� �־�����.
*/
public class Q4999 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String Jawhan = scanner.next();
        String doctor = scanner.next();

        //compareTo() => ���ڿ��� �����ϸ� 0, ȣ���ϴ°�ü�� ���ں��� ���������� �տ������� ���, �ڿ������� ������ȯ
        if(Jawhan.compareTo(doctor)<=0){ //ex) ��ȯ:aaah �ǻ�:ah�� ��� �����ȯ
            System.out.println("go");
        }
        else{
            System.out.println("no");
        }
    }
}
