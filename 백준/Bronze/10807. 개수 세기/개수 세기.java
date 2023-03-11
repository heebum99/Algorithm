import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); //입력받을 정수의 개수
        int[] arr = new int[N];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        int v = scanner.nextInt();
        int count = 0;

        for (int i = 0; i < arr.length; i++) {//입력받은 정수 v가 위에서 입력받은 수 중에 몇개가 있는지 출력
            if(arr[i]==v){
                count++;
            }
        }

        System.out.println(count);
    }
}
