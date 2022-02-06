package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class swea_1954 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int[] dx = {0,1,0,-1};
		int[] dy = {1,0,-1,0};
		
		for(int t = 1; t<=T; t++) {
			int N = Integer.parseInt(br.readLine());
			int[][] graph = new int[N][N];
			int cnt = 1, x= 0,y=-1,next = 0;
			
			while(cnt<=N*N) {
				x+=dx[next];
				y+=dy[next];
				if(x < 0 || x >= N || y < 0 || y>= N || graph[x][y] != 0) {
					x = x - dx[next];
					y = y - dy[next];
					next = (next+1) % 4;
				}
				else graph[x][y] = cnt++;
			}
				System.out.printf("#%d\n",t);
				for(int[] g: graph) {
					for(int ans: g) System.out.print(ans+" ");
					System.out.println();
				}
			}
	}
}
