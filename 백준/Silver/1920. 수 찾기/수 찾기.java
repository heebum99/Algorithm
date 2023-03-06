import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //시간 초과!!
//        int N = Integer.parseInt(br.readLine()); //정수의 개수 N
//        int i = 0;
//        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//        String A[] = new String[N]; //입력받은 정수 배열 A
//
//        while (st.hasMoreTokens()) {
//            A[i++] = st.nextToken();
//        }
//
//        int M = Integer.parseInt(br.readLine()); //정수의 개수 M
//        String num[] = new String[M]; //A[] 배열과 비교할 정수배열
//        i = 0;
//        st = new StringTokenizer(br.readLine(), " ");
//
//        while (st.hasMoreTokens()) {
//            num[i++] = st.nextToken();
//        }
//
//        boolean contains = false;
//        for (i = 0; i < M; i++) {
//            for (int j = 0; j < N; j++) {
//                contains = num[i].contains(A[j]);
//                if (contains == true) {
//                    break;
//                }
//            }
//            if (contains == true) {
//                bw.write('1');
//                bw.newLine();
//            } else {
//                bw.write('0');
//                bw.newLine();
//            }
//        }
//
//        bw.flush();
//        bw.close();
//        br.close();


        //이진 탐색을 이용
        //절반을 나눠서 비교해보는 방식 => 정렬이 되어있어야함.
        //Arrays 클래스의 binarySearch() 사용 => 수가 존재하면 배열 인덱스 값, 존재하지않으면 -1을 반환
        int N = Integer.parseInt(br.readLine()); //정수의 개수 N
        int i = 0;
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A[] = new int[N]; //입력받은 정수 배열 A

        while (st.hasMoreTokens()) {
            A[i++] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(A); //이진 탐색을 위해 정렬해준다.

        int M = Integer.parseInt(br.readLine()); //정수의 개수 M
        int num[] = new int[M]; //A[] 배열과 비교할 정수배열
        i = 0;
        st = new StringTokenizer(br.readLine(), " ");

        while (st.hasMoreTokens()) {
            num[i++] = Integer.parseInt(st.nextToken());
        }

        for (i = 0; i < M; i++) {
            if (Arrays.binarySearch(A, num[i]) >= 0) { //수가 존재하면 인덱스값을 반환
                bw.write('1');
                bw.newLine();
            } else { //수가 존재하지 않으면 -1을 반환
                bw.write('0');
                bw.newLine();
            }
        }

        bw.flush();
        bw.close();
        br.close();

    }
}
