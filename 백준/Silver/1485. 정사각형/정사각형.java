import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static double ab, bc, cd, da; //선분의 길이
    static double ac, bd; //대각선의 길이

    private static class Point {
        private int x;
        private int y;

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        Point[] p;
        double[] result;
        while (T-- > 0) {
            p = new Point[4];
            result = new double[6];
            int count = 0;

            for (int i = 0; i < 4; i++) {
                st = new StringTokenizer(br.readLine());
                p[i] = new Point();
                p[i].setX(Integer.parseInt(st.nextToken()));
                p[i].setY(Integer.parseInt(st.nextToken()));
            }

            //정사각형이 되기 위한 조건 => 네 변의 길이가 같고 두 대각선의 길이가 같은 경우
            for (int i = 0; i < 4; i++) {
                for (int j = i + 1; j < 4; j++) {
                    result[count++] = getDistance(p[i], p[j]);
                }
            }
            Arrays.sort(result);
            
            if (result[0] == result[1] && result[1] == result[2] && result[2] == result[3] && result[4] == result[5]) {
                sb.append(1).append("\n");
            } else {
                sb.append(0).append("\n");
            }
        }
        System.out.print(sb);
    }

    private static double getDistance(Point p1, Point p2) {
        return Math.sqrt(Math.pow(p1.getX() - p2.getX(), 2) + Math.pow(p1.getY() - p2.getY(), 2));
    }
}
