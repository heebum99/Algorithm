import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] arr;
    static int count_0;
    static int count_1;
    static int count_minus_1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        arr = new int[N][N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        partition(0, 0, N);

        StringBuilder sb = new StringBuilder();
        sb.append(count_minus_1+"\n").append(count_0+"\n").append(count_1);
        System.out.print(sb);
    }

    private static void partition(int row, int col, int size) {
        if (isEqual(row, col, size)) {
            if (arr[row][col] == 0) {
                count_0++;
            } else if (arr[row][col] == 1) {
                count_1++;
            } else {
                count_minus_1++;
            }
            return;
        }


        int newSize = size / 3;

        //재귀 호출
        // 9개의 영역으로 재분할
        partition(row, col, newSize); //좌측상단
        partition(row, col + newSize, newSize); //중앙상단
        partition(row, col + (newSize * 2), newSize); //우측상단
        partition(row + newSize, col, newSize); //좌측중앙
        partition(row + newSize, col + newSize, newSize); //정중앙
        partition(row + newSize, col + (newSize * 2), newSize); //우측중앙
        partition(row + (newSize * 2), col, newSize); //좌측하단
        partition(row + (newSize * 2), col + newSize, newSize); //중앙하단
        partition(row + (newSize * 2), col + (newSize * 2), newSize); //우측하단
    }

    private static boolean isEqual(int row, int col, int size) {
        int standard_num = arr[row][col];
        for (int i = row; i < row + size; i++) {
            for (int j = col; j < col + size; j++) {
                if (standard_num != arr[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

}
