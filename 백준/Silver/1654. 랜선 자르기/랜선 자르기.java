import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int[] arr = new int[K];

        long max = 0;

        for (int i = 0; i < K; i++) { //K개의 랜선에 대해서 입력받기
            arr[i] = Integer.parseInt(br.readLine());
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        max++;

        long min = 0;
        long mid = 0;

        while (min < max) {
            mid = (max + min) / 2; //범위내 중간길이 구하기
            long count = 0; //mid만큼의 길이로 토막냈을때 나오는 랜선의 개수

            for (int i = 0; i < K; i++) {
                count += (arr[i] / mid);
            }

            /*
             *  [upper bound 형식]
             *
             *  mid 길이로 잘랐을 때의 개수가 만들고자 하는 랜선의 개수보다 작다면
             *  자르고자 하는 길이를 줄이기 위해 최대 길이를 줄인다.
             *  그 외에는 자르고자 하는 길이를 늘려야 하므로 최소 길이를 늘린다.
             */

            if (count < N) { //원하는 개수보다 랜선이 부족 => mid의 길이를 줄여야함(=더 짧게 잘라야함)
                max = mid;
            } else { //원하는 개수이상의 랜선이 나온다 => 그 중에서 최장의 랜선 길이를 구해야함.
                min = mid + 1;
            }

        }
        //min값이 upper bound이므로 min - 1해준 값이 최대 길이가 된다.
        System.out.println(min - 1);

        //시간초과
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//        int K = Integer.parseInt(st.nextToken()); //가지고 있는 랜선 수 K
//        int N = Integer.parseInt(st.nextToken()); //만들어야하는 랜선 수 N
//
//        int[] lines = new int[K]; //N개의 각 랜선 길이를 배열에 저장
//        long avg, sum = 0;
//
//        for (int i = 0; i < K; i++) {
//            lines[i] = Integer.parseInt(br.readLine());
//            sum += lines[i];
//        }
//
//        avg = sum / N;
//
//        for (int i = (int)avg; i >= 0; i--) {
//            int count = 0;
//
//            for (int j = 0; j < K; j++) {
//                count += lines[j] / i;
//            }
//
//            if (count >= N) {
//                bw.write(Integer.toString(i));
//                bw.flush();
//                break;
//            }
//        }
//        bw.close();
//        br.close();
    }
}
