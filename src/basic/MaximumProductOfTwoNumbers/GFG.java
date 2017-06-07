package basic.MaximumProductOfTwoNumbers;

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		for(int tc = 0; tc < T; tc++){
			int N = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int first = 0, second = 0;
			for(int i = 0; i < N; i++){
				int temp = Integer.parseInt(st.nextToken()); 
				if(temp > first){
					second = first;
					first = temp;
				}else{
					second = Math.max(second, temp);
				}
				
			}
			int ret = first * second;
			System.out.println(ret);
		}
		br.close();
	}
}