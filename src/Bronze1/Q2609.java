package Bronze1;

import java.io.*;
import java.util.StringTokenizer;

public class Q2609 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());
        int min = Math.min(num1, num2);
        int gcd = 0; //최대 공약수
        int lcm = 0; //최소 공배수 = (num1 * num2) / gcd

        for (int i = min; i >= 1; i--) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
                break;
            }
        }
        lcm = (num1 * num2) / gcd;
        System.out.println(gcd);
        System.out.println(lcm);
    }
}
