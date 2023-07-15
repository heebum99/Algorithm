import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] parent;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        //집합 => 유니온 파인드 알고리즘 사용
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        parent = new int[N + 1];

        //처음에는 부모 노드를 자기 자신의 인덱스로 초기화
        for (int i = 0; i < parent.length; i++) {
            parent[i] = i;
        }

        while (M-- > 0) {
            st = new StringTokenizer(br.readLine());
            int operator = Integer.parseInt(st.nextToken());
            int operand1 = Integer.parseInt(st.nextToken());
            int operand2 = Integer.parseInt(st.nextToken());

            if (operator == 0) { //합집합 => union() 호출
                union(operand1, operand2);
            } else if (operator == 1) {
                if (find(operand1) == find(operand2)) {
                    sb.append("YES").append("\n");
                } else {
                    sb.append("NO").append("\n");
                }
            }
        }
        System.out.print(sb);
    }

    private static int find(int op) {
        if (op == parent[op]) {
            return op;
        }
        return parent[op] = find(parent[op]); //재귀 호출을 통해 부모 노드 찾기
    }

    private static void union(int op1, int op2) {
        op1 = find(op1);
        op2 = find(op2);
        if (op1 != op2) {
            parent[op2] = op1;
        }
    }
}
