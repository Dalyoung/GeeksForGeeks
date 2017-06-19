package c1_basic.MaxSumWithoutAdjacents;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class GFG {
	
	/*
Input:
2
6
5 5 10 100 10 5
4
3 2 7 10

Output:
110
13
	 */
	public static void main(String[] args) throws Exception {
//		solve1();
		solve2();
	}
	
	public static void solve1() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int arr[] = new int[500];
		int dp[] = new int[500];
		for(int tc = 0; tc < T; tc++){
			int N = Integer.parseInt(br.readLine());
			
			String [] input = br.readLine().split(" ");
			for(int i = 0; i < N; i++){
				arr[i] = Integer.parseInt(input[i]);
			}
			int ret = 0;
			if(N == 1){
				ret = arr[0];
			}
			else if(N == 2){
				ret = Math.max(arr[0], arr[1]);
			}
			else if(N == 3){
				ret = Math.max(arr[0]+arr[2], arr[1]);
			}
			else{
				dp[0] = arr[0];
				dp[1] = arr[1];
				dp[2] = arr[2] + dp[0];
				for(int i = 3; i < N; i++){
					dp[i] = arr[i] + Math.max(dp[i-2], dp[i-3]);
				}
				
				ret = Math.max(dp[N-1], dp[N-2]);
			}
			System.out.println(ret);
		}
		br.close();
	}
	
	public static void solve2() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int arr[] = new int[300];
		for(int tc = 0; tc < T; tc++){
			int N = Integer.parseInt(br.readLine());
			
			String [] input = br.readLine().split(" ");
			for(int i = 0; i < N; i++){
				arr[i] = Integer.parseInt(input[i]);
			}
			int incl = arr[0];
			int excl = 0;
			int excl_new = 0;
			
			for(int i = 1; i < N; i++){
				excl_new = Math.max(incl, excl);
				incl = arr[i] + excl;
				excl = excl_new;
			}
			System.out.println(Math.max(incl, excl));
		}
		br.close();
	}
}
