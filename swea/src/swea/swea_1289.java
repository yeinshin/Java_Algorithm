package swea;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class swea_1289 {
	public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
 
        for (int test_case = 1; test_case <= T; test_case++) {
            char[] c = br.readLine().toCharArray();
            char temp = '0';
            int cnt = 0;
            for (int i = 0; i < c.length; i++) {
                if (c[i] != temp) {
                    temp = c[i];
                    cnt++;
                }
            }
            System.out.println("#" + test_case + " " + cnt);
        }
    }
}
