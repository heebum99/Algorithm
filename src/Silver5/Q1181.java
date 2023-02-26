package Silver5;

//알파벳 소문자로 이루어진 N개의 단어가 들어오면 아래와 같은 조건에 따라 정렬하는 프로그램을 작성하시오.
//길이가 짧은 것부터
//길이가 같으면 사전 순으로
//단, 중복된 단어는 하나만 남기고 제거해야 한다.

import java.io.*;
import java.util.Arrays;

public class Q1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()); //단어의 개수 N
        String words[] = new String[N]; //N개의 단어를 담을 수 있는 배열 생성
        String tmp;

        for (int i = 0; i < N; i++) {
            words[i] = br.readLine();
        }

        for (int i = 0; i < N; i++) {
            for (int j = N - 1; j > i; j--)
                if (words[i].length() > words[j].length()) { //길이가 짧은 순대로 정렬
                    tmp = words[i];
                    words[i] = words[j];
                    words[j] = tmp;
                } else if (words[i].length() == words[j].length()) { //길이가 같다면 사전순으로 정렬
                    if (words[i].compareTo(words[j]) > 0) { //배열의 앞 요소가 더 크므로 자리를 교체
                        tmp = words[i];
                        words[i] = words[j];
                        words[j] = tmp;
                    } else if (words[i].compareTo(words[j]) == 0) { //중복된 단어는 한개를 제외하고 삭제
                        tmp = words[N - 1];
                        words[N-1] = words[j];
                        words[j] = tmp;
                        N--;
                    }
                }
        }

        for (int i = 0; i < N; i++) {
            bw.write(words[i]);
            bw.flush();
            System.out.println();
        }
        bw.close();
        br.close();
    }
}
