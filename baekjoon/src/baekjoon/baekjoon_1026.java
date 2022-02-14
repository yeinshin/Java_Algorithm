package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//https://www.acmicpc.net/problem/1026
//1026번-보물
public class baekjoon_1026 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] A = new int[N];
		int[] B = new int[N];
				
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		StringTokenizer st1 = new StringTokenizer(br.readLine()," ");
		for(int i = 0; i<N ; i++) {
			A[i]=Integer.parseInt(st.nextToken());
			B[i]=Integer.parseInt(st1.nextToken());
		}
		Arrays.sort(A);
		Arrays.sort(B);

		int ans = 0;
		for(int i = 0; i<N ; i++) {
			ans+=A[i]*B[N-i-1];
		}
		System.out.println(ans);
	}
}