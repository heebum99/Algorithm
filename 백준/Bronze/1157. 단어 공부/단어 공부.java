//알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.
//첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine().toUpperCase(); //대소문자 구분x, 대문자로 출력하기 때문에 .toUpperCase()사용
        //A = 65, 영문자는 26개
        int ar[] = new int[26]; //영문자를 담을 배열 생성
        int max = 0;
        char ch = '?';
        for (int i = 0; i < input.length(); i++) {
            ar[(int) (input.charAt(i) - 'A')]++;
        }
        for (int i = 0; i < ar.length; i++) {
            if (max < ar[i]) {
                max = ar[i];
                ch = (char) (i + 'A');
            } else if (max == ar[i]) {
                ch = '?';
            }
        }
        br.close();
        bw.write(ch);
        bw.flush();
        bw.close();

    }
}
