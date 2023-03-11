import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       String word = scanner.next();
       int w_length = word.length();

       if(0<w_length && w_length<=100) {
           System.out.println(w_length);
       }
    }
}