package Bronze1;

//자연수 N과 정수 K가 주어졌을때 이항 계수를 구해라.
//이항계수 공식 => n!/k!(n-k)!

import java.io.*;
import java.util.StringTokenizer;

public class Q11050 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int result = 1; //이항계수 계산 결과값

        StringTokenizer st = new StringTokenizer(s, " ");
        int N = Integer.parseInt(st.nextToken()); //자연수
        int K = Integer.parseInt(st.nextToken()); //정수

        //이항계수 공식 => n!/k!(n-k)!
        result = (factorial(N) / (factorial(N - K) * factorial(K)));
        bw.write(Integer.toString(result));

        bw.flush();
        bw.close();
        br.close();
    }

    public static int factorial(int num) { //팩토리얼 재귀 함수
        int result = 1;
        while (num > 1) {
            result *= num;
            num--;
        }
        return result;
    }
}
