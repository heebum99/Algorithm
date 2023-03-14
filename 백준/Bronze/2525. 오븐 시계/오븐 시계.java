import java.io.*;
import java.util.StringTokenizer;

//KOI 전자에서는 건강에 좋고 맛있는 훈제오리구이 요리를 간편하게 만드는 인공지능 오븐을 개발하려고 한다. 인공지능 오븐을 사용하는 방법은 적당한 양의 오리 훈제 재료를 인공지능 오븐에 넣으면 된다.
//그러면 인공지능 오븐은 오븐구이가 끝나는 시간을 분 단위로 자동적으로 계산한다.
//또한, KOI 전자의 인공지능 오븐 앞면에는 사용자에게 훈제오리구이 요리가 끝나는 시각을 알려 주는 디지털 시계가 있다.
//훈제오리구이를 시작하는 시각과 오븐구이를 하는 데 필요한 시간이 분단위로 주어졌을 때, 오븐구이가 끝나는 시각을 계산하는 프로그램을 작성하시오
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //시작 시간 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int start_hour = Integer.parseInt(st.nextToken());
        int start_minute = Integer.parseInt(st.nextToken());

        //소요 시간 입력
        int duration = Integer.parseInt(br.readLine());

        //시간을 분단위로 바꿈
        int hour_to_minute = start_hour * 60 + start_minute + duration;

        //종료 시간, 분
        int result_hour = 0;
        int result_minute = 0;

        //00시 00분 => 0, 23시 59분 => 1439, 0~1439인 경우 /60으로 시간, %60으로 분 계산
        if (hour_to_minute < 1440) {
            result_hour += hour_to_minute / 60;
            result_minute += hour_to_minute % 60;
        } else {
            hour_to_minute -= 1440;
            result_hour += hour_to_minute / 60;
            result_minute += hour_to_minute % 60;
        }

        bw.write(Integer.toString(result_hour) + " " + Integer.toString(result_minute));
        bw.flush();
        bw.close();
        br.close();
    }
}
