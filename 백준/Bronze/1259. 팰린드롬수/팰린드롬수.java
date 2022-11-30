import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = " ";
        while (true) {
            input = br.readLine();
            if (input.equals("0")) {
                break;
            }
            StringBuffer sb = new StringBuffer(input);
            if (input.equals(sb.reverse().toString())) {
                bw.write("yes");
                bw.newLine();
            } else {
                bw.write("no");
                bw.newLine();
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
