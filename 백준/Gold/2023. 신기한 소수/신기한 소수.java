import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int N;

    public static void main(String[] args) throws IOException {
        //깊이 우선 탐색 DFS 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine()); //자리 수

        //한자리인 경우(1~9)에 소수는 2,3,5,7만 소수이므로 2,3,5,7로 시작
        DFS(2, 1);
        DFS(3, 1);
        DFS(5, 1);
        DFS(7, 1);

        br.close();

        //메모리 초과
//        int N = Integer.parseInt(br.readLine()); //몇자리 수인지
//        boolean[] prime = new boolean[100000000];
//        prime[0] = prime[1] = true;
//
//        for (int i = 2; i <= Math.sqrt(prime.length); i++) {
//            if (prime[i]) {
//                continue;
//            }
//            for (int j = i * i; j < prime.length; j += i) {
//                prime[j] = true;
//            }
//        }
//
//        int start_num = (int) Math.pow(10, N - 1);
//        int last_num = (int) Math.pow(10, N) - 1;
//        StringBuilder sb = new StringBuilder();
//
//        for (int i = start_num; i <= last_num; i++) {
//            if (!prime[i]) {
//                String num = "";
//                for (int j = 0; j <= N - 1; j++) {
//                    num += Integer.toString(i).charAt(j);
//
//                    if (prime[Integer.parseInt(num)]) {
//                        break;
//                    }
//
//                    if (j == N - 1) {
//                        sb.append(i).append("\n");
//                    }
//                }
//            }
//        }
//        System.out.println(sb);
    }

    private static void DFS(int num, int digit) { //DFS => 숫자와 자리수를 파라미터로 받음.
        if (digit == N) {
            if (isPrime(num)) {
                System.out.println(num);
            }
            return;
        }

        for (int i = 1; i <= 9; i++) {
            if (i % 2 == 0) { //짝수인 경우 탐색x
                continue;
            }
            if (isPrime(num * 10 + i)) {
                //재귀 호출
                DFS((num * 10 + i), digit + 1);
            }
        }

    }

    private static boolean isPrime(int num) { //소수 판별 함수
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
