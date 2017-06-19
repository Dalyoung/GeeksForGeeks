package c1_basic.ReverseSubArray;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class GFG {
	
	/*
Input:
1
7
1 2 3 4 5 6 7
2 4

Output:
1 4 3 2 5 6 7 
	 */
	public static void main(String[] args) throws Exception {
		solve1();
//		solve2();
	}
	
	public static void solve1() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int arr[] = new int[1001];
		for(int tc = 0; tc < T; tc++){
			int N = Integer.parseInt(br.readLine());
			
			String [] input = br.readLine().split(" ");
			for(int i = 0; i < N; i++){
				arr[i+1] =  Integer.parseInt(input[i]);
			}
			input = br.readLine().split(" ");
			int L = Integer.parseInt(input[0]);
			int R = Integer.parseInt(input[1]);
			for(int i = 0; i <= (R-L) / 2; i++){
				int temp = arr[L+i];
				arr[L+i] = arr[R-i];
				arr[R-i] = temp;
			}
			for(int i = 1; i <= N; i++){
				System.out.print(arr[i] + " ");
			}
			System.out.println();
		}
		br.close();
	}
}
