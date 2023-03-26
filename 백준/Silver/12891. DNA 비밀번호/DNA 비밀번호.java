import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main { //업데이트시 새로 들어오는 문자와 제거되는 문자만 비교해서 판단
    static int[] my_Arr;
    static int[] chk_Arr;

    static int chk_Secret;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int S = Integer.parseInt(st.nextToken()); //임의의 문자열의 길이
        int P = Integer.parseInt(st.nextToken()); //비밀번호로 사용할 문자열의 길이

        char[] dna = new char[S]; //임의로 만든 DNA 문자열
        dna = br.readLine().toCharArray();
        chk_Secret = 0; //조건에 부합한 문자 개수
        int count = 0; //조건에 맞게 만들 수 있는 암호 개수

        st = new StringTokenizer(br.readLine(), " ");

        chk_Arr = new int[4]; //암호(부분 문자열)에 부합하는 조건
        my_Arr = new int[4]; //내가 만든 부분 문자열

        for (int i = 0; i < 4; i++) {
            chk_Arr[i] = Integer.parseInt(st.nextToken());
            if (chk_Arr[i] == 0) {
                chk_Secret++;
            }
        }

        for (int i = 0; i < P; i++) { //초기 my_Arr 세팅
            Add(dna[i]);
        }

        if (chk_Secret == 4) { //조건에 부합한지 검사
            count++;
        }

        for (int i = P; i < S; i++) { //업데이트시 변경되는 새로 들어오는 문자 1개와 나가는 문자 1개만 보고 판단
            int j = i - P;
            Add(dna[i]);
            Remove(dna[j]);

            if (chk_Secret == 4) { //조건에 부합한지 검사
                count++;
            }
        }

        System.out.println(count);
        br.close();
    }

    private static void Remove(char c) {
        switch (c) {
            case 'A':
                if (my_Arr[0] == chk_Arr[0]) {
                    chk_Secret--;
                }
                my_Arr[0]--;
                break;
            case 'C':
                if (my_Arr[1] == chk_Arr[1]) {
                    chk_Secret--;
                }
                my_Arr[1]--;
                break;
            case 'G':
                if (my_Arr[2] == chk_Arr[2]) {
                    chk_Secret--;
                }
                my_Arr[2]--;
                break;
            case 'T':
                if (my_Arr[3] == chk_Arr[3]) {
                    chk_Secret--;
                }
                my_Arr[3]--;
                break;
        }
    }

    private static void Add(char c) {
        switch (c) {
            case 'A':
                my_Arr[0]++;
                if (my_Arr[0] == chk_Arr[0]) {
                    chk_Secret++;
                }
                break;
            case 'C':
                my_Arr[1]++;
                if (my_Arr[1] == chk_Arr[1]) {
                    chk_Secret++;
                }
                break;
            case 'G':
                my_Arr[2]++;
                if (my_Arr[2] == chk_Arr[2]) {
                    chk_Secret++;
                }
                break;
            case 'T':
                my_Arr[3]++;
                if (my_Arr[3] == chk_Arr[3]) {
                    chk_Secret++;
                }
                break;
        }
    }
}
