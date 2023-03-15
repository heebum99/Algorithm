import java.io.*;
import java.util.Stack;

//스택 (stack)은 기본적인 자료구조 중 하나로, 컴퓨터 프로그램을 작성할 때 자주 이용되는 개념이다.
//자료를 넣는 (push) 입구와 자료를 뽑는 (pop) 입구가 같아 제일 나중에 들어간 자료가 제일 먼저 나오는 (LIFO, Last in First out) 특성을 가지고 있다.
//1부터 n까지의 수를 스택에 넣었다가 뽑아 늘어놓음으로써, 하나의 수열을 만들 수 있다.
//이때, 스택에 push하는 순서는 반드시 오름차순을 지키도록 한다고 하자. 임의의 수열이 주어졌을 때 스택을 이용해 그 수열을 만들 수 있는지 없는지, 있다면 어떤 순서로 push와 pop 연산을 수행해야 하는지를 알아낼 수 있다. 이를 계산하는 프로그램을 작성하라.
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine()); //숫자 n
        Stack<Integer> stack = new Stack<Integer>();
        int[] nums = new int[n];
        StringBuilder success = new StringBuilder();

//        for (int i = 0; i < n; i++) {
//            nums[i] = Integer.parseInt(br.readLine());
//        }

//        int seq = 1; //수열 ex)1,2,3......10
//        int index = 0;
//        int count = 1;

        int tmp = 0;

        while (n-- > 0) {
            int num = Integer.parseInt(br.readLine());

            if (tmp < num) {
                for (int i = tmp + 1; i <= num; i++) {
                    stack.push(i);
                    success.append("+\n");
                }
                tmp = num;
            } else if (stack.peek() != num) {
                bw.write("NO");
                bw.flush();
                return;
            }

            stack.pop();
            success.append("-\n");
        }

        bw.write(success.toString());
        bw.flush();
        bw.close();
        br.close();

        //오류 코드
//            //push하는 경우
//            if (count == 1) {
//                stack.push(seq++);
//                success.append("+\n");
//
////                tmp++;
//            } else if (seq <= n && seq - 1 != nums[index < 8 ? index : index - 1]) {
//                stack.push(seq++);
//                success.append("+\n");
////                tmp++;
//            } else { //pop하는 경우 => seq-1 == nums[index]
//                if (!stack.isEmpty() && stack.peek() == nums[index < 8 ? index : index - 1]) { //pop했을때 맞게 나오는 경우
//                    stack.pop();
//                    success.append("-\n");
//                    index++;
//                    for (int i = seq - 1; i >= 1; i--) {
//                        if (!stack.isEmpty() && i - 1 == nums[index]) {
//                            stack.pop();
//                            success.append("-\n");
//                            count++;
//                            index++;
//                        }
//                    }
//                }
//            }
//            count++;
//
//            if (count >= (n - 1) * 2 && stack.isEmpty()) {
//                bw.write(success.toString());
//                break;
//            } else if (count >= (n - 1) * 2 && !stack.isEmpty()) {
//                bw.write("NO");
//                break;
//            }


//
        //시간 초과
//           else {
//                bw.write("NO");
//                break;
//            }
//            if (count == 1) {
//                stack.push(seq++);
//                success.append("+\n");
//                count++;
//            } else if (count == ((n * 2) -1) && (nums[index] != stack.peek())) {
//                bw.write("NO");
//                bw.flush();
//                break;
//
//            }
//            if (index < n && !stack.isEmpty() && nums[index] == seq - 1) {
//                stack.pop();
//                if (tmp < seq) {
//                    tmp = seq;
//                }
//                index++;
//                seq--;
//                count++;
//                success.append("-\n");
//            } else if (index == nums.length && stack.isEmpty()) {
//                count++;
//                bw.write(success.toString());
//                bw.flush();
//                break;
//            } else {
//                if (tmp > seq) {
//                    seq = tmp;
//                } else if (seq > n) {
//                    if (!stack.isEmpty() && stack.peek() == nums[index]) {
//                        stack.pop();
//                        success.append("-\n");
//                        index++;
//                        count++;
//                    }
//                } else {
//                    stack.push(seq++);
//                    success.append("+\n");
//                    count++;
//                }
//
//            }
    }
}
