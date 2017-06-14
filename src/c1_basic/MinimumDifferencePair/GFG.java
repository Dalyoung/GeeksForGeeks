package c1_basic.MinimumDifferencePair;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class GFG {
	
	/*
Input:
2
5
2 4 5 7 9
10
87 32 99 75 56 43 21 10 68 49

Output:
1
6
	 */
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int arr[] = new int[100];
		for(int tc = 0; tc < T; tc++){
			int N = Integer.parseInt(br.readLine());
			String input[] = br.readLine().split(" ");
			for(int i = 0; i < N; i++){
				arr[i] = Integer.parseInt(input[i]);
			}
			
			Arrays.sort(arr, 0, N);
			//System.out.println(Arrays.toString(arr));
			int ret = arr[1] - arr[0];
			for(int i = 2; i < N; i++){
				ret = Math.min(ret, arr[i] - arr[i-1]);
			}
			System.out.println(ret);
		}
		
		br.close();
	}
}
