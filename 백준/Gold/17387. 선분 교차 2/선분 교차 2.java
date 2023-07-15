import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static long[][] p;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        p = new long[4][2];
        int count = 0;
        int T = 2;
        while (T-- > 0) {
            st = new StringTokenizer(br.readLine());
            p[count][0] = Long.parseLong(st.nextToken());
            p[count++][1] = Long.parseLong(st.nextToken());
            p[count][0] = Long.parseLong(st.nextToken());
            p[count++][1] = Long.parseLong(st.nextToken());
        }

        //두 선분이 교차하는지 확인하려면 CCW 이용.
        //1.AB와 C, D 세점을 비교해 서로 방향이 다르면 즉 CCW 값의 곱이 음수면 교차
        //2.CD와 A, B 세점을 비교해 서로 방향이 다르면 즉 CCW 값의 곱이 음수면 교차
        //1,2를 다 만족해야함.
        //일직선상에 위치하고(값이 0) 겹치는 경우
        int abc = CCW(p[0], p[1], p[2]);
        int abd = CCW(p[0], p[1], p[3]);
        int cda = CCW(p[2], p[3], p[0]);
        int cdb = CCW(p[2], p[3], p[1]);

        if (checkResult(abc, abd, cda, cdb)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }


    }

    private static boolean checkResult(int abc, int abd, int cda, int cdb) {
        if (abc == 0 && abd == 0) { //선분이 일직선일 때
            if (isOverlap(p[0], p[1], p[2], p[3])) { //겹치는지 확인
                return true;
            }
        } else if (abc * abd <= 0 && cda * cdb <= 0) {
            return true;
        }
        return false;
    }

    private static boolean isOverlap(long[] p1, long[] p2, long[] p3, long[] p4) {
        long minL1x, minL2x, maxL1x, maxL2x, minL1y, minL2y, maxL1y, maxL2y;
        minL1x = Math.min(p1[0], p2[0]);
        minL2x = Math.min(p3[0], p4[0]);
        maxL1x = Math.max(p1[0], p2[0]);
        maxL2x = Math.max(p3[0], p4[0]);
        minL1y = Math.min(p1[1], p2[1]);
        minL2y = Math.min(p3[1], p4[1]);
        maxL1y = Math.max(p1[1], p2[1]);
        maxL2y = Math.max(p3[1], p4[1]);

        return minL1x <= maxL2x && minL2x <= maxL1x && minL1y <= maxL2y && minL2y <= maxL1y;
    }

    private static int CCW(long[] p1, long[] p2, long[] p3) {
        long result = (p1[0] * p2[1] + p2[0] * p3[1] + p3[0] * p1[1]) - (p3[0] * p2[1] + p2[0] * p1[1] + p1[0] * p3[1]);
        if (result > 0) {
            return 1;
        } else if (result < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}

