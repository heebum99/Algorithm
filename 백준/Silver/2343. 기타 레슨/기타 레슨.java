import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //이진탐색 사용
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine(), " ");

        int[] arr = new int[N];
        int start = 0;
        int end = 0;

        //start = 레슨 중 최고 길이
        //end = 모든 레슨의 합
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());

            if (start < arr[i]) {
                start = arr[i];
            }
            end += arr[i];
        }
        while (start <= end) {
            int mid = (start + end) / 2; //기준이 되는 블루레이 크기
            int sum = 0;
            int count = 0; //블루레이 개수 => M개 이하인 경우만 가능

            for (int i = 0; i < N; i++) {
                if (sum + arr[i] > mid) {
                    count++;
                    sum = 0;
                }
                sum += arr[i];
            }
            if (sum != 0) { //마지막 블루레이의 경우에도 한개 추가
                count++;
            }
            if (count > M) { //블루레이 개수가 M보다 크면 mid 값을 키워야함.
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        System.out.println(start);
        br.close();
    }
}
