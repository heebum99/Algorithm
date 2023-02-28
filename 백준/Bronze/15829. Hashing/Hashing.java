//첫 줄에는 문자열의 길이 L이 들어온다. 둘째 줄에는 영문 소문자로만 이루어진 문자열이 들어온다.
//입력으로 주어지는 문자열은 모두 알파벳 소문자로만 구성되어 있다.
//문제에서 주어진 해시함수와 입력으로 주어진 문자열을 사용해 계산한 해시 값을 정수로 출력한다.

import java.io.*;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int r = 31; //M(1234567891)과 서로소인 31
        int L = Integer.parseInt(br.readLine()); //문자열의 길이 입력
        String s = br.readLine(); //문자열 입력
        int hashValue = 0; //계산된 해시값
        //아스키 코드값으로 a=97 ... z=122
        HashMap<Character, Integer> alpha = new HashMap<>(); //영어 소문자 a=1 ~ z=26 세팅해주기 위해서 해시맵으로 key, value로 지정

        for (int i = 0; i < 26; i++) {
            alpha.put((char) (i + 97), (i + 1)); // key:'a' , value = 1 이런 식으로 a~z까지 해시맵에 저장
        }

        for (int i = 0; i < L; i++) {
            char c = s.charAt(i); //문자열 s가 "abcde" 인 경우 'a','b','c'.....'e' 하나씩 추출
            int value = alpha.get(c); //문자에 해당하는 값을 가져온다.
            //거듭제곱을 사용하기 위해 Math 클래스의 pow()메서드 사용
            hashValue += (value * Math.pow(r, i));
        }

        System.out.println(hashValue);


    }
}
