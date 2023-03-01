package Bronze3;

//프로그램은 표준 입력에서 입력 데이터를 받는다. 프로그램의 입력은 T 개의 테스트 데이터로 이루어져 있는데 T 는 입력의 맨 첫 줄에 주어진다.
//각 테스트 데이터는 한 행으로서 H, W, N, 세 정수를 포함하고 있으며 각각 호텔의 층 수, 각 층의 방 수, 몇 번째 손님인지를 나타낸다(1 ≤ H, W ≤ 99, 1 ≤ N ≤ H × W).

import java.io.*;
import java.util.StringTokenizer;

public class Q10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine()); //입력받을 테스트 케이스
        int H[] = new int[T]; //H = 호텔의 층 수
        int W[] = new int[T]; // W = 층마다 방의 개수
        int N[] = new int[T]; //N = N번째 손님
        int result[] = new int[T]; //N번째 손님한테 배정되어야하는 방번호

        for (int i = 0; i < T; i++) {
            String s = br.readLine();
            StringTokenizer st = new StringTokenizer(s, " ");
            H[i] = Integer.parseInt(st.nextToken());
            W[i] = Integer.parseInt(st.nextToken());
            N[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < T; i++) {
            int count = 1;
            while (true) {
                if (H[i] >= N[i]) { //만일 손님 수가 호텔 층수보다 적다면 H01호로 배정
                    result[i] = (N[i] * 100) + count;
                    break;
                } else {
                    count++;
                    N[i] = N[i] - H[i];
                }
            }
        }

        for (int i = 0; i < T; i++) {
            bw.write(String.valueOf(result[i]));
            bw.newLine();
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
