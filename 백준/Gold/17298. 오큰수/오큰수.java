import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

//크기가 N인 수열 A = A1, A2, ..., AN이 있다. 수열의 각 원소 Ai에 대해서 오큰수 NGE(i)를 구하려고 한다.
//Ai의 오큰수는 오른쪽에 있으면서 Ai보다 큰 수 중에서 가장 왼쪽에 있는 수를 의미한다. 그러한 수가 없는 경우에 오큰수는 -1이다.
//예를 들어, A = [3, 5, 2, 7]인 경우 NGE(1) = 5, NGE(2) = 7, NGE(3) = 7, NGE(4) = -1이다.
//A = [9, 5, 4, 8]인 경우에는 NGE(1) = -1, NGE(2) = 8, NGE(3) = 8, NGE(4) = -1이다.
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();

        int N = Integer.parseInt(br.readLine());
        long[] arr = new long[N]; //입력받은 수를 담는 배열
        long[] res = new long[N]; //결과, 즉 해당 인덱스의 오큰수를 담는 배열

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());

            while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) { //스택이 비어있지 않고 스택 안의 인덱스의 값이 새로 입력받은 값보다 작을 경우
                int num = stack.pop(); //스택 안의 인덱스를 pop한다.
                res[num] = arr[i]; //pop한 인덱스와 새로 입력 받은 값을 기반으로 결과 배열에 오큰수를 저장.
            }

            if (stack.isEmpty() || arr[stack.peek()] >= arr[i]) { //스택이 비었거나 스택안의 인덱스 의 값이 새로 입력받은 값보다 클 경우
                stack.push(i); //스택에 값이 아닌 인덱스를 push한다.
            }
        }

        while (!stack.isEmpty()) {
            res[stack.pop()] = -1;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(res[i]).append(" ");
        }
        System.out.println(sb);
        br.close();
    }
}
