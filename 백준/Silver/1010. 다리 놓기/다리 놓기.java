import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static Integer[][] combi = new Integer[30][30];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            st = new StringTokenizer(br.readLine());
            int west = Integer.parseInt(st.nextToken());
            int east = Integer.parseInt(st.nextToken());
            sb.append(combination(east, west)).append("\n");
        }
        System.out.print(sb);
    }

    //일반적인 반복문 사용시 오버플로 발생
    private static int combination(int n, int m) { //조합: nCm
        if (combi[n][m] != null) {
            return combi[n][m];
        }

        if (m == n || m == 0) { //조합 성질 => nCm에서 nCn or nC0 == 1
            return combi[n][m] = 1;
        }

        return combi[n][m] = combination(n - 1, m - 1) + combination(n - 1, m); //조합 성질 => nCm == n-1Cm-1 + n-1Cm
    }
}
