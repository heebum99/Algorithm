import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        //우선순위 큐 => default = 낮은 숫자 순으로 우선순위 결정
        //높은 숫자 순으로 우선순위를 바꾸려면 Collections.reverseOrder() 메서드를 사용
        PriorityQueue<Integer> queue = new PriorityQueue<>((o1, o2) -> {
            int num1 = Math.abs(o1);
            int num2 = Math.abs(o2);

            if (num1 == num2) { //절대값이 같으면
                return o1 > o2 ? 1 : -1; //값이 작은 숫자가 높은 우선순위를 가짐.
            } else {
                return num1 - num2;
            }
        });

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());

            if (num == 0) { //절대값이 가장 작은 값 출력, 비어있다면 0 출력
                if (queue.isEmpty()) {
                    sb.append(0).append("\n");
                } else {
                    sb.append(queue.poll()).append("\n");
                }
            } else {
                queue.add(num);
            }
        }

        System.out.println(sb);

        br.close();
    }
}
