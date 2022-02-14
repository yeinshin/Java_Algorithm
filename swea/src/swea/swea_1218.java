package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class swea_1218 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Character> stack = new Stack<Character>();
		Map<Character,Character> map = new HashMap<Character,Character>();
		map.put(')','(');
		map.put('}','{');
		map.put(']','[');
		map.put('>','<');
		
		int T = 10;
		char[] c;
		for(int t = 1; t<=T ; t++) {
			int N = Integer.parseInt(br.readLine());
			c = br.readLine().toCharArray();
			boolean check = true;
			for(int i = 0; i< N ; i++) {
				if(c[i]=='(' || c[i]=='[' || c[i]=='{' || c[i]=='<') stack.add(c[i]);
				else if(!stack.isEmpty() && map.get(c[i])==stack.peek()) stack.pop();
				else{
					System.out.printf("#%d 0\n",t);
					check = false;
					break;
				}
			}
			if(check) System.out.printf("#%d 1\n",t);
		}
	}
}
