import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine()); //테스트 입력 횟수


        for (int i = 0; i < T; i++) {
            int sum = 0;
            int score = 0;
            String input = br.readLine();
            for (int j = 0; j < input.length(); j++) {
                if (input.charAt(j) == 'O') {
                    if (j > 0 && input.charAt(j - 1) == 'O') {
                        score += 1;
                    } else{
                        score=0;
                        score+=1;
                    }
                    sum += score;
                } else {
                    score = 0;
                }
            }
            bw.write(Integer.toString(sum));
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
