package baekjoon;

import java.util.Scanner;

public class baekjoon_1769 {
	static int[] ans = new int[2];
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String num = sc.next();
		
		CountSum(num, 0);
		
		System.out.println(ans[0]);
		System.out.println((ans[1]%3==0&&ans[1]!=0)? "YES": "NO");
	}
	
	public static void CountSum(String num, int cnt) {
		int sum = 0;
		
		if(num.length()>1) {
			for(int i = 0 ; i < num.length() ; i ++) {
				sum += Integer.parseInt(num.charAt(i)+"");
			}
			num = sum+"";
			System.out.println(" if문 안 num: "+num);
			CountSum(num, cnt+1);
		}else {
			ans[0]=cnt;
			ans[1]=Integer.parseInt(num);
		}
		
		System.out.println(" if문 밖 num: "+num);
	}
}
