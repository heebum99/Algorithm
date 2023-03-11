import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); //수의 개수
        int M = scanner.nextInt(); //줄의 개수

        /*int ary[] = new int[N];

        for(int i=1; i<N+1; i++)
        {
            ary[i] = scanner.nextInt();
        }*/

        int sum[] = new int [N+1];
        sum[0] = 0;

        for(int i=1; i<N+1; i++){
            sum[i] = scanner.nextInt() + sum[i-1];
        }

        for(int k=0; k<M; k++)
        {
            int i = scanner.nextInt();
            int j = scanner.nextInt();

            System.out.println(sum[j] - sum[i-1]);
        }

        scanner.close();
    }
}