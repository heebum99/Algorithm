import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

//9×9 격자판에 쓰여진 81개의 자연수 또는 0이 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 행 몇 열에 위치한 수인지 구하는 프로그램을 작성하시오.

public class Main {
    static int max_index[] = new int[2];
    static int max = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] ary = new int[9][9]; //2차원 9*9 배열 생성

        for (int i = 0; i < ary.length; i++) { //2차원 배열 초기화
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < ary[i].length; j++) {
                ary[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        FindMax(ary, max_index);

        bw.write(Integer.toString(max));
        bw.newLine();
        bw.write(Integer.toString(max_index[0] + 1) + " " + Integer.toString(max_index[1] + 1));
        bw.flush();
        bw.close();
        br.close();
    }


    static void FindMax(int[][] ary, int[] max_index) {
        for (int i = 0; i < ary.length; i++) { //2차원 배열 초기화
            for (int j = 0; j < ary[i].length; j++) {
                if (max < ary[i][j]) {
                    max = ary[i][j];
                    max_index[0] = i;
                    max_index[1] = j;
                }
            }
        }
    }
}
