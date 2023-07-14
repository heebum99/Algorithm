import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        double x;

        int D = Integer.parseInt(st.nextToken()); //대각선 길이
        int HRate = Integer.parseInt(st.nextToken()); //높이 비율
        int WRate = Integer.parseInt(st.nextToken()); //너비 비율

        x = (double) D / Math.sqrt(Math.pow(HRate, 2) + Math.pow(WRate, 2));
        System.out.println((int)(HRate * x) + " " + (int)(WRate * x));
    }
}
