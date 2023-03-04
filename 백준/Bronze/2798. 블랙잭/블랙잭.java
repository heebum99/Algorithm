import java.io.*;
import java.util.StringTokenizer;

//첫째 줄에 카드의 개수 N(3 ≤ N ≤ 100)과 M(10 ≤ M ≤ 300,000)이 주어진다.
//둘째 줄에는 카드에 쓰여 있는 수가 주어지며, 이 값은 100,000을 넘지 않는 양의 정수이다.
//합이 M을 넘지 않는 카드 3장을 찾을 수 있는 경우만 입력으로 주어진다.
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String card = br.readLine(); //첫째줄에 카드 개수 N과 카드의 합 M이 주어짐.
        StringTokenizer st = new StringTokenizer(card, " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] cards = new int[N];
        int count = 0;

        st = new StringTokenizer(br.readLine(), " "); //카드 입력
        while (st.hasMoreTokens()) {
            cards[count] = Integer.parseInt(st.nextToken());
            count++;
        }

        int sum = search(cards, N, M);

        bw.write(Integer.toString(sum));
        bw.flush();
        bw.close();
        br.close();
    }

    static int search(int ary[], int n, int max) { //3장의 카드를 고르고 합을 구해 M과 가장 가까운 3장의 카드를 찾는 메소드
        int temp = 0;
        int result = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    temp = ary[i] + ary[j] + ary[k];
                    if (temp <= max && temp > result) {
                        result = temp;
                        if (result == max) {
                            return result;
                        }
                    }

                }
            }
        }
        return result;
    }
}
