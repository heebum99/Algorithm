import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int count_b = 0;
    static int count_w = 0;
    static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); //N*N 정사각형 생성
        arr = new int[N][N];
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        partition(0, 0, N);

        sb.append(count_w).append("\n").append(count_b);
        System.out.print(sb);
    }

    static void partition(int row, int col, int size) {
        if (colorCheck(row, col, size)) {
            if (arr[row][col] == 0) {
                count_w++;
            } else {
                count_b++;
            }
            return;
        }

        int newSize = size / 2;

        //재귀호출
        partition(row, col, newSize); //2사분면
        partition(row, col + newSize, newSize); //1사분면
        partition(row + newSize, col, newSize); //3사분면
        partition(row + newSize, col + newSize, newSize); //4사분면
    }


    //파티션의 색이 다 동일한지 체크
    static boolean colorCheck(int row, int col, int size) {
        int color = arr[row][col]; //파티션 첫번째 칸을 기준으로 체크

        for (int i = row; i < row + size; i++) {
            for (int j = col; j < col + size; j++) { 
                if (arr[i][j] != color) { //하나라도 다른 색상이 존재하면 false를 리턴
                    return false;
                }
            }
        }
        return true;
    }
}
