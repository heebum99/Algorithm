import java.io.*;
import java.util.Stack;

//나코더 기장 재민이는 동아리 회식을 준비하기 위해서 장부를 관리하는 중이다.
//재현이는 재민이를 도와서 돈을 관리하는 중인데, 애석하게도 항상 정신없는 재현이는 돈을 실수로 잘못 부르는 사고를 치기 일쑤였다.
//재현이는 잘못된 수를 부를 때마다 0을 외쳐서, 가장 최근에 재민이가 쓴 수를 지우게 시킨다.
//재민이는 이렇게 모든 수를 받아 적은 후 그 수의 합을 알고 싶어 한다. 재민이를 도와주자!
class Stack3 {
    Stack<Integer> stack = new Stack<>();

    public void push(int num) {
        stack.push(num);
    }

    public void remove() {
        if (!stack.isEmpty()) {
            stack.pop();
        }
    }

    public int pop() {
        return stack.isEmpty() ? 0 : stack.pop();
    }

    public boolean empty() {
        return stack.isEmpty();
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int K = Integer.parseInt(br.readLine()); //입력받을 숫자의 개수 K
        int num = 0; //입력받은 숫자
        int sum = 0; //입력받은 숫자의 합
        Stack3 stack = new Stack3();

        for (int i = 0; i < K; i++) {
            num = Integer.parseInt(br.readLine());

            switch (num) {
                case 0:
                    stack.remove();
                    break;
                default:
                    stack.push(num);
                    break;
            }
        }

        while (!stack.empty()) {
            sum += stack.pop();
        }

        bw.write(Integer.toString(sum));
        bw.flush();
        bw.close();
        br.close();
    }
}
