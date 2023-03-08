import java.io.*;
import java.util.LinkedList;
import java.util.Optional;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.concurrent.SynchronousQueue;

//정수를 저장하는 큐를 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.
//명령은 총 여섯 가지이다.
//push X: 정수 X를 큐에 넣는 연산이다.
//pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//size: 큐에 들어있는 정수의 개수를 출력한다.
//empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
//front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
class Queue {
    java.util.Queue<Integer> queue = new LinkedList<>(); //queue 클래스 객체 사용

    public void push(int num) {
        queue.offer(num);
    }

    public int pop() {
        if (queue.isEmpty()) {
            return -1;
        }
        int num = queue.element();
        queue.remove();
        return num;
    }

    public int size() {
        return queue.size();
    }

    public int empty() {
        if (queue.isEmpty()) {
            return 1;
        } else {
            return 0;
        }
    }

    public int front() {
        if (queue.isEmpty()) {
            return -1;
        } else {
            return queue.element();
        }
    }

    public int back() {
        if (queue.isEmpty()) {
            return -1;
        } else {
            for (int i = 0; i < queue.size() - 1; i++) { //마지막 원소 전까지 remove()를 통해 지우고 peek()으로 첫번째값 가져오기
                queue.offer(queue.poll());
            }
            int num = queue.poll();
            queue.offer(num);
            return num;
        }
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Queue queue = new Queue();
        int N = Integer.parseInt(br.readLine()); //입력받을 명령어 수

        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input, " ");
            String inst = st.nextToken(); //명령어 저장

            switch (inst) {
                case "push":
                    int num = Integer.parseInt(st.nextToken());
                    queue.push(num);
                    break;
                case "pop":
                    bw.write(Integer.toString(queue.pop()));
                    bw.newLine();
                    break;
                case "size":
                    bw.write(Integer.toString(queue.size()));
                    bw.newLine();
                    break;
                case "empty":
                    bw.write(Integer.toString(queue.empty()));
                    bw.newLine();
                    break;
                case "front":
                    bw.write(Integer.toString(queue.front()));
                    bw.newLine();
                    break;
                case "back":
                    bw.write(Integer.toString(queue.back()));
                    bw.newLine();
                    break;
            }
        }
        bw.flush();
        br.close();
        bw.close();
    }
}

