import java.io.*;
import java.util.Collections;
import java.util.Stack;

//세계는 균형이 잘 잡혀있어야 한다. 양과 음, 빛과 어둠 그리고 왼쪽 괄호와 오른쪽 괄호처럼 말이다.
//정민이의 임무는 어떤 문자열이 주어졌을 때, 괄호들의 균형이 잘 맞춰져 있는지 판단하는 프로그램을 짜는 것이다.
//문자열에 포함되는 괄호는 소괄호("()") 와 대괄호("[]")로 2종류이고, 문자열이 균형을 이루는 조건은 아래와 같다.
//모든 왼쪽 소괄호("(")는 오른쪽 소괄호(")")와만 짝을 이뤄야 한다.
//모든 왼쪽 대괄호("[")는 오른쪽 대괄호("]")와만 짝을 이뤄야 한다.
//모든 오른쪽 괄호들은 자신과 짝을 이룰 수 있는 왼쪽 괄호가 존재한다.
//모든 괄호들의 짝은 1:1 매칭만 가능하다. 즉, 괄호 하나가 둘 이상의 괄호와 짝지어지지 않는다.
//짝을 이루는 두 괄호가 있을 때, 그 사이에 있는 문자열도 균형이 잡혀야 한다.
//정민이를 도와 문자열이 주어졌을 때 균형잡힌 문자열인지 아닌지를 판단해보자.

class Stack2 {
    Stack<Character> stack = new Stack<>();

    public void push(Character c) {
        stack.push(c);
    }

    public Character pop() {
        return stack.isEmpty() ? ' ' : stack.pop();
    }

    public int size() {
        return stack.size();
    }

    public void clear() {
        stack.clear();
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            Stack2 stack = new Stack2();
            String input = br.readLine();

            if (input.equals(".")) { // .이 입력되면 입력 종료
//                bw.write("\b\b");
                break;
            }

            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == '(') {
                    stack.push('(');
                } else if (input.charAt(i) == ')') {
                    if (stack.pop() != '(') {
//                        bw.write("no\n");
                        sb.append("no\n");
                        break;
                    }
                } else if (input.charAt(i) == '[') {
                    stack.push('[');
                } else if (input.charAt(i) == ']') {
                    if (stack.pop() != '[') {
//                        bw.write("no\n");
                        sb.append("no\n");
                        break;
                    }
                } else if (i == input.length() - 1 && input.charAt(i) == '.') {
//                    bw.write("yes\n");
                    if (stack.pop() != ' ') {
                        sb.append("no\n");
                        break;
                    } else {
                        sb.append("yes\n");
                        break;
                    }
                }
            }
            stack.clear();
        }
        //마지막 개행문자 삭제 하는법?
//        bw.write("\b"); => 안된다.
//        bw.write("".replaceAll("[\n\r]$", "")); => 안됨.
        sb.deleteCharAt(sb.length() - 1);
        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();
        br.close();
    }
}
