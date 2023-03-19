import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        ArrayList<Integer> ary = new ArrayList<>();
        int N = Integer.parseInt(br.readLine());

        while (N != 1) {

            for (int i = 2; i <= N; i++) {

                if (N % i == 0) {
                    N /= i;
                    ary.add(i);
                    i--;
                }
            }

            for (int i : ary) {
                bw.write(Integer.toString(i) + "\n");
            }

        }
        bw.flush();
        bw.close();
        br.close();
    }
}
