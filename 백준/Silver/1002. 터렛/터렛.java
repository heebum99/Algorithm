import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int x1, x2, y1, y2, r1, r2;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        while (T-- > 0) {
            st = new StringTokenizer(br.readLine());
            x1 = Integer.parseInt(st.nextToken());
            y1 = Integer.parseInt(st.nextToken());
            r1 = Integer.parseInt(st.nextToken());

            x2 = Integer.parseInt(st.nextToken());
            y2 = Integer.parseInt(st.nextToken());
            r2 = Integer.parseInt(st.nextToken());
            sb.append(targetNum(x1, y1, r1, x2, y2, r2)).append("\n");
        }
        System.out.print(sb);
    }

    private static int targetNum(int x1, int y1, int r1, int x2, int y2, int r2) { //두 원의 접점의 개수 확인
        int pointDistance = (int) (Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        //접점의 개수가 무한일때 => 점의 좌표가 서로 같고 지름도 같을때
        if (x1 == x2 && y1 == y2 && r1 == r2) {
            return -1;

        }
        //접점의 개수가 1개일 때
        else if (pointDistance == Math.pow(r2 + r1, 2)) {  //외접인 경우
            return 1;
        } else if (pointDistance == Math.pow(r2 - r1, 2)) { //내접인 경우
            return 1;
        }
        //접점의 개수가 0개일 때
        else if (pointDistance > Math.pow(r2 + r1, 2)) { //두 점사이의 거리가 반지름 합보다 클 때
            return 0;
        } else if (pointDistance < Math.pow(r2 - r1, 2)) { //한 원 안에 다른 원이 있으면서 접점이 없는 경우
            return 0;
        } else {
            return 2;
        }
    }
}
