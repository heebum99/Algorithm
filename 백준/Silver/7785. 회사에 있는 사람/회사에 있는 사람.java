import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, String> hm = new HashMap<>();
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String key = st.nextToken();
            String value = st.nextToken();
            if (!hm.containsKey(key)) {
                hm.put(key, value);
            } else {
                hm.remove(key);
            }
        }

        ArrayList<String> keys = new ArrayList<>(hm.keySet());
        Collections.sort(keys, Collections.reverseOrder());

        for (String key : keys) {
            System.out.println(key);
        }

        br.close();
    }
}
