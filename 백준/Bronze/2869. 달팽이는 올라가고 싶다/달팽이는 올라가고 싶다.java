import java.io.*;
import java.util.StringTokenizer;

//땅 위에 달팽이가 있다. 이 달팽이는 높이가 V미터인 나무 막대를 올라갈 것이다.
//달팽이는 낮에 A미터 올라갈 수 있다. 하지만, 밤에 잠을 자는 동안 B미터 미끄러진다. 또, 정상에 올라간 후에는 미끄러지지 않는다.
//달팽이가 나무 막대를 모두 올라가려면, 며칠이 걸리는지 구하는 프로그램을 작성하시오.
//첫째 줄에 세 정수 A, B, V가 공백으로 구분되어서 주어진다. (1 ≤ B < A ≤ V ≤ 1,000,000,000)
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken()); //달팽이가 낮에 올라갈 수 있는 길이
        int B = Integer.parseInt(st.nextToken()); //달팽이가 밤에 미끄러지는 길이
        int V = Integer.parseInt(st.nextToken()); //달팽이가 가야하는 총 길이

        //시간초과
//        int total_distance = 0;
//        int count_day = 0;
//
//        while (total_distance != V) {
//            count_day++;
//            total_distance += A;
//
//            if (total_distance == V) {
//                break;
//            } else {
//                total_distance -= B;
//            }
//        }
//
//        bw.write(Integer.toString(count_day));
        int count_day = (V - B) / (A - B); //(총 거리 - 떨어지는 거리) / (올라간거리 - 떨어지는 거리) => 정상에 도달했을때는 떨어지지 않기 때문에
        if ((V - B) % (A - B) != 0) {
            count_day++;
        }

        bw.write(Integer.toString(count_day));
        bw.flush();
        bw.close();
        br.close();
    }
}
