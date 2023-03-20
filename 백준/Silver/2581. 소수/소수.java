import java.io.*;

//자연수 M과 N이 주어질 때 M이상 N이하의 자연수 중 소수인 것을 모두 골라 이들 소수의 합과 최솟값을 찾는 프로그램을 작성하시오.
//예를 들어 M=60, N=100인 경우 60이상 100이하의 자연수 중 소수는 61, 67, 71, 73, 79, 83, 89, 97 총 8개가 있으므로,
//이들 소수의 합은 620이고, 최솟값은 61이 된다
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        //에라토스테네스의 체 사용
        boolean[] prime = new boolean[N + 1]; //false 인 경우 소수
        prime[0] = prime[1] = true; //0과 1은 소수가 아님.
        int count = 0;
        int sum = 0;
        int min = 100000;

        for (int i = 2; i * i <= N; i++) {
            if (!prime[i]) { //i가 소수라면
                for (int j = i * i; j <= N; j += i) { //i의 배수들은 소수가 아님
                    prime[j] = true;
                }
            }
        }

        for (int i = M; i <= N; i++) { //소수 출력
            if (count == 0 && !prime[i]) {
                count++;
                min = i;
                sum += i;
            } else if (!prime[i]) {
                sum += i;
            }
        }

        if (count == 0) {
            bw.write("-1");
        } else {
            bw.write(Integer.toString(sum) + "\n");
            bw.write(Integer.toString(min));
        }

        bw.flush();
        bw.close();
        br.close();


        //제곱근으로 소수 구하기 => 틀린 코드
//        boolean prime = true; //true인 경우 소수로 취급
//        int[] ary = new int[N - M + 1];
//        ary[0] = -1;
//        int count = 0;
//
//        while (M <= N) {
//            prime = true;
//
//            for (int i = 2; i <= Math.sqrt(M) + 1; i++) { //M~N까지 소수찾기
//                if (M == 2) { //2는 소수
//                    break;
//                }
//
//                if (M % i == 0) {
//                    prime = false;
//                    break;
//                }
//            }
//
//            if (prime) {
//                ary[count++] = M;
//            }
//
//            M++;
//        }
//
//        if (ary[0] == -1) { //M~N까지 소수가 없는 경우 -1 출력
//            bw.write("-1");
//            bw.flush();
//            bw.close();
//            br.close();
//            return;
//        }
//
//        int sum = Arrays.stream(ary).sum();
//        bw.write(Integer.toString(sum) + "\n");
//        bw.write(Integer.toString(ary[0]));
//        bw.flush();
//        br.close();
//        bw.close();
    }
}
