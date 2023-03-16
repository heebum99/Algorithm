import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); //입력받을 단어의 개수
        int count = 0;

        for (int i = 0; i < N; i++) {
            HashMap<Character, Integer> hm = new HashMap<>(); //알파벳과 포함된 인덱스 번호 저장
            String word = br.readLine();
            int len = word.length();

            for (int j = 0; j < len; j++) {
                if (hm.containsKey(word.charAt(j))) { //이미 존재하는 값이 나오는 경우
                    if ((hm.get(word.charAt(j)) == j - 1)) { //연속으로 나타났는지 여부
                        hm.put(word.charAt(j),j);
                    } else {
                        break;
                    }
                } else { //존재하지 않는 경우 => 알파벳과 인덱스 번호 입력
                    hm.put(word.charAt(j), j);
                }
                if (j == len - 1) {
                    count++;
                }
            }
        }

        bw.write(Integer.toString(count));
        bw.flush();
        bw.close();
        br.close();
    }
}
