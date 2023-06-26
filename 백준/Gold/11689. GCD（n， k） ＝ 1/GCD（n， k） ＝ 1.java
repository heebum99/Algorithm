import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //오일러의 피 사용 => 1~n 까지의 숫자중 n과 서로소인 숫자 개수 구하기
        long n = Long.parseLong(br.readLine());
        long rs = n;

        for (long i = 2; i <= Math.sqrt(n); i++) { //시간 효율을 위해 제곱근까지만 진행
            if (n % i == 0) { //소인수 확인 => 소수가 아닌 누군가의 배수들은 15행에 의해 이미 지워짐
                rs = rs - rs / i;
                while (n % i == 0) {
                    n /= i;
                }
            }
        }

        if (n > 1) { //n의 제곱근까지만 탐색했으므로 누락된 케이스인 n일 경우 제거
            rs = rs - rs / n;
        }

        System.out.println(rs);


        //NumberFormat에러 => n은 10^12까지 가능하기에 long 타입으로 해결해야함...
        //배열은 개수는 long 타입으로 불가능 => 배열 사용 불가
//        int n = Integer.parseInt(br.readLine());
//        int[] arr = new int[n + 1];
//        for (int i = 1; i <= n; i++) {
//            arr[i] = i;
//        }
//
//        for (int i = 2; i <= n; i++) {
//            if (arr[i] != i) {
//                continue;
//            }
//            for (int j = i; j <= n; j = j + i) {
//                arr[j] = arr[j] - (arr[j] / i);
//            }
//        }
//
//        System.out.println(arr[n]);
    }
}
