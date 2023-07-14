import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] pointA = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
        int[] pointB = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
        int[] pointC = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};

        double ab = getDistance(pointA, pointB);
        double ac = getDistance(pointA, pointC);
        double bc = getDistance(pointB, pointC);

        double abacRound = 2 * (ab + ac);
        double abbcRound = 2 * (ab + bc);
        double acbcRound = 2 * (ac + bc);

        double answer = 0;
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        //평행사변형이 성립되지 않으려면 세점이 일직선상 위에 존재하는 경우
        if (getSlope(pointA, pointB) == getSlope(pointB, pointC)) {
            answer = -1;
        } else {
            min = Math.min(Math.min(abacRound, abbcRound), acbcRound);
            max = Math.max(Math.max(abacRound, abbcRound), acbcRound);
            answer = max - min;
        }
        System.out.println(answer);
    }

    private static double getSlope(int[] p1, int[] p2) {
        if (p1[0] - p2[0] == 0) {
            return 0;
        }
        return (double) (p1[1] - p2[1]) / (p1[0] - p2[0]);
    }

    private static double getDistance(int[] p1, int[] p2) {
        return Math.sqrt(Math.pow(p1[0] - p2[0], 2) + Math.pow(p1[1] - p2[1], 2));
    }
}
