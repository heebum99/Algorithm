package Bronze2;

import java.io.*;
import java.util.StringTokenizer;

//다장조는 c d e f g a b C, 총 8개 음으로 이루어져있다. 이 문제에서 8개 음은 다음과 같이 숫자로 바꾸어 표현한다. c는 1로, d는 2로, ..., C를 8로 바꾼다.
//1부터 8까지 차례대로 연주한다면 ascending, 8부터 1까지 차례대로 연주한다면 descending, 둘 다 아니라면 mixed 이다.
//연주한 순서가 주어졌을 때, 이것이 ascending인지, descending인지, 아니면 mixed인지 판별하는 프로그램을 작성하시오.
public class Q2920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int scale[] = new int[8]; //8개의 음계를 입력받기 위해 배열 생성
        int ascending[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int descending[] = {8, 7, 6, 5, 4, 3, 2, 1};
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");
        int asc_cnt = 0;
        int desc_cnt = 0;

        for (int i = 0; i < scale.length; i++) {
            scale[i] = Integer.parseInt(st.nextToken());
            if (scale[i] == ascending[i]) {
                asc_cnt++;
            } else if (scale[i] == descending[i]) {
                desc_cnt++;
            }
        }

        if (asc_cnt == 8) {
            System.out.print("ascending");
        } else if (desc_cnt == 8) {
            System.out.print("descending");
        } else {
            System.out.print("mixed");
        }
    }
}
