package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class swea_2001 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int t = 1; t<=T ; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			
			int[][] graph = new int[n][n];
			for(int i = 0; i<n;i++) {
				st = new StringTokenizer(br.readLine());
				for(int j = 0; j<n;j++) {
					graph[i][j]=Integer.parseInt(st.nextToken());
				}
			}
			
			int ans = 0;
			
			for(int i = 0; i<n-m+1; i++) {
				for(int j = 0; j<n-m+1; j++) {
					int sum = 0;
					for (int x = 0; x<m;x++) {
						for(int y = 0; y<m;y++) {
							sum+=graph[i+x][j+y];
						}
					}
					if(ans<sum) ans=sum;
				}
			}
			System.out.printf("#%d %d\n",t,ans);
			
		}
		
	}
}
