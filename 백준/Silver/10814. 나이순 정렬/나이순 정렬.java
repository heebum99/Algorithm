import java.io.*;
import java.util.*;

//온라인 저지에 가입한 사람들의 나이와 이름이 가입한 순서대로 주어진다.
//이때, 회원들을 나이가 증가하는 순으로, 나이가 같으면 먼저 가입한 사람이 앞에 오는 순서로 정렬하는 프로그램을 작성하시오.
//첫째 줄에 온라인 저지 회원의 수 N이 주어진다. (1 ≤ N ≤ 100,000)
//둘째 줄부터 N개의 줄에는 각 회원의 나이와 이름이 공백으로 구분되어 주어진다.
//나이는 1보다 크거나 같으며, 200보다 작거나 같은 정수이고, 이름은 알파벳 대소문자로 이루어져 있고, 길이가 100보다 작거나 같은 문자열이다. 입력은 가입한 순서로 주어진다.
//첫째 줄부터 총 N개의 줄에 걸쳐 온라인 저지 회원을 나이 순, 나이가 같으면 가입한 순으로 한 줄에 한 명씩 나이와 이름을 공백으로 구분해 출력한다.

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()); //입력받을 회원 수 N
        StringTokenizer st;
        String[][] users = new String[N][2]; //users[N][0] => 나이, users[N][1] => 이름 저장

        for (int i = 0; i < N; i++) {
            String input = br.readLine(); //회원 전체 정보
            st = new StringTokenizer(input, " ");
            users[i][0] = st.nextToken(); //나이
            users[i][1] = st.nextToken(); //이름
        }

        Arrays.sort(users, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
            }
        });

        for (int i = 0; i < N; i++) {
            bw.write(users[i][0] + " " + users[i][1]);
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();

        //---- HashMap 실패 -----
//        HashMap<Integer, String> users = new HashMap<>(); //회원 정보 기입 key = 나이, value = 이름 => key값으로 Colletion.sort
//        () 사용
//        StringTokenizer st;
//
//        for (int i = 0; i < N; i++) {
//            String input = br.readLine(); //회원 전체 정보
//            st = new StringTokenizer(input, " ");
//            users.put(Integer.parseInt(st.nextToken()), st.nextToken());
//        }
//
//        List<Integer> keySet = new ArrayList<>(users.keySet()); //List로 정렬하기위해 해시 맵 users의 key값을 가져온다
//        Collections.sort(keySet);
//
//        for (int key : keySet) {
//            bw.write(Integer.toString(key)+" "+users.get(key));
//            bw.newLine();
//        }

//        bw.flush();
//        bw.close();
//        br.close();

    }
}
