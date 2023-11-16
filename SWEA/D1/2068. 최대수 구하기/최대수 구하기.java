import java.util.Arrays;
import java.util.Scanner;


public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 0;
        int T = sc.nextInt();
        int result;

        for (int i = 1; i <= T; i++) {
            result = 0;

            int[] arr = new int[10];
            for (int j = 0; j < 10; j++) {
                arr[j] = sc.nextInt();
            }
            Arrays.sort(arr);
            result = arr[9];

            System.out.println("#" + (++num) + " " + result);
        }

    }

}