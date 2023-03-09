import java.io.*;
import java.util.Stack;

//입력 데이터는 표준 입력을 사용한다.
//입력은 T개의 테스트 데이터로 주어진다.
//입력의 첫 번째 줄에는 입력 데이터의 수를 나타내는 정수 T가 주어진다.
//각 테스트 데이터의 첫째 줄에는 괄호 문자열이 한 줄에 주어진다. 하나의 괄호 문자열의 길이는 2 이상 50 이하이다.
//출력은 표준 출력을 사용한다. 만일 입력 괄호 문자열이 올바른 괄호 문자열(VPS)이면 “YES”, 아니면 “NO”를 한 줄에 하나씩 차례대로 출력해야 한다.

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 스택으로 구현
        // (일때는 push )일때는 pop 스택이 비었다면 )일때 NO출력

        int T = Integer.parseInt(br.readLine()); //테스트 케이스 개수
        String[] ps = new String[T]; //괄호 문자열
//        boolean[] isPs = new boolean[T]; //true인 경우 괄호 문자열

        for (int i = 0; i < T; i++) {
            ps[i] = br.readLine();
        }


        for (int i = 0; i < T; i++) {
            Stack<Character> stack = new Stack<>();
            for (int j = 0; j < ps[i].length(); j++) {
                if (ps[i].charAt(j) == '(') {
                    stack.push('(');
                } else if (ps[i].charAt(j) == ')') {
                    if (stack.isEmpty()) {
                        stack.push(')');
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }
            if (stack.isEmpty()) {
                bw.write("YES");
                bw.newLine();
            } else {
                bw.write("NO");
                bw.newLine();
            }
        }
//        for (int i = 0; i < T; i++) {
//            int left_count = 0; // (
//            int right_count = 0; // )
//            for (int j = 0; j < ps[i].length(); j++) {
//                if (ps[i].charAt(j) == '(') {
//                    left_count++;
//                } else {
//                    right_count++;
//                }
//                if (left_count - right_count < 0) {
//                    bw.write("NO");
//                    bw.newLine();
//                    break;
//                } else if (left_count - right_count == 0) {
//                    continue;
//                } else {
//
//                }
//
//            }
//
//        }

        bw.flush();
        bw.close();
        br.close();

    }
}
