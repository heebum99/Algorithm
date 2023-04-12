import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int arr[][];
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        arr = new int[N][N];
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            for (int j = 0; j < N; j++) {
                arr[i][j] = s.charAt(j) - '0';
            }
        }

        partition(0, 0, N);
        System.out.print(sb);
    }

    static void partition(int row, int col, int size) {
        if (isCompression(row, col, size)) {
            if (arr[row][col] == 0) {
                sb.append("0");
            } else {
                sb.append("1");
            }
            return;
        }

        //재귀 호출
        int newSize = size / 2;
        sb.append("(");
        partition(row, col, newSize);//좌측 상단
        partition(row, col + newSize, newSize);//우측 상단
        partition(row + newSize, col, newSize);//좌측 하단
        partition(row + newSize, col + newSize, newSize);//우측 하단
        sb.append(")");
    }

    static boolean isCompression(int row, int col, int size) {
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
