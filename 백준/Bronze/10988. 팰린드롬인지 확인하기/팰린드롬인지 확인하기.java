import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        int len = s.length();

        for (int i = 0; i < len / 2; i++) {
            if (s.charAt(i) != s.charAt(len - (i + 1))) {
                bw.write("0");
                bw.flush();
                bw.close();
                br.close();
                System.exit(0);
            }
        }
        bw.write("1");
        bw.flush();
        br.close();
        bw.close();
    }
}
