import java.io.*;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

//정수를 저장하는 덱(Deque)를 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.
//push_front X: 정수 X를 덱의 앞에 넣는다.
//push_back X: 정수 X를 덱의 뒤에 넣는다.
//pop_front: 덱의 가장 앞에 있는 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//pop_back: 덱의 가장 뒤에 있는 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//size: 덱에 들어있는 정수의 개수를 출력한다.
//empty: 덱이 비어있으면 1을, 아니면 0을 출력한다.
//front: 덱의 가장 앞에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//back: 덱의 가장 뒤에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//첫째 줄에 주어지는 명령의 수 N
class Deque { //덱 구현 클래스
    java.util.Deque<Integer> deque = new ArrayDeque<>(); //덱 객체 생성

    //덱 삽입 메서드 => offer, add (First,Last)
    public void push_front(int num) { //파라미터를 덱의 앞에 삽입
        deque.offerFirst(num);
    }

    public void push_back(int num) { //파라미터를 덱의 뒤에 삽입
        deque.offerLast(num);
    }

    //덱 추출 메서드 => remove, poll (First,Last)
    public int pop_front() { //덱의 가장 앞에 있는 수를 삭제 후 리턴
        if (deque.isEmpty()) {
            return -1;
        } else {
            return deque.removeFirst();
        }
    }

    public int pop_back() { //덱의 가장 뒤에 있는 수를 삭제 후 리턴
        if (deque.isEmpty()) {
            return -1;
        } else {
            return deque.removeLast();
        }
    }

    public int size() {
        return deque.size();
    }

    public int empty() {
        return deque.isEmpty() ? 1 : 0;
    }

    //덱의 요소를 삭제하지 않고 리턴 => get, peek (First,Last)
    public int front() { //덱의 가장 앞에 있는 수를 리턴 (삭제x)
        if (deque.isEmpty()) {
            return -1;
        } else {
            return deque.getFirst();
        }
    }

    public int back() {
        if (deque.isEmpty()) {
            return -1;
        } else {
            return deque.getLast();
        }
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()); //명령어 수 N
        StringTokenizer st;
        int num = 0; //push에 들어갈 인자
        Deque deque = new Deque();

        //덱 구현
        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            st = new StringTokenizer(input, " ");
            String inst = st.nextToken();

            switch (inst) {
                case "push_front":
                    num = Integer.parseInt(st.nextToken());
                    deque.push_front(num);
                    break;
                case "push_back":
                    num = Integer.parseInt(st.nextToken());
                    deque.push_back(num);
                    break;
                case "pop_front":
                    bw.write(Integer.toString(deque.pop_front()));
                    bw.newLine();
                    break;
                case "pop_back":
                    bw.write(Integer.toString(deque.pop_back()));
                    bw.newLine();
                    break;
                case "size":
                    bw.write(Integer.toString(deque.size()));
                    bw.newLine();
                    break;
                case "empty":
                    bw.write(Integer.toString(deque.empty()));
                    bw.newLine();
                    break;
                case "front":
                    bw.write(Integer.toString(deque.front()));
                    bw.newLine();
                    break;
                case "back":
                    bw.write(Integer.toString(deque.back()));
                    bw.newLine();
                    break;
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
