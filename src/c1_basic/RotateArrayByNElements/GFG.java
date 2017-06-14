package c1_basic.RotateArrayByNElements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class GFG {
	
	/*
Input:
2
5 2
1 2 3 4 5 
10 3
2 4 6 8 10 12 14 16 18 20

Output:
3 4 5 1 2
8 10 12 14 16 18 20 2 4 6 
	 */
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int [] arr = new int[100];
		int [] arr2 = new int[100];
		for(int tc = 0; tc < T; tc++){
			String input[] = br.readLine().split(" ");
			int N = Integer.parseInt(input[0]);
			int D = Integer.parseInt(input[1]);
			
			input = br.readLine().split(" ");
			for(int i = 0; i < N; i++){
				arr[i] = Integer.parseInt(input[i]);
			}
			for(int i = 0; i < N; i++){
				
				arr2[i] = arr[(i+D) % N];
				
			}
			for(int i = 0; i < N; i++){
				System.out.print(arr2[i] + " ");
			}
			System.out.println();
		}
		
		br.close();
	}
}
