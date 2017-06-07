package basic.NumberOfPaths;

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		
		int arr[][] = new int[11][11];
		for(int i = 1; i < 11; i++){
			arr[i][1] = 1;
			arr[1][i] = 1;
		}
		int T = sc.nextInt();
		for(int tc = 0; tc < T; tc++){
			int N = sc.nextInt();
			int M = sc.nextInt();
			
			for(int i = 2; i <= N; i++){
				for(int j = 2; j <= M; j++){
					arr[i][j] = arr[i-1][j] + arr[i][j-1];
				}
			}
			
			System.out.println(arr[N][M]);
		}
		sc.close();
	}
}