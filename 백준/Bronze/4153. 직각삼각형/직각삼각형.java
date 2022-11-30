import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = " ";
        int num[] = new int[3];
        while (true) {
            int max = 0;
            input = br.readLine();
            if (input.equals("0 0 0")) {
                break;
            }
            StringTokenizer st = new StringTokenizer(input, " ");
            for (int i = 0; i < 3; i++) {
                num[i] = Integer.parseInt(st.nextToken());
            }

            if (num[1] * num[1] + num[2] * num[2] == num[0] * num[0] ||
                    num[0] * num[0] + num[1] * num[1] == num[2] * num[2] ||
                    num[0] * num[0] + num[2] * num[2] == num[1] * num[1]) {
                bw.write("right");
                bw.newLine();
            } else{
                bw.write("wrong");
                bw.newLine();
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
