package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/9095
//9095번-1,2,3 더하기
public class baekjoon_9095 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		int[] d = {1,2,4,0,0,0,0,0,0,0};
		
		for(int i =3 ;i<10;i++) d[i]=d[i-1]+d[i-2]+d[i-3];
		
		while(t-->0) {
			int n = Integer.parseInt(br.readLine());
			System.out.println(d[n-1]);
		}
	}
}
