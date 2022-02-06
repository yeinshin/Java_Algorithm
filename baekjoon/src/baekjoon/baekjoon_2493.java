package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class baekjoon_2493 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] tops = new int[n];
		int[] ans = new int[n];
		Stack<Integer> check = new Stack<Integer>();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i<n; i++) {
			tops[i]=Integer.parseInt(st.nextToken());
		}
		
		for(int i = n-1 ; i>0 ; i--) {
			check.add(i);
			while(!check.empty()) {
				if(tops[check.peek()]<tops[i-1]) {
					ans[check.peek()]=i;
					check.pop();
				}
				else break;
			}
		}
		
		for(int a:ans) System.out.print(a+" ");
	}
}
