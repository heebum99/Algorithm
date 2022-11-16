package Bronze4;

//영문 문장을 입력받아 모음의 개수를 세는 프로그램을 작성하시오. 모음은 'a', 'e', 'i', 'o', 'u'이며 대문자 또는 소문자이다.

import java.util.Scanner;

public class Q1264 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (true) {
            int count =0;
            input = scanner.nextLine();
            if (input.equals("#")) {
                System.exit(0);
            }
            for (int i = 0; i < input.length(); i++) {
                if(input.charAt(i)=='a'||input.charAt(i)=='A'||input.charAt(i)=='e'||input.charAt(i)=='E'||input.charAt(i)=='i'||input.charAt(i)=='I'
                        ||input.charAt(i)=='o'||input.charAt(i)=='O'||input.charAt(i)=='u'||input.charAt(i)=='U'){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
