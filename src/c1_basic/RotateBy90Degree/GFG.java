package c1_basic.RotateBy90Degree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class GFG {
	
	/*
Input
2
3
1 2 3 4 5 6 7 8 9
4
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16

Output
3 6 9 2 5 8 1 4 7 
	 */
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int matrix[][] = new int[50][50];
		for(int tc = 0; tc < T; tc++){
			int N = Integer.parseInt(br.readLine());
			String input[] = br.readLine().split(" ");
			for(int i = 0; i < N; i++){
				for(int j = 0; j < N; j++){
					matrix[i][j] = Integer.parseInt(input[i * N + j]);
				}
			}
			
			int s = 0, l = N;
			while(s < l - 1){
				for(int i = s; i < l - 1; i++){
					int temp = matrix[s][i];
					matrix[s][i] = matrix[i][l-1];
					matrix[i][l-1] = matrix[l-1][l-1-i+s];
					matrix[l-1][l-1-i+s] = matrix[l-1-i+s][s];
					matrix[l-1-i+s][s] = temp;
					
				}
				s++;
				l--;
			}
			
			for(int i = 0; i < N; i++){
				for(int j = 0; j < N; j++){
					System.out.print(matrix[i][j] + " ");
				}
			}
			System.out.println();
		}
		
		br.close();
	}
}
