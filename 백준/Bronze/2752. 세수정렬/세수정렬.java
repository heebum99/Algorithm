import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num[] = new int[3];

        for (int i = 0; i < num.length; i++) {
            num[i] = scanner.nextInt();
        }

        Arrays.sort(num); //오름차순 정렬

        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]+" ");
        }
    }
}