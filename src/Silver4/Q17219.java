package Silver4;

import java.io.*;
import java.util.*;

public class Q17219 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] N = new int[2]; //첫번째 입력=> 입력할 사이트 주소 개수, 두번째 입력=> 비밀번호를 알아낼 사이트 주소 개수
        String n = br.readLine(); //숫자(사이트 주소 개수, 사이트 별 비밀번호를 알아낼 주소 개수)를 입력받기 위함
        StringTokenizer st1 = new StringTokenizer(n, " ");
        for (int i = 0; i < N.length; i++) {
            if (st1.hasMoreTokens()) {
                N[i] = Integer.parseInt(st1.nextToken());
            }
        }

//        HashSet<String> set = new HashSet<>(); //사이트 주소 중복방지를 위함
//        String[] password = new String[N[0]]; //패스워드 개수 = 사이트 주소 개수
        //HashSet은 저장한 순서대로 저장되지 않는다. hashCode()의 리턴값의 영향을 받기 때문

        String s = " "; //사이트 주소 및 비밀번호를 입력받기 위함
        HashMap<String, String> hm = new HashMap<>();

        for (int j = 0; j < N[0]; j++) {
            s = br.readLine();
            StringTokenizer st2 = new StringTokenizer(s, " ");
            if (st2.hasMoreTokens()) {
                hm.put(st2.nextToken(),st2.nextToken());
//                set.add(st2.nextToken());
//                password[j] = st2.nextToken().toUpperCase();
            }
        }

//        Iterator it = set.iterator(); //hashset은 전체 출력밖에 없으므로 iterator로 순차 검색
//        int i = 0;
//        while (it.hasNext()) {
//            hm.put((String) it.next(), password[i]);
//            i++;
//        }

        String search[] = new String[N[1]]; //비밀번호를 받아올 주소를 저장
        for (int i = 0; i < N[1]; i++) { //비밀번호를 받아올 주소의 개수만큼 반복
            if ((search[i]=br.readLine()) == null) {
                break;
            }
        }
        br.close();

        for (int i = 0; i < N[1]; i++) {
            bw.write(hm.get(search[i]));
            bw.newLine();
        }

        bw.flush();
        bw.close();

    }
}

