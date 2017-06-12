package c1_basic.FillArrayWith1s;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GFG {
	
	/*
Input:
2
15
1 0 1 0 0 1 0 1 1 0 1 1 0 0 1
17
0 0 1 1 0 0 1 1 0 1 1 1 1 0 0 0 1

Output:
1
2
	 */
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int tc = 0; tc < T; tc++){
			int N = Integer.parseInt(br.readLine());
			String [] input = br.readLine().split(" ");
			int index = -1;
			int max = -1;
			for(int i = 0; i < N; i++){
				if("1".equals(input[i])){
					if(index == -1){
						max = i;
					}else{
						max = Math.max(max, (i-index)/2);
					}
					index = i;
				}
			}
			if(index != N-1 && index != -1){
				max = Math.max(max, N-1-index);
			}
			System.out.println(max);
		}
		
		br.close();
	}
}
