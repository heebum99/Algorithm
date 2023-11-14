import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int num = 0;

        for (int i = 1; i <= 10; i++) {
            num++;
            int dump = sc.nextInt();
            int res = -1;

            //0은 인덱스 저장 1은 값 저장
            Integer[] box = new Integer[100];

            for (int j = 0; j < 100; j++) {
                box[j] = sc.nextInt();
            }

            for (int cnt = 1; cnt <= dump; cnt++) {
                Arrays.sort(box, Collections.reverseOrder());

                if ((box[0] - box[99]) <= 1) {
                    res = box[0] - box[99];
                    break;
                }
                box[0]--;
                box[99]++;
            }

            Arrays.sort(box, Collections.reverseOrder());
            res = box[0] - box[99];
            System.out.println("#" + num + " " + res);
        }
    }
}