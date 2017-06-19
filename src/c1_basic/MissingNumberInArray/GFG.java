package c1_basic.MissingNumberInArray;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class GFG {
	
	/*
Input
2
5
1 2 3 5
10
1 2 3 4 5 6 7 8 10

Output
4
9
	 */
	public static void main(String[] args) throws Exception {
//		solve1();
		solve2();
	}
	
	public static void solve1() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int tc = 0; tc < T; tc++){
			int N = Integer.parseInt(br.readLine());
			
			String [] input = br.readLine().split(" ");
			int sum = 0;
			for(int i = 0; i < N-1; i++){
				sum += Integer.parseInt(input[i]);
			}
			System.out.println((N*(N+1)/2) - sum);
		}
		br.close();
	}
	
	public static void solve2() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int tc = 0; tc < T; tc++){
			int N = Integer.parseInt(br.readLine());
			
			String [] input = br.readLine().split(" ");
			int sum = 0;
			for(int i = 0; i < N-1; i++){
				sum ^= Integer.parseInt(input[i]);
			}
			for(int i = 1; i <= N; i++){
				sum ^= i;
			}
			System.out.println(sum);
		}
		br.close();
	}
}
