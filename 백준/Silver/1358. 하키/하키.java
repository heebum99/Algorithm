import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int r;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken()); //직사각형 좌측하단 x좌표
        int y = Integer.parseInt(st.nextToken()); //직사각형 좌측하단 y좌표
        int p = Integer.parseInt(st.nextToken()); //사람 수
        r = h / 2; //반지름

        int[][] loc = new int[p][2];
        for (int i = 0; i < p; i++) {
            st = new StringTokenizer(br.readLine());
            loc[i][0] = Integer.parseInt(st.nextToken());
            loc[i][1] = Integer.parseInt(st.nextToken());
        }

        int cnt = 0;
        for (int i = 0; i < p; i++) {
            if (loc[i][0] >= x && loc[i][0] <= x + w && loc[i][1] >= y && loc[i][1] <= y + h) {
                cnt++;
            } else if (getDistance(x, y + r, loc[i][0], loc[i][1])) {
                cnt++;
            } else if (getDistance(x + w, y + r, loc[i][0], loc[i][1])) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }

    private static boolean getDistance(int x, int y, int x1, int y1) {
        if (r >= Math.sqrt(Math.pow((x - x1), 2) + Math.pow(y - y1, 2))) {
            return true;
        }
        return false;
    }
}
