import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken()); //점프시 이동거리
        int t = Integer.parseInt(st.nextToken()); //점프시 걸리는 시간

        double dist = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        double result = dist;

        if (d <= t) {
            System.out.println(result);
        } else {
            int jump = (int) dist / d;
            double time = (jump * t) + (dist - jump * d); //목적지를 초과하지 않는 선에서 점프를 하는 경우 걸리는 시간
            double overJump = t * (jump + 1) + d * (jump + 1) - dist;//목적지를 넘어서 한번 더 점프하는 경우 => 초과해서 간만큼 돌아오는 시간도 생각
            result = Math.min(Math.min(result, time), overJump); //걸어가는 경우, 목적지 초과하기 전까지 점프하고 걸어가는 경우, 목적지를 초과해서 점프하고 초과한만큼 걸어가는 경우 중 최솟값.

            if (jump > 0) {
                result = Math.min(result, t * (double) (jump + 1)); //점프를 한번 더 해서 방향을 꺾는 경우
            } else {
                result = Math.min(result, t * 2); //점프를 두번만해서 가는 경우
            }

            System.out.println(result);
        }
    }
}
