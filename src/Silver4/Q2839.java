package Silver4;

//상근이는 요즘 설탕공장에서 설탕을 배달하고 있다. 상근이는 지금 사탕가게에 설탕을 정확하게 N킬로그램을 배달해야 한다.
//설탕공장에서 만드는 설탕은 봉지에 담겨져 있다. 봉지는 3킬로그램 봉지와 5킬로그램 봉지가 있다.
//더 적은 봉지수를 배달하는 방법.
//만약, 정확하게 N킬로그램을 만들 수 없다면 -1을 출력한다.
//그리디 알고리즘

import java.io.*;

public class Q2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int kg = Integer.parseInt(br.readLine()); //설탕 무게
        int count = 0; //봉지 수

        if (kg == 4 || kg == 7) {
            count = -1;
        } else if (kg % 5 == 1 || kg % 5 == 3) {
            count += (kg / 5 + 1);
        } else if (kg % 5 == 2 || kg % 5 == 4) {
            count += (kg / 5 + 2);
        } else if (kg % 5 == 0) {
            count += kg / 5;
        }

        System.out.println(count);
    }


}

