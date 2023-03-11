import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] num = new int[5];

        for(int i=0; i<num.length; i++){
            num[i] = scanner.nextInt();
        }

        double sum = 0;

        for(int i=0; i<num.length; i++){
            sum = sum + (Math.pow(num[i],2));
        }

        System.out.println((int)sum%10);

    }
}