import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num1 = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());
        int result[] = new int[4];
        int count = 1;

        result[0] = num1 * (num2 % 10); //3번자리
        result[1] = num1 * ((num2 % 100) / 10); //4번자리
        result[2] = num1 * (num2 / 100); //5번자리
        for (int i = 0; i < result.length - 1; i++) {
            result[3] += result[i] * count;
            count *= 10;
        }

        for(int i=0; i < result.length; i++){
            bw.write(Integer.toString(result[i]));
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
