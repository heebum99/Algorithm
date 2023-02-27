import java.io.*;

//첫 번째 영화의 제목은 "세상의 종말 666", 두 번째 영화의 제목은 "세상의 종말 1666"와 같이 이름을 지을 것이다.
//일반화해서 생각하면, N번째 영화의 제목은 세상의 종말 (N번째로 작은 종말의수) 와 같다.
//숌이 만든 N번째 영화의 제목에 들어간 수를 출력하는 프로그램을 작성하시오. 숌은 이 시리즈를 항상 차례대로 만들고, 다른 영화는 만들지 않는다.
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int count = 1; //666을 포함한 숫자가 나온 횟수 ex)1666...
        int title_num = 666; //첫번째 영화 이름

        while (N != count) {
            title_num++;

            if (String.valueOf(title_num).contains("666")) {
                //제목의 숫자가 666을 포함하고 있으면 count를 증가시킴으로 N번째 영화는 666을 N-1번 포함해야한다.
                count++;
            }
        }

        bw.write(String.valueOf(title_num));
        bw.flush();

        bw.close();
        br.close();
    }
}
