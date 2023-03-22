import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

//세준이는 기말고사를 망쳤다. 세준이는 점수를 조작해서 집에 가져가기로 했다. 일단 세준이는 자기 점수 중에 최댓값을 골랐다. 이 값을 M이라고 한다.
//그리고 나서 모든 점수를 점수/M*100으로 고쳤다.
//예를 들어, 세준이의 최고점이 70이고, 수학점수가 50이었으면 수학점수는 50/70*100이 되어 71.43점이 된다.
//세준이의 성적을 위의 방법대로 새로 계산했을 때, 새로운 평균을 구하는 프로그램을 작성하시오.
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()); //과목 수 N
        double[] ary = new double[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < N; i++) {
            ary[i] = Double.parseDouble(st.nextToken());
        }

        Arrays.sort(ary);

        double max_score = ary[N - 1];
        double avg = 0;
        double total_score = 0;

        for (int i = 0; i < N; i++) {
            ary[i] = (ary[i] / max_score) * 100;
            total_score += ary[i];
        }

        avg = total_score / N;

        bw.write(Double.toString(avg));
        bw.flush();
        br.close();
        bw.close();
    }
}
