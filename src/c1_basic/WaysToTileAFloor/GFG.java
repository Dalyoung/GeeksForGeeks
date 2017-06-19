package c1_basic.WaysToTileAFloor;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class GFG {
	
	/*
Input
2
5
3

Output
8
3
	 */
	public static void main(String[] args) throws Exception {
//		solve1();
		solve2();
	}
	public static long [] dp = new long[71];
	public static void solve1() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int tc = 0; tc < T; tc++){
			int N = Integer.parseInt(br.readLine());
			
			System.out.println(getTiles(N));
		}
		br.close();
	}
	
	public static long getTiles(int n){
		if(n == 1){
			return 1;
		}
		if(n == 2){
			return 2;
		}
		if(dp[n] != 0){
			return dp[n];
		}
		return dp[n] = getTiles(n-1) + getTiles(n-2);
	}
	
	public static void solve2() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		long fibo[] = new long[71];
		fibo[1] = 1;
		fibo[2] = 2;
		for(int i = 3; i <= 70; i++){
			fibo[i] = fibo[i-1] + fibo[i-2];
		}
		for(int tc = 0; tc < T; tc++){
			int N = Integer.parseInt(br.readLine());
			
			
			System.out.println(fibo[N]);
		}
		br.close();
	}
}
