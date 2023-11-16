import java.util.Scanner;


public class Solution {
    static int a, b;
    static char result;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int T = sc.nextInt();

        for (int i = 1; i <= T; i++) {
            a = sc.nextInt();
            b = sc.nextInt();

            if (a > b) {
                result = '>';
            } else if (a < b) {
                result = '<';
            } else {
                result = '=';
            }

            System.out.println("#" + (++num) + " " + result);
        }

    }


}