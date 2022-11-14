import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bulgi_year = scanner.nextInt();
        int sugi_year = bulgi_year-543;
        System.out.println(sugi_year);
    }
}