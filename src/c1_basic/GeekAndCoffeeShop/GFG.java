package c1_basic.GeekAndCoffeeShop;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GFG {
	/*
Input:
2
100 4
10 3

Output:
12
2
	 */
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int tc = 0; tc < T; tc++){
			String [] input = br.readLine().split(" ");
			int N = Integer.parseInt(input[0]);
			int M = Integer.parseInt(input[1]) - 1;
			while(N > 0 && M > 0){
				N = N / 2;
				M--;
			}
			System.out.println(N);
		}
		
		br.close();
	}
}
