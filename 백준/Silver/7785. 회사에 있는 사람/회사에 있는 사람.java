import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //TreeMap을 이용한 정렬 => TreeMap에 객체를 저장하면 자동으로 정렬되는데,
        //키는 저장과 동시에 자동 오름차순으로 정렬되고 숫자 타입일 경우에는 값으로, 문자열 타입일 경우에는 유니코드로 정렬합니다.
        TreeMap<String, String> tm = new TreeMap<>(Comparator.reverseOrder()); //내림차순으로 정렬
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            tm.put(st.nextToken(), st.nextToken());
        }

        for (Map.Entry<String, String> e : tm.entrySet()) {
            if(e.getValue().equals("enter")){
                System.out.println(e.getKey());
            }
        }


        //hashmap을 이용한 정렬
//        HashMap<String, String> hm = new HashMap<>();
//        int N = Integer.parseInt(br.readLine());
//
//        StringTokenizer st;
//        for (int i = 0; i < N; i++) {
//            st = new StringTokenizer(br.readLine(), " ");
//            String key = st.nextToken();
//            String value = st.nextToken();
//            if (!hm.containsKey(key)) {
//                hm.put(key, value);
//            } else {
//                hm.remove(key);
//            }
//        }

//        ArrayList<String> keys = new ArrayList<>(hm.keySet());
//        Collections.sort(keys, Collections.reverseOrder());
//
//        for (String key : keys) {
//            System.out.println(key);
//        }

        br.close();
    }
}
