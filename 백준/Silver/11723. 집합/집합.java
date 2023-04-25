import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st;
        String input = "";
        int num;
        int S = 0;
        //비트 마스킹으로 풀기
        StringBuilder sb = new StringBuilder();
        while (N-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");
            input = st.nextToken();

            switch (input) {
                //S의 각 비트 자리수는 0~19로 표현 => num이 20인 경우 -1을 해서 범위를 맞춰준다.
                case "add":
                    num = Integer.parseInt(st.nextToken()) - 1;
                    S |= (1 << num);
                    break;
                case "remove":
                    num = Integer.parseInt(st.nextToken()) - 1;
                    S &= ~(1 << num);
                    break;
                case "check":
                    num = Integer.parseInt(st.nextToken()) - 1;
                    if ((S & (1 << num)) != 0) {
                        sb.append(1).append("\n");
                    } else {
                        sb.append(0).append("\n");
                    }
                    break;
                case "toggle":
                    num = Integer.parseInt(st.nextToken()) - 1;
                    S ^= (1 << num);
                    break;
                case "all":
                    S = (1 << 20) - 1;
                    break;
                case "empty":
                    S = 0;
                    break;
            }
        }
        System.out.print(sb);

        //시간 초과
        /*StringTokenizer st;
        String input = "";
        HashSet<Integer> hashSet = new HashSet<>();
        List<Integer> S = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
        List<Integer> arr = new ArrayList<>();
        int num;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            input = st.nextToken();

            switch (input) {
                case "add":
                    num = Integer.parseInt(st.nextToken());
                    hashSet.add(num);
                    break;
                case "remove":
                    num = Integer.parseInt(st.nextToken());
                    hashSet.remove(num);
                    break;
                case "check":
                    num = Integer.parseInt(st.nextToken());
                    if (hashSet.contains(num)) {
                        System.out.println(1);
                    } else {
                        System.out.println(0);
                    }
                    break;
                case "toggle":
                    num = Integer.parseInt(st.nextToken());
                    if (hashSet.contains(num)) {
                        hashSet.remove(num);
                    } else {
                        hashSet.add(num);
                    }
                    break;
                case "all":
                    hashSet.removeAll(hashSet);
                    hashSet.addAll(S);
                    break;
                case "empty":
                    hashSet.removeAll(hashSet);
                    break;
            }
        }*/
        br.close();
    }
}
