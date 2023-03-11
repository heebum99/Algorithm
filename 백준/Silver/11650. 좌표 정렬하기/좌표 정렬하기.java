import java.util.Comparator;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); //점의 개수
        int ary[][] = new int[N][2]; //2차원 평면을 표현하기 위한 배열

        for(int i=0; i<N; i++){
            ary[i][0] = scanner.nextInt(); //x좌표
            ary[i][1] = scanner.nextInt(); //y좌표
        }

        Arrays.sort(ary, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) { //o1,o2는 2차원배열의 요소

                if(o1[0] != o2[0]){ //o1[0]은 x좌표, o1[1]은 y좌표
                    return o1[0] - o2[0]; //x좌표가 같지 않으면 x좌표의 차이를 리턴해 오름차순 정렬
                }

                else{
                    return o1[1] - o2[1]; //x좌표가 같으면 y좌표의 차이를 리턴해 오름차순 정렬
                }

            }
        });

        for(int i=0; i<N; i++){
            System.out.println(ary[i][0]+" "+ary[i][1]);
        }

        scanner.close();


    }
}