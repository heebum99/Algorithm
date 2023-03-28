import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");
        Deque<Node> deque = new LinkedList<>(); //슬라이딩 윈도우에서 정렬 효과를 얻기 위해서 덱을 사용
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            int curr_value = Integer.parseInt(st.nextToken());
            //시간 복잡도를 줄이기 위해서 값을 입력받으면서 바로 비교후 삽입 및 삭제 진행

            while (!deque.isEmpty() && deque.getLast().value > curr_value) { //정렬 과정
                deque.removeLast();
            }

            deque.addLast(new Node(curr_value, i));

            if (deque.getFirst().index <= i - L) {
                deque.removeFirst();
            }

            sb.append(deque.getFirst().value).append(" ");
        }

        System.out.println(sb);
    }

    public static class Node {
        public int value;
        public int index;

        public Node(int value, int index) {
            this.value = value;
            this.index = index;
        }
    }
}
