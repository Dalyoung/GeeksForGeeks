package c0_school.ImmediateSmallerElement;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class GFG {

	/*
Input
2
5
4 2 1 5 3
6
5 6 2 3 1 7

Output
2 1 -1 3 -1
-1 2 -1 1 -1 -1
	 * 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int tc = 0; tc < T; tc++){
			int N = Integer.parseInt(br.readLine());
			String [] input = br.readLine().split(" ");
			int last = Integer.parseInt(input[0]);
			for(int i = 1; i < N; i++){
				int temp = Integer.parseInt(input[i]);
				if(temp < last){
					System.out.print(temp);
				}else{
					System.out.print(-1);
				}
				last = temp;
				System.out.print(" ");
			}
			System.out.println(-1);
		}
		br.close();
	}

}
