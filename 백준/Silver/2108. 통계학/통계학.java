import java.io.*;
import java.util.Arrays;
import java.util.HashMap;

//수를 처리하는 것은 통계학에서 상당히 중요한 일이다. 통계학에서 N개의 수를 대표하는 기본 통계값에는 다음과 같은 것들이 있다. 단, N은 홀수라고 가정하자.
//산술평균 : N개의 수들의 합을 N으로 나눈 값
//중앙값 : N개의 수들을 증가하는 순서로 나열했을 경우 그 중앙에 위치하는 값
//최빈값 : N개의 수들 중 가장 많이 나타나는 값
//범위 : N개의 수들 중 최댓값과 최솟값의 차이
//N개의 수가 주어졌을 때, 네 가지 기본 통계값을 구하는 프로그램을 작성하시오.

//첫째 줄에는 산술평균을 출력한다. 소수점 이하 첫째 자리에서 반올림한 값을 출력한다.
//둘째 줄에는 중앙값을 출력한다.
//셋째 줄에는 최빈값을 출력한다. 여러 개 있을 때에는 최빈값 중 두 번째로 작은 값을 출력한다.
//넷째 줄에는 범위를 출력한다.
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()); //입력받을 숫자의 개수 N
        int[] ary = new int[N];

        for (int i = 0; i < N; i++) {
            ary[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(ary);
        int result[] = {avg(ary), median(ary), mode(ary), range(ary)}; //산술평균, 중앙값, 최빈값, 범위를 저장하는 배열

        for (int i = 0; i < 4; i++) {
            bw.write(Integer.toString(result[i]));
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();
    }

    static int avg(int[] ary) { //산술평균 출력
        double temp = Arrays.stream(ary).average().getAsDouble();
        int result = (int) Math.round(temp);
        return result;
    }

    static int median(int[] ary) { //중앙값 출력
        int result = ary[(ary.length / 2)];
        return result;
    }

    static int mode(int[] ary) {
        HashMap<Integer, Integer> hm = new HashMap<>(); //배열 안 요소값을 key로 사용, value에는 빈도값 저장
        boolean flag = false;
        int temp = 0;
        int result = 0;
        int mode = 0;

        for (int i = 0; i < ary.length; i++) {
            if (hm.containsKey(ary[i])) {
                temp = hm.get(ary[i]);
                hm.put(ary[i], ++temp);
            } else {
                hm.put(ary[i], 1);
            }
        }

        for (int i = 0; i < ary.length; i++) {
            if (mode < hm.get(ary[i])) {
                flag = true;
                mode = hm.get(ary[i]);
                result = ary[i];
            } else if (result != ary[i] && mode == hm.get(ary[i]) && flag) {
                result = Math.max(result, ary[i]);
                flag = false;
            }
        }
        return result;
    }

    static int range(int[] ary) {
        int result = ary[ary.length - 1] - ary[0];
        return result;
    }
}
