import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); //행의 크기
        int M = scanner.nextInt(); //열의 크기

        int [][] ary1 = new int[N][M];
        int [][] ary2 = new int[N][M];
        int [][] sum = new int[N][M];

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                ary1[i][j] = scanner.nextInt();
            }
        }

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                ary2[i][j] = scanner.nextInt();
            }
        }

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                sum[i][j] = ary1[i][j] + ary2[i][j];
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
    }
}