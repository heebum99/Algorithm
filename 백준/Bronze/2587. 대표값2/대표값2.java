import java.io.*;
import java.util.Arrays;

//다섯 개의 자연수가 주어질 때 이들의 평균과 중앙값을 구하는 프로그램을 작성하시오.
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] nums = new int[5];
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(br.readLine());
            sum += nums[i];
        }

        Arrays.sort(nums);

        bw.write(Integer.toString(sum / nums.length) + "\n");
        bw.write(Integer.toString(nums[nums.length / 2]));
        bw.flush();
        bw.close();
        br.close();
    }
}
