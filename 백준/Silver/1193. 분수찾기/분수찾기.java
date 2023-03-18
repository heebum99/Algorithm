import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine()); //몇번째 분수인지
        int cross_count = 1; //대각선에 포함된 칸의 개수
        int prev_count_sum = 0; //이전 대각선까지의 칸 개수의 합
        int result_numerator = 0; //분자
        int result_denominator = 0; //분모

        while (true) {
            if (num <= cross_count + prev_count_sum) {
                if (cross_count % 2 == 0) { //대각선의 칸 개수가 짝수개일때 위에서 아래로 => 분모는 작아지고 분자는 커짐
                    result_numerator = (num - prev_count_sum);
                    result_denominator = cross_count - (num - prev_count_sum - 1);
                    bw.write(Integer.toString(result_numerator) + "/" + Integer.toString(result_denominator));
                    break;
                } else { //홀수개 일때 아래서 위로 => 분자는 작아지고 분모는 커짐
                    result_numerator = cross_count - (num - prev_count_sum - 1);
                    result_denominator = (num - prev_count_sum);
                    bw.write(Integer.toString(result_numerator) + "/" + Integer.toString(result_denominator));
                    break;
                }
            } else {
                prev_count_sum += cross_count;
                cross_count++;
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
