import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static long arr[];
    static long tmp[];
    static long result;

    public static void main(String[] args) throws IOException {
        //병합 정렬 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        arr = new long[N + 1];
        tmp = new long[N + 1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        result = 0;
        merge_sort(1, N);
        System.out.print(result);
        br.close();
    }

    private static void merge_sort(int start, int end) {
        if (end - start < 1) {
            return;
        }

        int middle = start + (end - start) / 2;
        //재귀 호출
        merge_sort(start, middle);
        merge_sort(middle + 1, end);

        for (int i = start; i <= end; i++) {
            tmp[i] = arr[i];
        }

        int k = start;
        int index1 = start;
        int index2 = middle + 1;

        while (index1 <= middle && index2 <= end) {
            if (tmp[index1] <= tmp[index2]) { //같은 수가 들어오는 경우도 포함
                arr[k++] = tmp[index1++];
            } else if (tmp[index1] > tmp[index2]) {
                result += (index2 - k);
                arr[k++] = tmp[index2++];
            }
        }
        while (index1 <= middle) {
            arr[k++] = tmp[index1++];
        }
        while (index2 <= end) {
            arr[k++] = tmp[index2++];
        }
    }
}
