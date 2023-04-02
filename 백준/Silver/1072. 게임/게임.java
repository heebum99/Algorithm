import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        long X = Integer.parseInt(st.nextToken()); //총 게임 횟수
        long Y = Integer.parseInt(st.nextToken()); //이긴 게임 횟수
        long Z = (100 * Y / X); //소수점 버림

        //수학 공식으로 풀기
        if (Z >= 99) {
            System.out.println(-1); //승률이 99프로 이상일때는 승률이 변하지 못한다(더 높아질수 없음).
        } else {
            System.out.println((int) (Math.ceil((100 * Y - X * (Z + 1)) / (double) (Z - 99))));
        }

    }
}
