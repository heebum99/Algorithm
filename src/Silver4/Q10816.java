package Silver4;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()); //입력받을 카드 개수
        String input = br.readLine();
        ArrayList<Integer> card = new ArrayList<>(N);
        StringTokenizer st = new StringTokenizer(input, " ");
        while (st.hasMoreTokens()) { //숫자가 적혀있는 카드
            card.add(Integer.parseInt(st.nextToken()));
        }

        int M = Integer.parseInt(br.readLine()); //입력받을 상근이의 카드 수
        input = br.readLine();
        ArrayList<Integer> sang = new ArrayList<>(M);
        st = new StringTokenizer(input, " ");
        while (st.hasMoreTokens()) { //상근이가 가지고 있는 숫자 카드
            sang.add(Integer.parseInt(st.nextToken()));
        }
        br.close();

        int count[] = new int[M]; //가지고 있는 카드 수 확인
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (sang.get(i) == card.get(j)) {
                    count[i]++;
                }
            }
        }

        for (int i = 0; i < M; i++) {
            bw.write(count[i]+" ");
        }
        bw.flush();
        bw.close();
    }
}
