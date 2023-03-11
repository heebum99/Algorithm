import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        //util.Scanner 이용하는것보다 Buffered스트림 이용하는것이 메모리, 시간적으로 훨씬 효율적
        //예외처리를 해줄것.
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); //관중석 세로 길이
        int M = Integer.parseInt(st.nextToken()); //관중석 가로 길이
        int K = Integer.parseInt(st.nextToken()); //잃어버린 관중석 번호

        int count = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if(count == K){
                    System.out.println(i+" "+j);
                }
                count++;
            }
        }
    }
}