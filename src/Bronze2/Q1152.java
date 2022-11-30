package Bronze2;

import java.io.*;
import java.util.StringTokenizer;

public class Q1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        int count = 0;
        StringTokenizer st = new StringTokenizer(input, " ");
        while (st.hasMoreTokens()) {
            st.nextToken();
            count++;
        }
        br.close();
        bw.write(Integer.toString(count));
        bw.flush();
        bw.close();
    }
}
