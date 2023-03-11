import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); //입력받을 정수 개수
        int X = scanner.nextInt(); //X보다 작은 수 구하기.

        int[] arr = new int[N]; //수열을 담는 배열 

        for (int i = 0; i < arr.length; i++) { //수열에 각각 수를 입력
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<X){
                System.out.print(arr[i]+" ");
            }
        }

    }
}