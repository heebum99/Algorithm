import java.io.*;
import java.util.Arrays;
import java.util.Collections;

//한 줄의 단어는 글자들을 빈칸 없이 연속으로 나열해서 최대 15개의 글자들로 이루어진다. 또한 만들어진 다섯 개의 단어들의 글자 개수는 서로 다를 수 있다.
//심심해진 영석이는 칠판에 만들어진 다섯 개의 단어를 세로로 읽으려 한다. 세로로 읽을 때, 각 단어의 첫 번째 글자들을 위에서 아래로 세로로 읽는다.
//다음에 두 번째 글자들을 세로로 읽는다. 이런 식으로 왼쪽에서 오른쪽으로 한 자리씩 이동 하면서 동일한 자리의 글자들을 세로로 읽어 나간다. 위의 그림 1의 다섯 번째 자리를 보면 두 번째 줄의 다섯 번째 자리의 글자는 없다.
//이런 경우처럼 세로로 읽을 때 해당 자리의 글자가 없으면, 읽지 않고 그 다음 글자를 계속 읽는다. 그림 1의 다섯 번째 자리를 세로로 읽으면 D1gk로 읽는다.
//칠판에 붙여진 단어들이 주어질 때, 영석이가 세로로 읽은 순서대로 글자들을 출력하는 프로그램을 작성하시오.
public class Main {
//    static String[] words = new String[5];
//    static int[] lens = new int[5];

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[][] words = new char[5][15];

        for (int i = 0; i < words.length; i++) {
            String word = br.readLine();

            for (int j = 0; j < word.length(); j++) {
                words[i][j] = word.charAt(j);
            }
        }

        for (int i = 0; i < words[0].length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (words[j][i] != 0) {
                    bw.write(words[j][i]);
                }
            }
        }
        bw.flush();
        bw.close();
        br.close();
        //실패코드 => 왜 오류?
//        for (int i = 0; i < 5; i++) { //단어 입력
//            words[i] = br.readLine();
//            lens[i] = words[i].length();
//        }
//
//        reverse_sort(lens);
//
//        for (int i = 0; i < lens[0]; i++) {
//            for (int j = 0; j < 5; j++) {
//                if (words[j].length() - 1 < i) {
//                    continue;
//                }
//                bw.write(words[j].charAt(i));
//            }
//        }
//        bw.flush();
//        bw.close();
//        br.close();
//    }
//
//    static void reverse_sort(int[] lens) {
//        Arrays.sort(Arrays.stream(lens).boxed().toArray(), Collections.reverseOrder());
//    }
    }
}
