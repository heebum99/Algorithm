/////////////////////////////////////////////////////////////////////////////////////////////
// 기본 제공코드는 임의 수정해도 관계 없습니다. 단, 입출력 포맷 주의
// 아래 표준 입출력 예제 필요시 참고하세요.
// 표준 입력 예제
// int a;
// double b;
// char g;
// String var;
// long AB;
// a = sc.nextInt();                           // int 변수 1개 입력받는 예제
// b = sc.nextDouble();                        // double 변수 1개 입력받는 예제
// g = sc.nextByte();                          // char 변수 1개 입력받는 예제
// var = sc.next();                            // 문자열 1개 입력받는 예제
// AB = sc.nextLong();                         // long 변수 1개 입력받는 예제
/////////////////////////////////////////////////////////////////////////////////////////////
// 표준 출력 예제
// int a = 0;                            
// double b = 1.0;               
// char g = 'b';
// String var = "ABCDEFG";
// long AB = 12345678901234567L;
//System.out.println(a);                       // int 변수 1개 출력하는 예제
//System.out.println(b); 		       						 // double 변수 1개 출력하는 예제
//System.out.println(g);		       						 // char 변수 1개 출력하는 예제
//System.out.println(var);		       				   // 문자열 1개 출력하는 예제
//System.out.println(AB);		       				     // long 변수 1개 출력하는 예제
/////////////////////////////////////////////////////////////////////////////////////////////
import java.util.Scanner;
import java.io.FileInputStream;

/*
   사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
 */
class Solution
{
    static int[] dr = {0, 1, 0, -1};
    static int[] dc = {1, 0, -1, 0};
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int num = 0;

        for (int i = 1; i <= T; i++) {
            int n = sc.nextInt();
            int[][] arr = new int[n][n];

            //우하좌상 순서
            int dir = 0; //방향 인덱스
            int c = 0, r = 0; //시작 좌표

            for (int j = 1; j <= n * n; j++) {
                arr[r][c] = j;

                //정상 범위를 벗어나는 경우 방향 전환
                if (r + dr[dir] >= n || r + dr[dir] < 0 || c + dc[dir] >= n || c + dc[dir] < 0
                        || arr[r + dr[dir]][c + dc[dir]] != 0) {
                    dir = (dir + 1) % 4;
                }

                c += dc[dir];
                r += dr[dir];
            }

            num++;
            System.out.println("#" + num);
            for (int t1 = 0; t1 < n; t1++) {
                for (int t2 = 0; t2 < n; t2++) {
                    System.out.print(arr[t1][t2] + " ");
                }
                System.out.println();
            }
        }
    }
}