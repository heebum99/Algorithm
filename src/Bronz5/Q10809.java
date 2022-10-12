package Bronz5;

//알파벳 소문자로만 이루어진 단어 S가 주어진다. 각각의 알파벳에 대해서,
// 단어에 포함되어 있는 경우에는 처음 등장하는 위치를,
// 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.

import java.util.Scanner;

public class Q10809 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] index = new int[26]; //각 알파벳의 인덱스 번호를 담기위한 배열

        for (int i = 0; i < index.length; i++) {
            index[i] = -1;
        }

        String S = scanner.next();

        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);

            if (index[ch - 'a'] == -1) { //아직 나오지 않은 알파벳이라면
                index[ch - 'a'] = i;
            }
        }

        for (int i = 0; i < index.length; i++) {
            System.out.print(index[i]+" ");
        }

    }
}
