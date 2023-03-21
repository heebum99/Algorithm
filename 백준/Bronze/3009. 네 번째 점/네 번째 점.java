import java.io.*;
import java.util.StringTokenizer;

//세 점이 주어졌을 때, 축에 평행한 직사각형을 만들기 위해서 필요한 네 번째 점을 찾는 프로그램을 작성하시오
//직사각형의 네 번째 점의 좌표를 출력한다.
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] xy_pos = new int[3][2];
        int result_x_pos = 0;
        int result_y_pos = 0;

        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            xy_pos[i][0] = Integer.parseInt(st.nextToken());
            xy_pos[i][1] = Integer.parseInt(st.nextToken());
        }

        //x좌표 구하기
        if (xy_pos[0][0] == xy_pos[1][0]) {
            result_x_pos = xy_pos[2][0];
        } else if (xy_pos[1][0] == xy_pos[2][0]) {
            result_x_pos = xy_pos[0][0];
        } else {
            result_x_pos = xy_pos[1][0];
        }

        //y좌표 구하기
        if (xy_pos[0][1] == xy_pos[1][1]) {
            result_y_pos = xy_pos[2][1];
        } else if (xy_pos[1][1] == xy_pos[2][1]) {
            result_y_pos = xy_pos[0][1];
        } else {
            result_y_pos = xy_pos[1][1];
        }

        bw.write(Integer.toString(result_x_pos) + " " + Integer.toString(result_y_pos));
        bw.flush();
        bw.close();
        br.close();
    }
}
