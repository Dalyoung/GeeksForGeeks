package c1_basic.CountPossibleTriangles;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

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
		solve1();
	}
	
	public static void solve1() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int arr[] = new int[100];
		for(int tc = 0; tc < T; tc++){
			int N = Integer.parseInt(br.readLine());
			
			String [] input = br.readLine().split(" ");
			for(int i = 0; i < N; i++){
				arr[i] = Integer.parseInt(input[i]);
			}
			Arrays.sort(arr, 0, N);
			
//			int i, j, k;
			int ret = 0;
			for(int i = 0; i < N-2; i++){
				int k = i+2;
				for(int j = i+1; j < N-1; j++){
					while(k < N && arr[i] + arr[j] > arr[k]){
						k++;
					}
					ret += k - j - 1;
				}
			}
			System.out.println(ret);
		}
		br.close();
	}
}
