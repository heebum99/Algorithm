import java.io.*;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

//1번부터 N번까지 N명의 사람이 원을 이루면서 앉아있고, 양의 정수 K(≤ N)가 주어진다.
//이제 순서대로 K번째 사람을 제거한다. 한 사람이 제거되면 남은 사람들로 이루어진 원을 따라 이 과정을 계속해 나간다.
//이 과정은 N명의 사람이 모두 제거될 때까지 계속된다. 원에서 사람들이 제거되는 순서를 (N, K)-요세푸스 순열이라고 한다.
//예를 들어 (7, 3)-요세푸스 순열은 <3, 6, 2, 7, 5, 1, 4>이다.

class Deque {
    java.util.Deque<Integer> deque = new ArrayDeque<>();

    public void set(int num) { // 1~N번까지의 사람을 앉힌다. 뒤에서부터 삽입하기 위해 offerLast()사용 => 1,2,3,4....N
        deque.offerLast(num);
    }

    public int remove(int num) { //파라미터 num수마다 해당 번째사람 제거하고 제거된 번호 리턴 => 해당번호가 아니면 앞에서 꺼내서 뒤에 삽입
        for (int i = 0; i < num - 1; i++) {
            deque.offerLast(deque.removeFirst());
        }
        return deque.removeFirst();
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        
        //자료구조 덱을 이용한 문제해결
        Deque deque = new Deque();

        for (int i = 0; i < N; i++) { // 1~N번 사람 셋팅
            deque.set(i + 1);
        }

        bw.write("<");
        for (int i = 0; i < N; i++) { //K번째의 사람을 제거하는것을 N번 반복
            if (i == N-1) {
                bw.write(Integer.toString(deque.remove(K)));
            } else {
                bw.write(Integer.toString(deque.remove(K))+", ");
            }
        }
        bw.write(">");

        bw.flush();
        bw.close();
        br.close();

    }
}
