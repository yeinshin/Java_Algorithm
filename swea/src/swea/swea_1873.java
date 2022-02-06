package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class swea_1873 {
	static int[] dx = { -1, 1, 0, 0 };
	static int[] dy = { 0, 0, -1, 1 };
	static int x = 0, y = 0;
	static Map<Character, Integer> now = new HashMap<Character, Integer>();
	static Map<Integer, Character> now_direc = new HashMap<Integer, Character>();
	
	// 전차 이동
	static void moveTo(int d, int n, int m, char[][] game) {
		if (0 <= x + dx[d] && x + dx[d] < n && 0 <= y + dy[d] && y + dy[d] < m) {
			if (game[x + dx[d]][y + dy[d]] == '.') {
				game[x][y] = '.';
				x += dx[d];
				y += dy[d];
			}
		}
		game[x][y] = now_direc.get(d);
	}

	// 포탄 발사
	static void shoot(int d, int n, int m, char[][] game) {
		int i = x;
		int j = y;
		
		while (0 <= i + dx[d] && i + dx[d] < n && 0 <= j + dy[d] && j + dy[d] < m) {
			if (game[i + dx[d]][j + dy[d]] == '.' || game[i + dx[d]][j + dy[d]] == '-') {
				i += dx[d];
				j += dy[d];
			} else if (game[i + dx[d]][j + dy[d]] == '*') {
				i += dx[d];
				j += dy[d];
				game[i][j] = '.';
				break;
			} else if (game[i + dx[d]][j + dy[d]] == '#') {
				break;
			}
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int i = 1; i <= T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int H = Integer.parseInt(st.nextToken());
			int W = Integer.parseInt(st.nextToken());
			char[] d = {'^','v','<','>'};
			
			for(int j = 0; j<4;j++) {
				now.put(d[j], j);
				now_direc.put(j, d[j]);
			}
			
			int direc = 0;

			char[][] game = new char[H][W];
			String str;

			for (int j = 0; j < H; j++) {
				str = br.readLine();
				for (int z = 0; z < W; z++) {
					game[j][z] = str.charAt(z);
					if (game[j][z] == '<' || game[j][z] == '>' || game[j][z] == '^' || game[j][z] == 'v') {
						direc = now.get(game[j][z]);
						x = j;
						y = z;
					}
				}
			}

			int N = Integer.parseInt(br.readLine());
			String move = br.readLine();

			for (int k = 0; k < N; k++) {
				switch (move.charAt(k)) {
				case 'U':
					direc = 0;
					moveTo(direc, H, W, game);
					break;
				case 'D':
					direc = 1;
					moveTo(direc, H, W, game);
					break;
				case 'L':
					direc = 2;
					moveTo(direc, H, W, game);
					break;
				case 'R':
					direc = 3;
					moveTo(direc, H, W, game);
					break;
				case 'S':
					shoot(direc, H, W, game);
					break;
				}

			}

			System.out.printf("#%d ", i);
			for (char[] g : game) {
				for (char c : g) {
					System.out.print(c);
				}
				System.out.println();
			}
		}
	}
}
