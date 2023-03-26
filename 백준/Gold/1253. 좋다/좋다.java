import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        long[] arr = new long[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        int i, j, count = 0;
        long find;

        for (int k = 0; k < N; k++) { //투포인터 사용
            find = arr[k];
            i = 0;
            j = N - 1;

            while (i < j) {
                if (arr[i] + arr[j] == find) {
                    if (i != k && j != k) {
                        count++;
                        break;
                    } else if (i == k) { //자기 자신은 포함하면 안됨.
                        i++;
                    } else if (j == k) { //자기 자신은 포함하면 안됨.
                        j--;
                    }
                } else if (arr[i] + arr[j] > find) {
                    j--;
                } else {
                    i++;
                }
            }
        }
        System.out.println(count);
        br.close();
    }
}
