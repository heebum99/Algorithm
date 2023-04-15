import java.io.*;

public class Main {
    static int arr[];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[10001];
        for (int i = 0; i < N; i++) {
            arr[Integer.parseInt(br.readLine())]++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            if (arr[i] > 0) {
                while (count < arr[i]) {
                    count++;
                    sb.append(i + "\n");
                }
            }
        }
        System.out.print(sb);

        /*//기수 정렬 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        radix_sort(5); //기수정렬

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
//            bw.write(Integer.toString(arr[i]) + "\n");
            sb.append(arr[i]).append("\n");
        }

//        System.out.print(sb);
//        bw.close();
        br.close();

        //Arrays.sort() 정렬 사용
        *//*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()); //입력받을 정수 개수
        int[] intArray = new int[N]; //입력받을 정수를 담을 배열

        for (int i = 0; i < N; i++) {
            intArray[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(intArray);

        for (int i = 0; i < N; i++) {
            bw.write(Integer.toString(intArray[i]));
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();*//*
    }

    private static void radix_sort(int size) {
        int[] output = new int[arr.length]; //임시 저장 배열
        int digit = 1; //자릿수
        int count = 0;

        while (count != size) {
            int[] bucket = new int[10]; //기준자릿수의 숫자를 나타내는 0~9까지 10개
            for (int i = 0; i < arr.length; i++) {
                bucket[(arr[i] / digit) % 10]++;
            }

            for (int i = 1; i < bucket.length; i++) { //합 배열 이용
                bucket[i] += bucket[i - 1];
            }

            for (int i = arr.length - 1; i >= 0; i--) {
                output[bucket[(arr[i] / digit) % 10] - 1] = arr[i];
                bucket[(arr[i] / digit) % 10]--;
            }

            for (int i = 0; i < arr.length; i++) {
                //다음 자릿수로 이동하기 위해 현재 자릿수 기준 정렬 데이터를 저장
                arr[i] = output[i];
            }

            digit *= 10; //자릿수 증가
            count++;
        }
*/
    }
}
