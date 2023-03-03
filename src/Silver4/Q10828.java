package Silver4;

import java.io.*;
import java.util.StringTokenizer;

//push X: 정수 X를 스택에 넣는 연산이다.
//pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//size: 스택에 들어있는 정수의 개수를 출력한다.
//empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
//top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.

class Stack {
    java.util.Stack<Integer> stack = new java.util.Stack<>();

    public void push(int num) {
        stack.push(num);
    }

    public int pop() {
        if (stack.size() == 0) {
            return -1;
        }
        int num = stack.pop();
        return num;
    }

    public int size() {
        return stack.size();
    }

    public int empty() {
        if (stack.size() == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public int top() {
        if (stack.size() == 0) {
            return -1;
        } else {
            return stack.get(stack.size() - 1);
        }
    }
}

public class Q10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack stack = new Stack(); //객체 생성
        int N = Integer.parseInt(br.readLine()); //명령 수 N

        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input, " ");
            String inst = st.nextToken(); //명령어 저장

            switch (inst) {
                case "push":
                    int num = Integer.parseInt(st.nextToken());
                    stack.push(num);
                    break;
                case "pop":
                    bw.write(Integer.toString(stack.pop()));
                    bw.newLine();
                    break;
                case "top":
                    bw.write(Integer.toString(stack.top()));
                    bw.newLine();
                    break;
                case "size":
                    bw.write(Integer.toString(stack.size()));
                    bw.newLine();
                    break;
                case "empty":
                    bw.write(Integer.toString(stack.empty()));
                    bw.newLine();
                    break;
            }
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
