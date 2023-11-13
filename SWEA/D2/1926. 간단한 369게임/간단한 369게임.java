import java.util.Scanner;
import java.io.FileInputStream;
import java.util.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
            char [] tmp = Integer.toString(test_case).toCharArray();
            StringBuilder sb = new StringBuilder();
            boolean check = false;
            
            for(char a:tmp){
            	if(a == '3' || a == '6' || a == '9'){
            		sb.append("-");
                    check = true;
         	   }
            }
            if(!check){
            	System.out.print(test_case+" ");
            }else{
            	System.out.print(sb+" ");
            }
		}
	}
}