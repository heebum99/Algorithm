package Bronz5;

//제연이는 그의 생일(2000년 3월 3일)을 기념해 자신이 가장 좋아하는 수를 20000303으로 나눈 나머지를 구해 그 수만큼 잠을 자기로 했다. 제연이가 얼마나 잠을 잘 수 있을지 구하자.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q14928 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String n = br.readLine();
        long remain = 0;
        for (int i = 0; i < n.length(); i++) {
            remain = (remain * 10 + n.charAt(i) - '0') % 20000303;
        }
        System.out.println(remain);
        br.close();
    }
}
