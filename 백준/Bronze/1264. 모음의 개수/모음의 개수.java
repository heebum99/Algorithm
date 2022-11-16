import java.util.Scanner;

public class Main {
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
