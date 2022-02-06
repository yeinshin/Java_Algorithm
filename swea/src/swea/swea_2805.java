package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class swea_2805 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int t=1;t<=T;t++) {
			int N = Integer.parseInt(br.readLine());
			int[][] farm = new int[N][N];
			
			String str;
			
			for(int i=0;i<N;i++) {
				str = br.readLine();
				for(int j=0;j<N;j++) {
					farm[i][j]=str.charAt(j)-'0';
				}
			}
			
			int cnt =-1;
			int ans = 0;
			System.out.println(N/2);
			for(int i = 0;i<N/2;i++) {
				cnt++;
				for(int j=N/2-cnt;j<=N/2+cnt;j++) {
					ans+=farm[i][j];
					System.out.println(i+" "+j);
				}
			}
			System.out.println();
			cnt+=2;
			for(int i = N/2;i<N;i++) {
				cnt--;
				for(int j =0+cnt;j<=N/2-cnt;j++) {
					ans+=farm[i][j];
					System.out.println(i+" "+j);
				}
			}
			
			System.out.printf("#%d %d",t,ans);
			
		}
		
	}
}
