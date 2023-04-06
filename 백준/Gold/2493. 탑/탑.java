import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<Top> stack = new Stack<>();
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());

            if (stack.isEmpty()) {
                sb.append(0).append(" ");
                stack.add(new Top(i+1, num));
            } else {
                while (true) {
                    if (stack.isEmpty()) {
                        sb.append(0).append(" ");
                        stack.add(new Top(i+1, num));
                        break;
                    } else if (stack.peek().height > num) {
                        sb.append(stack.peek().num).append(" ");
                        stack.add(new Top(i+1, num));
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }
        }

        System.out.println(sb);
    }
}

class Top {
    int num;
    int height;

    public Top(int num, int height) {
        this.num = num;
        this.height = height;
    }
}
