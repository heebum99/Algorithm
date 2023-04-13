import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄부터 N개의 줄에는 수가 주어진다.
//이 수는 절댓값이 1,000,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.
public class Main {
    static int arr[];
    static int tmp[];

    public static void main(String[] args) throws IOException {
        //병합 정렬
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        arr = new int[N + 1];
        tmp = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        merge_sort(1, N);

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            sb.append(arr[i]).append("\n");
        }

        System.out.print(sb);
        br.close();

        //버블 정렬
        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()); //주어진 N개의 수
        int ary[] = new int[N];

        for (int i = 0; i < N; i++) {
            ary[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(ary); //오름차순 정렬

        for (int i = 0; i < N; i++) {
            if (i >= 1 && ary[i] == ary[i - 1]) {
                continue;
            }
            bw.write(Integer.toString(ary[i]));
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();*/
    }

    private static void merge_sort(int start, int end) { //병합 정렬 알고리즘
        if (end - start < 1) {
            return;
        }

        int middle = start + (end - start) / 2;

        //재귀 호출 & 그룹 두개로 쪼개기
        merge_sort(start, middle);
        merge_sort(middle + 1, end);

        for (int i = start; i <= end; i++) {
            tmp[i] = arr[i];
        }

        int k = start;
        //투 포인터 사용
        int index1 = start;
        int index2 = middle + 1;

        //두 그룹을 병합하는 로직
        while (index1 <= middle && index2 <= end) {
            //양쪽 그룹의 index가 가리키는 값을 비교해 더 작은 수를 선택해 배열 arr에 저장.
            //선택된 데이터의 index는 오른쪽으로 한칸 이동(+1)

            if (tmp[index1] > tmp[index2]) {
                arr[k++] = tmp[index2++];
            } else {
                arr[k++] = tmp[index1++];
            }
        }

        //한쪽 그룹이 모두 선택된 후 정렬되지않고 남아있는 값 정리
        while (index1 <= middle) {
            arr[k++] = tmp[index1++];
        }
        while (index2 <= end) {
            arr[k++] = tmp[index2++];
        }
    }
}
