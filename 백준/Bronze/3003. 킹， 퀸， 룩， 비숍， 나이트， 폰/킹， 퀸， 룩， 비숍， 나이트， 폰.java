import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] correct_chess = {1,1,2,2,2,8}; //맞는 체스말의 개수, 킹 퀸 룩 비숍 나이트 폰 순서
        int[] input_chess = new int[6]; //찾은 체스말의 개수

        for (int i = 0; i < input_chess.length; i++) {
            input_chess[i] = scanner.nextInt();
        }

        for (int i = 0; i < input_chess.length; i++) {
            if (input_chess[i] >= 0 && input_chess[i] <= 10) {
                System.out.print(correct_chess[i] - input_chess[i]+" ");
            }
        }
    }
}