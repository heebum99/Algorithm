import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static Point[] p;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        p = new Point[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            long x = Long.parseLong(st.nextToken());
            long y = Long.parseLong(st.nextToken());

            p[i] = new Point(x, y);
        }

        int count = N - 2;
        int num = 1;
        long result = 0;
        while (count > 0) {
            result += CCW(p[0], p[num], p[num + 1]);
            num++;
            count--;
        }
        result = Math.abs(result);
        System.out.printf("%.1f", (double) result / 2);

    }

    private static double CCW(Point p1, Point p2, Point p3) {
        return (p1.x * p2.y + p2.x * p3.y + p3.x * p1.y) - (p3.x * p2.y + p2.x * p1.y + p1.x * p3.y);
    }

    private static class Point {
        long x;
        long y;

        public Point(long x, long y) {
            this.x = x;
            this.y = y;
        }
    }
}
