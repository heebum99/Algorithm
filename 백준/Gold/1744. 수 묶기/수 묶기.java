import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pos_queue = new PriorityQueue<>(Collections.reverseOrder()); //양수 큐는 값이 클수록 중요도가 높게
        PriorityQueue<Integer> neg_queue = new PriorityQueue<>(); //음수 큐는 작을수록 중요도 높게
        int result = 0;
        int zero = 0;

        //1보다 큰 양수인경우, 1인경우, 0인경우, 음수인경우
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num == 1) {
                result += num;
            } else if (num == 0) {
                zero++;
            } else if (num > 0) {
                pos_queue.add(num);
            } else {
                neg_queue.add(num);
            }
        }

        while (pos_queue.size() > 1) { //양수 큐 요소 개수가 2개 이상이면 진행
            result += pos_queue.poll() * pos_queue.poll();
        }

        if (!pos_queue.isEmpty()) { //양수 큐에 남아있는 요소 더해주기
            result += pos_queue.poll();
        }

        while (neg_queue.size() > 1) { //음수 큐 요소가 2개 이상이면 진행
            result += neg_queue.poll() * neg_queue.poll();
        }

        if (!neg_queue.isEmpty()) { //음수 큐 남아있는 요소 더해주기
            if (zero == 0) { //0개수가 없는 경우는 기존합에 더해주고 존재하는 경우엔 음수랑 0을 곱해 0을 만들어줌
                result += neg_queue.poll();
            }
        }

        System.out.println(result);
        br.close();
    }
}
