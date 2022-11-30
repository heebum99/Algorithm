import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num[] = new int[10]; //0~9
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        String res = Integer.toString(A * B * C);
        br.close();
        for (int i = 0; i < res.length(); i++) {
            num[res.charAt(i)-'0']++;
        }
        for (int i = 0; i < num.length; i++) {
            bw.write(Integer.toString(num[i]));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}