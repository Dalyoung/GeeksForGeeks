package c1_basic.BooleanMatrixProblem;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class GFG {
	
	/*
Input:
3
2 2
1 0 0 0
2 3
0 0 0 0 0 1
3 4
1 0 0 1 0 0 1 0 0 0 0 0

Output:
1 1 1 0
0 0 1 1 1 1
1 1 1 1 1 1 1 1 1 0 1 1
	 */
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int tc = 0; tc < T; tc++){
			String [] input = br.readLine().split(" ");
			int R = Integer.parseInt(input[0]);
			int C = Integer.parseInt(input[1]);
			int ret[] = new int[R*C];
			input = br.readLine().split(" ");
			
			int r, c;
			for(int i = 0; i < R*C; i++){
				if(input[i].equals("1")){
					r = i / C;
					c = i % C;
					for(int j = 0; j < C; j++){
						ret[r*C+j] = 1;
					}
					for(int j = 0; j < R; j++){
						ret[j*C+c] = 1;
					}
				}
			}
			for(int i = 0; i < ret.length; i++){
				System.out.print(ret[i] + " ");
			}
			System.out.println();
		}
		br.close();
	}
}
