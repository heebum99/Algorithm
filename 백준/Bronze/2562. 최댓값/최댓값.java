import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] numbers = new int[9];
        int max = 0;
        int index = 0;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
            if (max < numbers[i]) {
                max = numbers[i];
                index = i + 1;
            }
        }
        br.close();
        bw.write(Integer.toString(max));
        bw.newLine();
        bw.write(Integer.toString(index));
        bw.flush();
        bw.close();
    }
}