import java.io.*;

public class Main { //문자열로 입력받은 후 문자로 치환후 합계산
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String input = br.readLine();
        int sum = 0;

        for (int i = 0; i < N; i++) {
            sum += (input.charAt(i) - '0');
        }
//        br.readLine();
//        int sum = 0;
//
//        for (byte value : br.readLine().getBytes()) {
//            sum += (value - '0'); // = value - 48
//        }

        bw.write(Integer.toString(sum));
        bw.flush();
        bw.close();
        br.close();
    }
}
