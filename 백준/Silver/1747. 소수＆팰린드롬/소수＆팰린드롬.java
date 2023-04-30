import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        /*int N = Integer.parseInt(br.readLine());
        int[] arr = new int[10000001]; //N의 범위가 1,000,000이므로 N보다 크거나 같은 소수중 펠린드롬을 구해야함 => 소수는 10,000,000까지 탐색

        for (int i = 2; i < arr.length; i++) {
            arr[i] = i;
        }

        //에라토스테네스의 체 방식
        for (int i = 2; i <= Math.sqrt(arr.length); i++) {
            if (arr[i] == 0) {
                continue;
            }

            //소수의 배수 지우기
            for (int j = i * i; j < arr.length; j += i) {
                arr[j] = 0;
            }
        }

        int i = N;
        while (true) { //N부터 1씩 증가시키면서 소수면서 펠린드롬수를 찾기
            if (arr[i] != 0) {
                int result = arr[i];
                if (isPalindrome(result)) {
                    System.out.println(result);
                    break;
                }
            }
            i++;
        }*/



        //틀린이유!!
        //N의 범위가 1000000이라고 크기를 1000001으로 잡으면 안됨.
        //1000000이 들어갔을때 나올 수 있는 값은 1003001이기때문에 크기는 1003002로 잡아줘야한다!!

        boolean[] prime = new boolean[1003002];
        prime[0] = prime[1] = true;

        int N = Integer.parseInt(br.readLine());

        for (int i = 2; i <= Math.sqrt(prime.length); i++) { //에라토스테네스의 체
            if (prime[i]) {
                continue;
            }

            for (int j = i * i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }

        for (int i = N; i < prime.length; i++) {
            if (!prime[i]) {
                if (isPalindrome(i)) {
                    System.out.println(i);
                    return;
                }
            }
        }

    }

    private static boolean isPalindrome(int n) {
        //투포인터로 펠린드롬수를 확인하는 방식
        char[] tmp = String.valueOf(n).toCharArray(); //정수를 문자열로 변환
        int s = 0;
        int e = tmp.length - 1;
        while (s < e) {
            if (tmp[s++] != tmp[e--]) {
                return false;
            }
        }

        return true;

        //범위를 절반으로 나눠서 절반만 확인하는 방식
       /* int len = Integer.toString(n).length();
        String num = Integer.toString(n);

        for (int i = 0; i < len / 2; i++) { //전체를 다 확인할 필요없이 반으로 나눠서 절반이 펠린드롬이면 펠린드롬수다.
            if (num.charAt(i) != num.charAt(len - (i + 1))) {
                return false;
            }
        }
        return true;*/
    }
}
