import java.io.*;
import java.util.StringTokenizer;

//주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.
//첫 줄에 수의 개수 N이 주어진다. N은 100이하이다.
//다음으로 N개의 수가 주어지는데 수는 1,000 이하의 자연수이다.
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); //입력된 숫자의 개수
        int num[] = new int[N];
        boolean prime[] = new boolean[N];


        String input = br.readLine(); //숫자 입력
        StringTokenizer st = new StringTokenizer(input, " ");
        int count = 0;
        while (st.hasMoreTokens()) {
            num[count++] = Integer.parseInt(st.nextToken());
        }

        int primeNum_count = 0;
        for (int i = 0; i < N; i++) {
            if (isPrime(num[i]) == true) {
                primeNum_count++;
            }
        }

        bw.write(Integer.toString(primeNum_count));
        bw.flush();
        bw.close();
        br.close();

    }

    //소수인지 판단하기 위한 방법
    //1. 제곱근으로 판단 => 3~수의 제곱근까지 나눠 떨어지는지 여부 확인
    //2. 에라토스테네스의 체 => 2,3,5....의 배수를 지워나가는 형식
    static boolean isPrime(int num) { //소수인지 판단하는 메소드, 제곱근을 이용
        if (num == 1) { //1은 소수가 아님
            return false;
        } else if (num % 2 == 0) { //짝수 중 2만 유일하게 소수
            return num == 2 ? true : false;
        }
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
