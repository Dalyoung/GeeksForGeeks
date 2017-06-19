package c1_basic.GenerateBinaryNumbers;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class GFG {
	
	/*
Input
2
2
5

Output
1 10
1 10 11 100 101
	 */
public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int tc = 0; tc < T; tc++){
			int N = Integer.parseInt(br.readLine());
			Queue<String> q = new LinkedList<>();
			q.add("1");
			StringBuffer sb = new StringBuffer();
			for(int i = 0; i < N; i++){
				String s1 = q.poll();
				sb.append(s1 + " ");
				
				q.add(s1 + "0");
				q.add(s1 + "1");
			}
			
			System.out.println(sb.toString());
		}
		
		br.close();
	}
}
