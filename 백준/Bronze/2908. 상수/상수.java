import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        String num[] = input.split(" ");
        int number[] = new int[2];
        for (int i = 0; i < 2; i++) {
            StringBuffer sb = new StringBuffer(num[i]);
            num[i] = sb.reverse().toString();
            number[i] = Integer.parseInt(num[i]);
        }
        br.close();

        if (number[0] < number[1]) {
            bw.write(Integer.toString(number[1]));
        } else {
            bw.write(Integer.toString(number[0]));
        }
        bw.flush();
        bw.close();

    }
}
