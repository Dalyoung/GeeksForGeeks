package c3_medium.NumberOfUniquePaths;

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		int T, N, M;
		int MAX = 15;
		int[][] map = new int[MAX+1][MAX+1];
		for(int i = 1; i <= MAX; i++){
			map[1][i] = 1;
		}
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		for(int tc = 0; tc < T; tc++){
			N = sc.nextInt();
			M = sc.nextInt();
			
			for(int i = 2; i <= N; i++){
				for(int j = 1; j <= M; j++){
					map[i][j] = map[i-1][j] + map[i][j-1];
				}
			}
			System.out.println(map[N][M]);
		}
	}
}
