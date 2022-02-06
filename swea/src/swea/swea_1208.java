package swea;

import java.util.Arrays;
import java.util.Scanner;

public class swea_1208 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = 10;
        int N = 100;
        for (int tc = 1; tc <= T; tc++) {
            int dump = sc.nextInt();
            int[] map = new int[N];
            for (int i = 0; i < N; i++) {
                map[i] = sc.nextInt();
            }
            for (int i = 0; i < dump; i++) {
                Arrays.sort(map);
                map[0]++;
                map[99]--;
            }
            Arrays.sort(map);
            System.out.println("#" + tc + " " + (map[99] - map[0]));
        }
    }
}
