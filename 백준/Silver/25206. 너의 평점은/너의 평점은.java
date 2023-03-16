import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double total_score = 0; //각 과목의 학점*과목평점의 합
        double score_sum = 0; //학점의 총합
        int number = 20;

        for (int i = 0; i < number; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            st.nextToken();
            double score = Double.parseDouble(st.nextToken()); //몇학점 과목인지
            String grade = st.nextToken(); //과목평점 => A+, A0 ...

            switch (grade) {
                case "A+":
                    score_sum += score;
                    total_score += 4.5 * score;
                    break;
                case "A0":
                    score_sum += score;
                    total_score += 4.0 * score;
                    break;

                case "B+":
                    score_sum += score;
                    total_score += 3.5 * score;
                    break;

                case "B0":
                    score_sum += score;
                    total_score += 3.0 * score;
                    break;

                case "C+":
                    score_sum += score;
                    total_score += 2.5 * score;
                    break;

                case "C0":
                    score_sum += score;
                    total_score += 2.0 * score;
                    break;

                case "D+":
                    score_sum += score;
                    total_score += 1.5 * score;
                    break;

                case "D0":
                    score_sum += score;
                    total_score += 1.0 * score;
                    break;

                case "F":
                    score_sum += score;
                    total_score += 0 * score;
                    break;

                default:
            }
        }
        double result = total_score / score_sum; //(학점*과목평균)의 합 / 수강 학점의 총합

        bw.write(String.format("%.6f", result));
        bw.flush();
        bw.close();
        br.close();
    }
}
