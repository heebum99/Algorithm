import java.util.HashMap;
import java.util.Scanner;

//첫째 줄에 저장된 사이트 주소의 수 N(1 ≤ N ≤ 100,000)과 비밀번호를 찾으려는 사이트 주소의 수 M(1 ≤ M ≤ 100,000)이 주어진다.
//두번째 줄부터 N개의 줄에 걸쳐 각 줄에 사이트 주소와 비밀번호가 공백으로 구분되어 주어진다. 사이트 주소는 알파벳 소문자, 알파벳 대문자, 대시('-'), 마침표('.')로 이루어져 있고, 중복되지 않는다
//비밀번호는 알파벳 대문자로만 이루어져 있다. 모두 길이는 최대 20자이다.
//N+2번째 줄부터 M개의 줄에 걸쳐 비밀번호를 찾으려는 사이트 주소가 한줄에 하나씩 입력된다. 이때, 반드시 이미 저장된 사이트 주소가 입력된다.
//첫 번째 줄부터 M개의 줄에 걸쳐 비밀번호를 찾으려는 사이트 주소의 비밀번호를 차례대로 각 줄에 하나씩 출력한다.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); //사이트 주소의 수
        int M = scanner.nextInt(); //비밀번호를 찾으려는 주소의 수
        int i = 0;
        String address; //주소
        String password; //암호
        HashMap<String, String> h = new HashMap<>();
        while (i < N) {
            address = scanner.next();
            password = scanner.next().toUpperCase(); //대문자로 변환
            h.put(address, password);
            i++;
        }
        i = 0;
        while (i < M) {
            address = scanner.next();
            System.out.println(h.get(address));
            i++;
        }
    }
}
