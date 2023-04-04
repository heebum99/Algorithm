import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Data[] arr = new Data[N];

        for (int i = 0; i < N; i++) {
            arr[i] = new Data(Integer.parseInt(br.readLine()), i);
        }

        Arrays.sort(arr); //Value를 기준으로 오름차순 정렬

        int max = 0;
        for (int i = 0; i < N; i++) { //정렬전 인덱스 - 정렬 후 인덱스의 최대값을 구하기
            if (max < arr[i].index - i) {
                max = arr[i].index - i;
            }
        }

        System.out.println(max + 1); //swap이 일어나지 않았을때 실행된 반복문 횟수 => +1


    }

}

class Data implements Comparable<Data> {
    int value;
    int index;

    public Data(int value, int index) {
        super();
        this.value = value;
        this.index = index;
    }

    @Override
    public int compareTo(Data o) {
        return this.value - o.value; //value 기준 오름차순 정렬
    }
}
