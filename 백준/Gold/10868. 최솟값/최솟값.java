import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static long[] tree;
    static int N, M;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken()); //숫자 개수
        M = Integer.parseInt(st.nextToken()); //질의 개수

        int treeHeight = 0;
        int length = N;
        while (length != 0) {
            length /= 2;
            treeHeight++;
        }

        int treeSize = (int) Math.pow(2, treeHeight + 1);
        int leftNodeStartIndex = treeSize / 2 - 1;
        //트리 초기화
        tree = new long[treeSize + 1];
        Arrays.fill(tree, Integer.MAX_VALUE);

        //숫자 입력
        for (int i = leftNodeStartIndex + 1; i <= leftNodeStartIndex + N; i++) {
            tree[i] = Long.parseLong(br.readLine());
        }

        setTree(treeSize - 1);

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            s += leftNodeStartIndex;
            e += leftNodeStartIndex;
            System.out.println(getMin(s, e));
        }
    }

    private static long getMin(int s, int e) { //범위 내 최솟값 찾기
        long min = Long.MAX_VALUE;
        while (s <= e) {
            if (s % 2 == 1) {
                min = Math.min(min, tree[s]);
                s++;
            }

            if (e % 2 == 0) {
                min = Math.min(min, tree[e]);
                e--;
            }

            s /= 2;
            e /= 2;
        }
        return min;
    }

    private static void setTree(int i) { //초기 트리 생성 => 최솟값 트리
        while (i != 1) {
            if (tree[i / 2] > tree[i]) {
                tree[i / 2] = tree[i];
            }
            i--;
        }
    }
}
