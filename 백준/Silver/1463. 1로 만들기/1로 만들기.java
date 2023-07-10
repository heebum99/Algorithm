import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static Integer[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        arr = new Integer[N + 1];
        arr[0] = arr[1] = 0;
        System.out.println(calc(N));
    }

    private static int calc(int n) {
        if (arr[n] == null) {
            if (n % 6 == 0) {
                arr[n] = Math.min(calc(n - 1), Math.min(calc(n / 3), calc(n / 2))) + 1;
            } else if (n % 3 == 0) {
                arr[n] = Math.min(calc(n / 3), calc(n - 1)) + 1;
            } else if (n % 2 == 0) {
                arr[n] = Math.min(calc(n / 2), calc(n - 1)) + 1;
            } else {
                arr[n] = calc(n - 1) + 1;
            }
        }
        return arr[n];
    }
}
