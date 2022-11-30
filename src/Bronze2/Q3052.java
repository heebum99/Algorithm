package Bronze2;

//두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지 이다. 예를 들어, 7, 14, 27, 38을 3으로 나눈 나머지는 1, 2, 0, 2이다.
//수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.

import java.io.*;

public class Q3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num[] = new int[10]; //입력받을 숫자 10개
        boolean remain[] = new boolean[42]; //나머지를 담을 배열 나머지 0~41중 해당되면 true
        int count = 0;

        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(br.readLine());
            remain[num[i]%42] = true;
        }
        br.close();

        for (int i = 0; i < remain.length; i++) {
            if (remain[i] == true) {
                count++;
            }
        }
        bw.write(Integer.toString(count));
        bw.flush();
        bw.close();
    }
}
