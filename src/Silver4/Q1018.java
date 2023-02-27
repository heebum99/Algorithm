package Silver4;

import javax.swing.event.ChangeListener;
import java.io.*;
import java.util.StringTokenizer;

//N * M 크기의 정사각형 판에서 8*8크기의 체스판을 만든다.
//변을 공유하는 사각형은 흰, 검 번갈아가면서 다른 색으로 칠해져있다.
//8*8 크기의 체스판을 골라서 만들때 다시 칠해야하는 정사각형 최소 개수를 구해라.

public class Q1018 {
    static boolean chess[][]; //static으로 선언해 전역변수로 설정

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int size[] = new int[2]; // size[0] = N, size[1] = M
        int min = 64; //다시 색칠해야하는 총 개수(최소)

        String input = br.readLine(); //체스판 크기 N,M을 입력받음
        StringTokenizer st = new StringTokenizer(input, " ");
        for (int i = 0; i < size.length; i++) {
            if (st.hasMoreTokens()) {
                size[i] = Integer.parseInt(st.nextToken());
            }
        }

        String s = ""; //각 가로줄에 대한 색상을 입력받을 문자열 (WBWB...)
        chess = new boolean[size[0]][size[1]]; // boolean형 N*M 크기의 체스판 생성 W => true, B => false
        for (int i = 0; i < size[0]; i++) {
            s = br.readLine();
            for (int j = 0; j < size[1]; j++) {
                if (s.charAt(j) == 'W') { //흰색이라면 True
                    chess[i][j] = true;
                } else { //B => 검은색이라면 False
                    chess[i][j] = false;
                }
            }
        }

        //M*N 크기의 판에서 8*8 체스판이 나올수 있는 경우의 수는 (N-7) * (M-7)개
        int N_row = size[0] - 7;
        int M_row = size[1] - 7;

        for (int i = 0; i < N_row; i++) {
            for (int j = 0; j < M_row; j++) {
                int count = check(i, j);
                min = Math.min(count, min);
            }
        }

        System.out.println(min);
    }

    public static int check(int start_row, int start_col) {
        int end_row = start_row + 7;
        int end_col = start_col + 7;
        int count = 0; //색칠해야할 개수 측정
        boolean color = chess[start_row][start_col]; //첫번째 칸의 색을 가져온다.

        for (int i = start_row; i <= end_row; i++) {
            for (int j = start_col; j <= end_col; j++) { //첫 칸의 색을 기준으로 비교해나간다.
                if (color != chess[i][j]) { //잘못 색칠된 부분 찾기
                    count++; //색칠해야될 개수 증가.
                }
                color = !color; //W는 B로 B는 W로 바꿔주기
            }
            color = !color; //위쪽 색칠된 색과 겹치지않게 하기 위함.
        }

        count = Math.min(count, 64 - count); //첫번째 판의 색을 기준으로 했을때와 반대되는 색으로 했을때 중 최소값을 선택.
        return count;
    }
}
