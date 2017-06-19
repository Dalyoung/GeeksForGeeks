package c1_basic.FindTheOddOccurence;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class GFG {
	
	/*
1
5
8 4 4 8 23

Output
23
	 */
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int arr[] = new int[202];
		for(int tc = 0; tc < T; tc++){
			int N = Integer.parseInt(br.readLine());
			String [] input = br.readLine().split(" ");
			for(int i = 0; i < N; i++){
				arr[i] = Integer.parseInt(input[i]);
			}
			int ret = 0;
			for(int i = 0; i < N; i++){
				ret = arr[i] ^ ret;
			}
			System.out.println(ret);
		}
		br.close();
	}
}
