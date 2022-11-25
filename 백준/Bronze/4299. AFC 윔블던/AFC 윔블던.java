import java.util.Scanner;

//첫째 줄에 두 팀 점수의 합과 차가 빈 칸으로 구분되어 주어진다. 축구 점수는 항상 음이 아닌 정수이고, 합과 차는 1000보다 작거나 같은 음이 아닌 정수이다.
//첫째 줄에 두 팀의 경기 결과를 출력한다. 득점을 많이 한 쪽을 먼저 출력한다. 만약, 그러한 합과 차를 갖는 경기 결과가 없다면, -1을 출력한다.

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score_sum = scanner.nextInt(); //두 팀 점수의 합
        int score_sub = scanner.nextInt(); //두 팀 점수의 차
        if ((score_sum + score_sub) % 2 != 0 || score_sub > score_sum) {
            System.out.println(-1);
        } else {
            int team_1 = (score_sum + score_sub) / 2;
            int team_2 = team_1-score_sub;
            if (team_1 + team_2 == score_sum && team_1 - team_2 == score_sub) {
                System.out.println(team_1 + " " + team_2);
            } else {
                System.out.println(-1);
            }
        }
    }
}
