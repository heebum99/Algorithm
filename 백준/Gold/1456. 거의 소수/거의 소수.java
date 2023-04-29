import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        long min = Long.parseLong(st.nextToken());
        long max = Long.parseLong(st.nextToken());

        long[] arr = new long[10000001]; //10^14의 제곱근 수 만큼 소수 구하기

        for (int i = 2; i < arr.length; i++) {
            arr[i] = i;
        }
        for (int i = 2; i <= Math.sqrt(arr.length); i++) { //제곱근만큼 에라토스테네스의 체 사용

            if (arr[i] == 0) {
                continue;
            }

            for (int j = i * i; j < arr.length; j += i) { //소수의 배수 지우기
                arr[j] = 0;
            }
        }

        int count = 0;
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] != 0) {
                long tmp = arr[i];

                //소수의 거듭제곱이 long타입의 범위를 넘어갈 수 있으므로 그냥 비교x
                while ((double) arr[i] <= (double) max / (double) tmp) {

                    if ((double) arr[i] >= (double) min / (double) tmp) {
                        count++;
                    }

                    //소수의 거듭제곱 계산
                    tmp *= arr[i];
                }
            }
        }
        System.out.println(count);
        br.close();
    }
}
