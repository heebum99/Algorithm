import java.io.*;
import java.util.ArrayList;

//어떤 숫자 n이 자신을 제외한 모든 약수들의 합과 같으면, 그 수를 완전수라고 한다.
//예를 들어 6은 6 = 1 + 2 + 3 으로 완전수이다.
//n이 완전수인지 아닌지 판단해주는 프로그램을 작성하라.
//입력의 마지막엔 -1이 주어진다.
//테스트케이스 마다 한줄에 하나씩 출력해야 한다.
//n이 완전수라면, n을 n이 아닌 약수들의 합으로 나타내어 출력한다(예제 출력 참고).
//이때, 약수들은 오름차순으로 나열해야 한다.
//n이 완전수가 아니라면 n is NOT perfect. 를 출력한다.
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            ArrayList<Integer> array = new ArrayList<>(); //약수들을 담을 동적배열 생성

            int num = Integer.parseInt(br.readLine());
            int sum = 0;

            if (num == -1) { //-1이 입력되면 종료
                break;
            }

            for (int i = 1; i < num; i++) { //약수 찾기
                if (num % i == 0) {
                    sum += i;
                    array.add(i);
                }
            }

            if (sum == num) { //자신을 제외한 모든 약수의 합이 자신과 같은지 확인
                bw.write(Integer.toString(num) + " = ");
                for (int i = 0; i < array.size(); i++) {
                    if (i == array.size() - 1) {
                        bw.write(Integer.toString(array.get(i))+"\n");
                    } else {
                        bw.write(Integer.toString(array.get(i)) + " + ");
                    }
                }
            } else {
                bw.write(Integer.toString(num) + " is NOT perfect.\n");
            }
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
