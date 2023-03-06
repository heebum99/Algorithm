package Silver4;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

//N장의 카드가 있다. 각각의 카드는 차례로 1부터 N까지의 번호가 붙어 있으며,
//1번 카드가 제일 위에, N번 카드가 제일 아래인 상태로 순서대로 카드가 놓여 있다.
//카드가 한 장 남을 때까지 반복하게 된다. 우선, 제일 위에 있는 카드를 바닥에 버린다.
//그 다음, 제일 위에 있는 카드를 제일 아래에 있는 카드 밑으로 옮긴다.
public class Q2164 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //Queue 클래스 이용
        Queue<Integer> queue = new LinkedList<>();
        int N = Integer.parseInt(br.readLine());


        for (int i = 0; i < N; i++) { //큐 안에 숫자를 집어 넣는다.
            queue.offer(i + 1);
        }

        int count = 1;
        while (N > 1) {
            if (count % 2 == 1) { //1,3,5...번째 시행에서는 첫번째 값을 버림.
                queue.remove();
                count++;
                N--;
            } else { //2,4,6...번째 시행에서는 첫번째 값을 맨뒤로 보냄
                int temp = queue.poll();
                queue.offer(temp);
                count++;
            }
        }

        bw.write(Integer.toString(queue.poll()));
        bw.close();
        br.close();

    }
}
