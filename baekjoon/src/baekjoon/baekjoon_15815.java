package baekjoon;

import java.util.*;
import java.io.*;

//https://www.acmicpc.net/problem/15815
//15815번-천재 수학자 성필
public class baekjoon_15815{
    
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        char[] num = br.readLine().toCharArray();
        Stack<Integer> stack = new Stack<Integer>();
        for(int i=0;i<num.length;i++) {
            if(num[i] >= '0') stack.push(num[i] - '0');
            else {
                int num1 = stack.pop();
                int num2 = stack.pop();
                switch(num[i]) {
                    case '+':
                        stack.push(num1 + num2);
                        break;
                    case '-':
                        stack.push(num2 - num1);
                        break;
                    case '*':
                        stack.push(num1 * num2);
                        break;
                    case '/':
                        stack.push(num2 / num1);
                        break;
                }
            }
        }
        sb.append(stack.pop());
        sb.append("\n");        
        System.out.println(sb.toString());       
    }
  
}

