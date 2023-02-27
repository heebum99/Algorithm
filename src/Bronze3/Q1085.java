package Bronze3;

//한수는 지금 (x, y)에 있다. 직사각형은 각 변이 좌표축에 평행하고
//왼쪽 아래 꼭짓점은 (0, 0), 오른쪽 위 꼭짓점은 (w, h)에 있다. 직사각형의 경계선까지 가는 거리의 최솟값을 구하는 프로그램을 작성하시오.

import java.io.*;
import java.util.StringTokenizer;

public class Q1085 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int min = 1000; //최종 최단 거리
        int x_min = 1000; //직사각형 x좌표 경계까지의 최단 거리
        int y_min = 1000; //직사각형 y좌표 경계까지의 최단 거리

        //좌측상단 좌표(0,h) 좌측하단 좌표(0,0) 우측상단 좌표(w,h) 우측하단 좌표(w,0)
        StringTokenizer st = new StringTokenizer(br.readLine()); //(x,y) (w,h)에 대해서 입력받음
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        x_min = Math.min(0 + x, w - x);
        y_min = Math.min(0 + y, h - y);
        min = Math.min(x_min, y_min);
        System.out.println(min);
    }
}
