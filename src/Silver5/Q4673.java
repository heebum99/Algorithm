package Silver5;

public class Q4673 {
    public static void main(String[] args) {
        boolean self_num[] = new boolean[10001]; //생성자가 없는 수
        for (int i = 1; i <= 10000; i++) {
            int n = d(i);
            if (n <= 10000) {
                self_num[n] = true; //생성자인 경우 true
            }
        }
        for (int i = 1; i <= 10000; i++) { //셀프넘버를 출력하기 위해 false값만 출력
            if(!self_num[i]){
                System.out.println(i);
            }
        }
    }

    public static int d(int n) { //생성자를 골라내는 함수 => 생성자인 경우 true리턴
        int sum = n;

        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
