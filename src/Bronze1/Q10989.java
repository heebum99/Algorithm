package Bronze1;

import java.io.*;
import java.util.Arrays;

public class Q10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()); //입력받을 정수 개수
        int[] intArray = new int[N]; //입력받을 정수를 담을 배열

        for (int i = 0; i < N; i++) {
            intArray[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(intArray);

        for (int i = 0; i < N; i++) {
            bw.write(Integer.toString(intArray[i]));
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
