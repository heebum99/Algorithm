import java.io.*;
import java.util.HashMap;

//전화를 걸고 싶은 번호가 있다면, 숫자를 하나를 누른 다음에 금속 핀이 있는 곳 까지 시계방향으로 돌려야 한다.
//숫자를 하나 누르면 다이얼이 처음 위치로 돌아가고, 다음 숫자를 누르려면 다이얼을 처음 위치에서 다시 돌려야 한다.
//숫자 1을 걸려면 총 2초가 필요하다. 1보다 큰 수를 거는데 걸리는 시간은 이보다 더 걸리며, 한 칸 옆에 있는 숫자를 걸기 위해선 1초씩 더 걸린다.
//상근이의 할머니는 전화 번호를 각 숫자에 해당하는 문자로 외운다. 즉, 어떤 단어를 걸 때, 각 알파벳에 해당하는 숫자를 걸면 된다. 예를 들어, UNUCIC는 868242와 같다.
//할머니가 외운 단어가 주어졌을 때, 이 전화를 걸기 위해서 필요한 최소 시간을 구하는 프로그램을 작성하시오.
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = 0;
        int time = 3; //1일때 2초 그 이후 1초씩 증가, 2일때 3초 ...
        HashMap<Character, Integer> hm = new HashMap<>();
        String input = br.readLine();
        int len = input.length();

        //아스키 코드를 이용해서 hashmap에 저장 => A=65 ~ Z=90
        for (int i = 65; i <= 90; i++) { //2일때부터 시작
            hm.put((char) i, time);
            count++;
            if (i >= 80 && i <= 83 || i >= 87 && i <= 90) {
                if (count == 4) {
                    count = 0;
                    time++;
                }
            } else {
                if (count == 3) {
                    count = 0;
                    time++;
                }
            }
        }

        int result = 0;
        for (int i = 0; i < len; i++) {
            result += hm.get(input.charAt(i));
        }

        bw.write(Integer.toString(result));
        bw.flush();
        bw.close();
        br.close();
    }
}
