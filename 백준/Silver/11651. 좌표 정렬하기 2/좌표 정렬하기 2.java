//2차원 평면 위의 점 N개가 주어진다. 좌표를 y좌표가 증가하는 순으로, y좌표가 같으면 x좌표가 증가하는 순서로 정렬한 다음 출력하는 프로그램을 작성하시오.

import java.awt.*;
import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int[][] coord = new int[N][2]; //x, y 좌표를 저장하는 배열

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            coord[i][0] = Integer.parseInt(st.nextToken());
            coord[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(coord, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] - o2[1] != 0) {
                    return o1[1] - o2[1];
                } else {
                    return o1[0] - o2[0];
                }
            }
        });

        for (int i = 0; i < N; i++) {
            bw.write(Integer.toString(coord[i][0]) + " " + Integer.toString(coord[i][1]) + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
