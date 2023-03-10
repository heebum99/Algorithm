import java.io.*;
import java.util.StringTokenizer;

//이 아파트에 거주를 하려면 조건이 있는데, “a층의 b호에 살려면 자신의 아래(a-1)층의 1호부터 b호까지 사람들의 수의 합만큼 사람들을 데려와 살아야 한다” 는 계약 조항을 꼭 지키고 들어와야 한다.
//아파트에 비어있는 집은 없고 모든 거주민들이 이 계약 조건을 지키고 왔다고 가정했을 때, 주어지는 양의 정수 k와 n에 대해 k층에 n호에는 몇 명이 살고 있는지 출력하라. 
//단, 아파트에는 0층부터 있고 각층에는 1호부터 있으며, 0층의 i호에는 i명이 산다.
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());
        int[][] apart = new int[15][15];

        for (int i = 0; i < 15; i++) {
            for (int j = 1; j < 15; j++) {
                if (i == 0) {
                    apart[i][j] = j ;
                } else if (j == 0) {
                    apart[i][j] = 1;
                } else {
                    apart[i][j] = apart[i - 1][j] + apart[i][j - 1];
                }
            }
        }

        for (int i = 0; i < T; i++) {
            bw.write(Integer.toString(apart[Integer.parseInt(br.readLine())][Integer.parseInt(br.readLine())]));
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
