import java.io.*;
import java.util.StringTokenizer;

//첫째 줄에 색종이의 수가 주어진다. 이어 둘째 줄부터 한 줄에 하나씩 색종이를 붙인 위치가 주어진다.
//색종이를 붙인 위치는 두 개의 자연수로 주어지는데 첫 번째 자연수는 색종이의 왼쪽 변과 도화지의 왼쪽 변 사이의 거리이고, 두 번째 자연수는 색종이의 아래쪽 변과 도화지의 아래쪽 변 사이의 거리이다.
//색종이의 수는 100 이하이며, 색종이가 도화지 밖으로 나가는 경우는 없다
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine()); //검은 색종이 수
        boolean[][] area = new boolean[101][101]; //100*100 정사각형의 도화지를 배열로 표현
        int count = 0; //검은색, 즉 true인 칸의 개수

        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int coordi_x = Integer.parseInt(st.nextToken()); //좌측 하단의 x좌표
            int coordi_y = Integer.parseInt(st.nextToken()); //좌측 하단의 y좌표

            for (int j = coordi_x; j < coordi_x + 10; j++) {
                for (int k = coordi_y; k < coordi_y + 10; k++) { //검은색으로 색칠된 곳은 true로 표현
                    area[j][k] = true;
                }
            }
        }

        for (int i = 0; i < area.length; i++) {
            for (int j = 0; j < area[i].length; j++) {
                if (area[i][j]) {
                    count++;
                }
            }
        }

        bw.write(Integer.toString(count));
        bw.flush();
        bw.close();
        br.close();

        //실패 코드
//        int[][] coord = new int[num][2]; //각 검은 색종이의 좌측 하단 좌표를 담는 배열
//        int area = 100 * num;
//
//        for (int i = 0; i < num; i++) { //각 검은 색종이의 좌측 하단 좌표를 입력
//            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//            coord[i][0] = Integer.parseInt(st.nextToken());
//            coord[i][1] = Integer.parseInt(st.nextToken());
//        }
//
//        //각 색종이가 겹치는지 여부 확인
//        //겹치는 조건 => 한 색종이의 좌표를 기준으로 x좌표점보다 크거나 같고 x좌표점 + 9보다 작거나 같고 y좌표점보다 크고 y좌표점 + 9보다 작거나 같으면 겹친다.
//        for (int i = 0; i < num; i++) {
//            for (int j = i + 1; j < num; j++) {
//                if ((coord[i][0] <= coord[j][0] && (coord[i][0] + 9) >= coord[j][0] && coord[i][1] <= coord[j][1] && (coord[i][1] + 9) >= coord[j][1])
//                        || (coord[i][0] <= (coord[j][0] + 9) && (coord[i][0] + 9) >= (coord[j][0] + 9) && coord[i][1] <= (coord[j][1] + 9) && (coord[i][1] + 9) >= (coord[j][1]) + 9)) { //겹친다면
//                    area -= (coord[j][0] - coord[i][0]) * (coord[j][1] - coord[i][1]);
//                }
//            }
//        }
//        bw.write(Integer.toString(area));
//        bw.flush();
//        bw.close();
//        br.close();
    }
}
