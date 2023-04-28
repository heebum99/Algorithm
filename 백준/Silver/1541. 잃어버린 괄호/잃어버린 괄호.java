import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int ans = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //split 사용
        String s = br.readLine();

        //-를 기준으로 나누기
        String[] sub = s.split("-");

        for (int i = 0; i < sub.length; i++) {
            int tmp = mySum(sub[i]);

            if (i == 0) { //첫번째 수만 더해준다.
                ans += tmp;
            } else { //나머지 수는 빼준다.
                ans -= tmp;
            }
        }

        System.out.println(ans);
        br.close();

        //StringTokenizer 사용
        /*int sum = Integer.MAX_VALUE; //첫 번째 수인지 여부를 확인하기 위해서 설정

        //결과가 최소로 나오려면 덧셈 먼저 수행 후 뺄셈 수행
        StringTokenizer sub = new StringTokenizer(br.readLine(), "-");
        while (sub.hasMoreTokens()) {
            int temp = 0;

            StringTokenizer add = new StringTokenizer(sub.nextToken(), "+");
            while (add.hasMoreTokens()) {
                temp += Integer.parseInt(add.nextToken());
            }

            if (sum == Integer.MAX_VALUE) { //첫번째 수는 temp 값을 sum에 대입
                sum = temp;
            } else { //두번째부터는 sum 값에서 temp 값만큼 빼주기
                sum -= temp;
            }
        }
        System.out.println(sum);
        br.close();*/
    }

    private static int mySum(String s) {
        int sum = 0;
        String[] tmp = s.split("[+]"); //+의 경우에는 허상연산자로 +만 써주면 안되고 //+ 나 [+]로 표현해줘야함
        for (int i = 0; i < tmp.length; i++) {
            sum += Integer.parseInt(tmp[i]);
        }
        return sum;
    }
}
