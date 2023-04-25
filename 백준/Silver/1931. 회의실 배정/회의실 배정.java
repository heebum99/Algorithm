import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[][] meet = new int[N][2]; //회의 시작시간과 종료시간을 배열에 저장
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            meet[i][0] = Integer.parseInt(st.nextToken());
            meet[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(meet, new Comparator<int[]>() { //종료시간 별로 정렬하기 위해 compare() 함수 재정의
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] == o2[1]) { //종료시간이 일치할 경우
                    return o1[0] - o2[0]; //시작시간 기준으로 정렬
                }
                return o1[1] - o2[1];
            }
        });

        int count = 0;
        int end = -1;
        for (int i = 0; i < N; i++) {
            if (meet[i][0] >= end) {
                end = meet[i][1];
                count++;
            }
        }
        System.out.println(count);

        br.close();
    }
}
