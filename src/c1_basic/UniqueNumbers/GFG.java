package c1_basic.UniqueNumbers;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class GFG {
	
	/*
Input:
1
10 20
Output:
10 12 13 14 15 16 17 18 19 20
	 */
	public static void main(String[] args) throws Exception {
		solve1();
//		solve2();
	}
	
	public static void solve1() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		boolean [] digits = new boolean[10];;
		for(int tc = 0; tc < T; tc++){
			String [] input = br.readLine().split(" ");
			int M = Integer.parseInt(input[0]);
			int N = Integer.parseInt(input[1]);
			
			StringBuffer sb = new StringBuffer();
			for(int i = M; i <= N; i++){
				int num = i;
				Arrays.fill(digits, false);
				boolean chk = false;
				while(num > 0){
					if(digits[num%10]){
						chk = true;
						break;
					}
					digits[num%10] = true;
					num /= 10;
				}
				
				if(!chk){
					sb.append(i).append(" ");
				}
			}
			
			System.out.println(sb.toString());
		}
		br.close();
	}
}
