import java.util.Scanner;


public class Solution {
    static int[] arr;
    static int cnt;
    static int answer = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int T = sc.nextInt();

        for (int i = 1; i <= T; i++) {
            String input = sc.next(); //숫자판
            cnt = sc.nextInt(); //교환 횟수
            arr = new int[input.length()];

            for (int j = 0; j < input.length(); j++) {
                arr[j] = input.charAt(j) - '0';
            }

            if (arr.length < cnt) {
                cnt = arr.length;
            }

            answer = dfs(0, 0);
            System.out.println("#" + (++num) + " " + answer);
            answer = 0;
        }

    }

    private static int dfs(int start, int count) {

        //교환 횟수를 다 사용한 경우
        if (cnt == count) {
            int result = 0;
            for (int i = 0; i < arr.length; i++) {
                result += (Math.pow(10, i) * arr[arr.length - i - 1]);
            }

            answer = Math.max(answer, result);

            return answer;
        }

        for (int j = start; j < arr.length; j++) {
            for (int k = j + 1; k < arr.length; k++) {
                //swap 진행
                swap(j, k);

                dfs(j, count + 1);

                //원상 복구를 위해 다시 swap 진행
                swap(j, k);
            }
        }
        return answer;
    }

    private static void swap(int j, int k) {
        int temp;

        temp = arr[j];
        arr[j] = arr[k];
        arr[k] = temp;
    }

}