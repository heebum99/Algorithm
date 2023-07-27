import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static long[] tree;
    static final int MOD = 1000000007;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); //숫자 개수
        int M = Integer.parseInt(st.nextToken()); //변경이 일어나는 횟수
        int K = Integer.parseInt(st.nextToken()); //구간 곱을 구하는 횟수

        int treeHeight = 0; //k
        int length = N;
        while (length != 0) { //2^k >= N이 되는 k최솟값 구하는 과정
            length /= 2;
            treeHeight++;
        }

        int treeSize = (int) Math.pow(2, treeHeight + 1);
        int leftNodeStartIndex = treeSize / 2 - 1;
        tree = new long[treeSize + 1];
        for (int i = 0; i < tree.length; i++) { //곱 연산을 위해 초깃값은 1로 초기화
            tree[i] = 1;
        }

        for (int i = leftNodeStartIndex + 1; i <= leftNodeStartIndex + N; i++) {
            tree[i] = Long.parseLong(br.readLine());
        }

        setTree(treeSize - 1);

        for (int i = 0; i < M + K; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());
            long e = Long.parseLong(st.nextToken());

            //모든 함수에서 곱셈을 할 때마다 MOD 연산 수행
            if (a == 1) {
                changeVal(leftNodeStartIndex + s, e);
            } else if (a == 2) {
                s += leftNodeStartIndex;
                e += leftNodeStartIndex;
                System.out.println(getMul(s, (int) e));
            } else {
                return;
            }
        }
    }

    private static long getMul(int s, int e) {
        long partMul = 1;
        while (s <= e) {
            if (s % 2 == 1) {
                partMul = partMul * tree[s] % MOD;
                s++;
            }

            if (e % 2 == 0) {
                partMul = partMul * tree[e] % MOD;
                e--;
            }

            s /= 2;
            e /= 2;
        }
        return partMul;
    }

    private static void changeVal(int index, long val) {
        tree[index] = val;
        while (index > 1) { //현재 노드의 양쪽 자식노드의 값을 곱
            index /= 2;
            tree[index] = tree[index * 2] % MOD * tree[index * 2 + 1] % MOD;
        }
    }

    private static void setTree(int i) {
        while (i != 1) {
            tree[i / 2] = tree[i / 2] * tree[i] % MOD;
            i--;
        }
    }
}
