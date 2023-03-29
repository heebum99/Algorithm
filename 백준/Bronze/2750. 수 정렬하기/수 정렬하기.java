import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());


        //버블 정렬을 2중 for문이 아닌 1중 for문으로 구현해 시간 효율 극대화
        boolean[] check = new boolean[2001]; //-1000 ~ 1000

        for (int i = 0; i < N; i++) {
            check[Integer.parseInt(br.readLine()) + 1000] = true;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < check.length; i++) {
            if (check[i]) {
//                bw.write(Integer.toString(i - 1000) + "\n");
                sb.append(i - 1000).append("\n");
            }
        }
        System.out.println(sb);

        //버블 정렬 직접 구현
//        int[] arr = new int[N];
//
//        for (int i = 0; i < N; i++) {
//            arr[i] = Integer.parseInt(br.readLine());
//        }
//        int tmp;
//        for (int i = 0; i < N - 1; i++) {
//            for (int j = 0; j < N - 1 - i; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    tmp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = tmp;
//                }
//            }
//        }
//
//        for (int i = 0; i < N; i++) {
//            bw.write(Integer.toString(arr[i])+"\n");
//        }


        //Arrays.sort()이용
//        int N = Integer.parseInt(br.readLine());
//        int[] ary = new int[N];
//
//        for (int i = 0; i < N; i++) {
//            ary[i] = Integer.parseInt(br.readLine());
//        }
//
//        Arrays.sort(ary);
//
//        for (int i = 0; i < N; i++) {
//            bw.write(Integer.toString(ary[i])+"\n");
//        }
//        bw.flush();
//        bw.close();
//        br.close();
    }
}
