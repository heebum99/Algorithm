package Bronz5;

//(A+B)%C는 ((A%C) + (B%C))%C 와 같을까?
//(A×B)%C는 ((A%C) × (B%C))%C 와 같을까?
//세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성하시오.

import java.util.Scanner;

public class Q10430 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        System.out.println((A + B) % C);
        System.out.println(((A % C) + (B % C)) % C);
        System.out.println((A * B) % C);
        System.out.print(((A % C) * (B % C))%C);
    }
}
