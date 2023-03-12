import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

//여러분도 알다시피 여러분의 프린터 기기는 여러분이 인쇄하고자 하는 문서를 인쇄 명령을 받은 ‘순서대로’, 즉 먼저 요청된 것을 먼저 인쇄한다.
//여러 개의 문서가 쌓인다면 Queue 자료구조에 쌓여서 FIFO- First In First Out - 에 따라 인쇄가 되게 된다.
//하지만 상근이는 새로운 프린터기 내부 소프트웨어를 개발하였는데, 이 프린터기는 다음과 같은 조건에 따라 인쇄를 하게 된다.
//현재 Queue의 가장 앞에 있는 문서의 ‘중요도’를 확인한다.
//나머지 문서들 중 현재 문서보다 중요도가 높은 문서가 하나라도 있다면, 이 문서를 인쇄하지 않고 Queue의 가장 뒤에 재배치 한다. 그렇지 않다면 바로 인쇄를 한다.
//예를 들어 Queue에 4개의 문서(A B C D)가 있고, 중요도가 2 1 4 3 라면 C를 인쇄하고, 다음으로 D를 인쇄하고 A, B를 인쇄하게 된다.
//여러분이 할 일은, 현재 Queue에 있는 문서의 수와 중요도가 주어졌을 때, 어떤 한 문서가 몇 번째로 인쇄되는지 알아내는 것이다.
//예를 들어 위의 예에서 C문서는 1번째로, A문서는 3번째로 인쇄되게 된다

//첫 줄에 테스트케이스의 수가 주어진다. 각 테스트케이스는 두 줄로 이루어져 있다.
//테스트케이스의 첫 번째 줄에는 문서의 개수 N(1 ≤ N ≤ 100)과, 몇 번째로 인쇄되었는지 궁금한 문서가 현재 Queue에서 몇 번째에 놓여 있는지를 나타내는 정수 M(0 ≤ M < N)이 주어진다.
//이때 맨 왼쪽은 0번째라고 하자. 두 번째 줄에는 N개 문서의 중요도가 차례대로 주어진다.
//중요도는 1 이상 9 이하의 정수이고, 중요도가 같은 문서가 여러 개 있을 수도 있다.


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;

        while (T-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");

            int N = Integer.parseInt(st.nextToken()); //문서의 개수
            int M = Integer.parseInt(st.nextToken()); //각 문서당 중요도

            LinkedList<int[]> queue = new LinkedList<>(); //큐로 사용할 링크드리스트 생성
            st = new StringTokenizer(br.readLine());

            for (int i = 0; i < N; i++) { //int 배열에 초기 위치, 중요도 저장
                queue.add(new int[]{i, Integer.parseInt(st.nextToken())});
            }

            int count = 0;

            while (!queue.isEmpty()) {
                int[] front = queue.poll(); //가장 첫 원소
                boolean isMax = true; //front의 원소가 가장 첫 원소인지 판단

                //큐에 남아있는 원소들과 중요도 비교
                for (int i = 0; i < queue.size(); i++) {
                    if (front[1] < queue.get(i)[1]) { //첫번째 뽑은 원소보다 큰 원소가 있다면
                        queue.offer(front); //첫번째 원소를 뒤로 보낸다.

                        for (int j = 0; j < i; j++) { //첫번째 원소보다 큰 원소를 기준으로 큐 앞에 있는 원소는 모두 뒤로 보낸다.
                            queue.offer(queue.poll());
                        }

                        isMax = false;
                        break;
                    }
                }

                if (!isMax) {
                    continue;
                }

                //front의 원소가 가장 큰 원소였을 경우
                count++;

                if (front[0] == M) {
                    bw.write(Integer.toString(count));
                    bw.newLine();
                    break;
                }
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
