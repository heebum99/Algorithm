import java.io.*;
import java.util.StringTokenizer;

//각 테스트 케이스마다 첫 번째 숫자가 두 번째 숫자의 약수라면 factor를, 배수라면 multiple을, 둘 다 아니라면 neither를 출력한다.
//입력은 여러 테스트 케이스로 이루어져 있다. 각 테스트 케이스는 10,000이 넘지않는 두 자연수로 이루어져 있다. 마지막 줄에는 0이 2개 주어진다. 두 수가 같은 경우는 없다.
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());

            if (num1 == 0 && num2 == 0) { // 0,0 입력시 테스트 종료
                break;
            }

            if (num1 % num2 == 0) { //첫번째 숫자가 두번째 숫자의 배수인 경우
                bw.write("multiple");
                bw.newLine();
            } else if (num2 % num1 == 0) { //첫번째 숫자가 두번째 숫자의 약수인 경우
                bw.write("factor");
                bw.newLine();
            } else {
                bw.write("neither");
                bw.newLine();
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
