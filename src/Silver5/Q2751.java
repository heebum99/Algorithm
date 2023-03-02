package Silver5;

import java.io.*;
import java.util.Arrays;

//첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄부터 N개의 줄에는 수가 주어진다.
//이 수는 절댓값이 1,000,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.
public class Q2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()); //주어진 N개의 수
        int ary[] = new int[N];

        for (int i = 0; i < N; i++) {
            ary[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(ary); //오름차순 정렬

        for (int i = 0; i < N; i++) {
            if (i >= 1 && ary[i] == ary[i - 1]) {
                continue;
            }
            bw.write(Integer.toString(ary[i]));
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
