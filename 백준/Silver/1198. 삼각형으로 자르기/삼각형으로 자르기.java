import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine()); //다각형의 점의 수

        int[][] points = new int[N][2];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 2; j++) {
                points[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        double result = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                for (int k = j + 1; k < N; k++) {
                    result = Math.max(result, getArea(points[i], points[j], points[k]));
                }
            }
        }
        System.out.println(result);
    }

    private static double getArea(int[] point, int[] point1, int[] point2) {
        //세 점의 좌표로 삼각형 넓이 구하는 방법 => 신발끈 정리 |(x1*y2 + x2*y3 + x3*y1) - (x3*y2 + x2*y1 + x1*y3)| / 2
        double result = 0;
        result = 0.5 * Math.abs((point[0] * point1[1] + point1[0] * point2[1] + point2[0] * point[1]) -
                (point2[0] * point1[1] + point1[0] * point[1] + point[0] * point2[1]));
        return result;
    }
}
