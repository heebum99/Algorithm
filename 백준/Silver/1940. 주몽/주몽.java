import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int count = 0;
        //투포인터 방식 => i와 j를 양끝으로
        int i = 0;
        int j = N - 1;
        while (i < j) {
            if (arr[i] + arr[j] == M) {
                count++;
                j--;
                i++;
            } else if (arr[i] + arr[j] > M) {
                j--;
            } else {
                i++;
            }
        }


        //투포인터 방식 => j를 i보다 1크게 한 방식
//        for (int i = 0; i < N; i++) {
//            for (int j = i + 1; j < N; j++) {
//                if (arr[i] + arr[j] == M) {
//                    count++;
//                } else if (arr[i] + arr[j] > M) {
//                    break;
//                }
//            }
//        }

        System.out.println(count);
        br.close();
    }
}
