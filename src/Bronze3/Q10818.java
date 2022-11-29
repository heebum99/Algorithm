package Bronze3;

import java.io.*;
import java.util.StringTokenizer;

public class Q10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        String input = br.readLine();
        int max = -1000000;
        int min = 1000000;
        StringTokenizer st = new StringTokenizer(input, " ");
        int i = 0;
        while (st.hasMoreTokens()) {
            arr[i] = Integer.parseInt(st.nextToken());
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
            i++;
        }
        br.close();
        bw.write(Integer.toString(min) + " ");
        bw.write(Integer.toString(max));
        bw.flush();
        bw.close();
    }
}
