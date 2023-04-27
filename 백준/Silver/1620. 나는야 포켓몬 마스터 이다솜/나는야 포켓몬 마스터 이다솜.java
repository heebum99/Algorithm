import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<Integer, String> hm_itos = new HashMap<>();
        HashMap<String, Integer> hm_stoi = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String name = br.readLine();
            hm_itos.put(i + 1, name);
            hm_stoi.put(name, i + 1);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            String name = br.readLine();
            if (isInteger(name)) {
                sb.append(hm_itos.get(Integer.parseInt(name))).append("\n");
            } else {
                sb.append(hm_stoi.get(name)).append("\n");
            }
        }
        System.out.print(sb);
        br.close();
    }

    static boolean isInteger(String name) {
        try {
            Integer.parseInt(name);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
