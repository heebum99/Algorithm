package Bronz5;

//���ĺ� �ҹ��ڷθ� �̷���� �ܾ� S�� �־�����. ������ ���ĺ��� ���ؼ�,
// �ܾ ���ԵǾ� �ִ� ��쿡�� ó�� �����ϴ� ��ġ��,
// ���ԵǾ� ���� ���� ��쿡�� -1�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

import java.util.Scanner;

public class Q10809 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] index = new int[26]; //�� ���ĺ��� �ε��� ��ȣ�� ������� �迭

        for (int i = 0; i < index.length; i++) {
            index[i] = -1;
        }

        String S = scanner.next();

        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);

            if (index[ch - 'a'] == -1) { //���� ������ ���� ���ĺ��̶��
                index[ch - 'a'] = i;
            }
        }

        for (int i = 0; i < index.length; i++) {
            System.out.print(index[i]+" ");
        }

    }
}
