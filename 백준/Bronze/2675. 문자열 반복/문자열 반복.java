import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine()); //테스트 횟수
        for (int i = 0; i < T; i++) {
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input, " "); //토큰을 공백으로 구분
            int count = Integer.parseInt(st.nextToken());
            String s = st.nextToken();
            for (int j = 0; j < s.length(); j++) {
                for(int k=0; k<count; k++){
                    bw.write(s.charAt(j));
                }
            }
            bw.newLine();
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
