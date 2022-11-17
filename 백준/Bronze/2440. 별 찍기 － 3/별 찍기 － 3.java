import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); //첫줄의 별 개수
        for (int i = 0; i < N; i++) { //줄 바꿈 수
            for (int j = N - i; j > 0; j--) { //별 출력 수
                System.out.print("*");
            }
            if(i<N-1){
                System.out.println();
            }
        }
    }
}