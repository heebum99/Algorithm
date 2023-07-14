import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int C = Integer.parseInt(st.nextToken()); //홍보해야하는 최소 인원 수
        int N = Integer.parseInt(st.nextToken()); //홍보 가능한 도시 수

        //적어도 C만큼의 고객을 늘이기 위한 최소 비용 => dp[c] > dp[C+100]인 경우 있을수 있기에 dp[C]가 아닌 dp[C+101]로 선언.
        int[] dp = new int[C + 101];
        Arrays.fill(dp, Integer.MAX_VALUE); //초기화 되지 않은 상태로 넣으면 오버플로 발생하기 때문에 오버플로 방지
        dp[0] = 0;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int cost = Integer.parseInt(st.nextToken());
            int customer = Integer.parseInt(st.nextToken());

            for (int j = customer; j < C + 101; j++) {
                if (dp[j - customer] != Integer.MAX_VALUE) {
                    dp[j] = Math.min(dp[j], cost + dp[j - customer]);
                }
            }
        }

        int res = Integer.MAX_VALUE;
        for (int i = C; i < C + 101; i++) {
            res = Math.min(res, dp[i]);
        }
        System.out.println(res);


        //실패..
//        int[][] arr = new int[N][2]; //0 => 비용 1 => 홍보 인원 수
//        double[] efficiency = new double[N];
//
//        for (int i = 0; i < N; i++) {
//            st = new StringTokenizer(br.readLine());
//            arr[i][0] = Integer.parseInt(st.nextToken());
//            arr[i][1] = Integer.parseInt(st.nextToken());
//            efficiency[i] = (double) arr[i][1] / arr[i][0];
//
//        }
//
//        int res = 0;
//        int k = 1;
//        while (C > 0) {
//            // Stream을 사용하여 k+1 번째로 큰 값의 인덱스를 가져옴
//            int nextLargestIndex = IntStream.range(0, efficiency.length)
//                    .boxed() //IntStream을 Stream<Integer>로 변환
//                    .sorted(Comparator.comparingDouble(i -> -efficiency[i])) //내림차순 정렬
//                    .skip(k++)//k번째로 큰 값의 인덱스를 건너뜀
//                    .findFirst() //k+1번째로 큰 값의 인덱스 찾기
//                    .orElseThrow(() -> new IllegalArgumentException("배열의 크기가 충분하지 않습니다."));
//
//            if (C > arr[nextLargestIndex][1]) {
//                res += (C / arr[nextLargestIndex][1]) * arr[nextLargestIndex][0];
//                C %= arr[nextLargestIndex][1];
//            }
//        }
    }
}
