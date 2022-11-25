package Bronze4;


import java.io.*;

public class Q4470 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine()); //입력받을 줄 개수
        
        String[] lines = new String[N];
        for (int i = 0; i < lines.length; i++) {
            lines[i] = br.readLine();
        }
        br.close();
        for (int i = 0; i < lines.length; i++) {
            bw.write((i+1)+". "+lines[i]);
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
