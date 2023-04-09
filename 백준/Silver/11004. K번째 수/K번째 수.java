import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //퀵 정렬 이용
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        quickSort(arr, 0, N - 1, K - 1);
        System.out.println(arr[K - 1]);

        //Collections.sort() 이용 => Arrays.sort()가 효율 더 좋음
        /*StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

//        LinkedList<Integer>list = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>(); //Linked보다 ArrayList가 효율 더 잘나옴
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(list);
        System.out.println(list.get(K - 1));
        br.close();*/


        //Arrays.sort() 이용
        /*StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        System.out.println(arr[K-1]);
        br.close();*/
    }

    static void quickSort(int arr[], int start, int end, int K) { //퀵 정렬 알고리즘
        //K는 우리가 찾는 값
        if (start < end) { //start가 end보다 작은동안 실행
            int pivot = partition(arr, start, end); //기준 인덱스 pivot 설정
            if (pivot == K) { //pivot이 K랑 같으면 정렬 종료
                return;
            } else if (pivot > K) { //K보다 pivot이 크면 pivot기준 왼쪽 그룹만 정렬 수행
                quickSort(arr, start, pivot - 1, K);
            } else { //K보다 pivot이 작으면 pivot기준 오른쪽 그룹만 정렬 수행
                quickSort(arr, pivot + 1, end, K);
            }
        }
    }

    private static int partition(int[] arr, int start, int end) {
        //여기서는 피봇을 중간값으로 잡음
        if (start + 1 == end) {
            if (arr[start] > arr[end]) {
                swap(arr, start, end);
            }
            return end;
        }

        int middle = (start + end) / 2;
        swap(arr, start, middle); //정렬을 쉽게하기 위해서 피봇(중간값)과 start의 값을 swap해줌
        int pivot = arr[start]; //피봇값
        int i = start + 1, j = end;
        while (i <= j) { //i와 j가 만날때까지 반복
            //pivot과 i,j를 비교해서 pivot보다 작은 값은 왼쪽그룹에, pivot보다 큰 값은 오른쪽 그룹에 정렬
            while (pivot < arr[j] && j > 0) {//피봇보다 j의 값이 크다면 j-- => 왼쪽으로 한칸 이동, 피봇보다 작은값이 나올때까지 반복
                j--;
            }
            while (pivot > arr[i] && i < arr.length - 1) { //피봇보다 i의 값이 작다면 i++ => 오른쪽으로 한칸 이동, 피봇보다 큰값 나올때까지 반복
                i++;
            }
            if (i <= j) {
                swap(arr, i++, j--);
            }
        }
        arr[start] = arr[j];
        arr[j] = pivot;
        return j;
    }

    static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
