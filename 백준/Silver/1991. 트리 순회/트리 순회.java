import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] tree;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        tree = new int[26][2];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int root = st.nextToken().charAt(0) - 'A';
            char left = st.nextToken().charAt(0);
            char right = st.nextToken().charAt(0);

            if (left == '.') { //왼쪽 자식 노드가 없는 경우 -1 저장
                tree[root][0] = -1;
            } else {
                tree[root][0] = left - 'A';
            }
            if (right == '.') {
                tree[root][1] = -1;
            } else {
                tree[root][1] = right - 'A';
            }
        }
        preOrder(0);
        System.out.println();
        inOrder(0);
        System.out.println();
        postOrder(0);
        System.out.println();
    }

    private static void postOrder(int now) { //후위 순회 => 왼쪽 - 오른쪽 - 루트
        if (now == -1) {
            return;
        }
        postOrder(tree[now][0]);
        postOrder(tree[now][1]);
        System.out.print((char) (now + 'A'));
    }

    private static void inOrder(int now) { //중위 순회 => 왼쪽 - 루트 - 오른쪽
        if (now == -1) {
            return;
        }
        inOrder(tree[now][0]);
        System.out.print((char) (now + 'A'));
        inOrder(tree[now][1]);
    }

    private static void preOrder(int now) { //전위 순회 => 루트 - 왼쪽 - 오른쪽 순으로 순회
        if (now == -1) {
            return;
        }
        System.out.print((char) (now + 'A'));
        preOrder(tree[now][0]);
        preOrder(tree[now][1]);
    }
}
