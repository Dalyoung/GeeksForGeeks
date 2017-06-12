package c0_school.EqualToProduct;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class GFG {

	/*
Input:
2
5 2
1 2 3 4 5
8 46
5 7 9 22 15 344 92 8
Output:
Yes
No
	 * 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int N, P;
		for(int tc = 0; tc < T; tc++){
			String [] input = br.readLine().split(" ");
			N = Integer.parseInt(input[0]);
			P = Integer.parseInt(input[1]);
			Set<Integer> set = new HashSet<>();
			input = br.readLine().split(" ");
			set.add(Integer.parseInt(input[0]));
			boolean ret = false;
			for(int i = 1; i < N; i++){
				int temp = Integer.parseInt(input[i]);
				
				if(temp == 0){
					if(P == 0){
						ret = true;
						break;
					}else{
						continue;
					}
				}
				
				if(P%temp == 0 && set.contains(P / temp)){
					ret = true;
					break;
				}else{
					set.add(temp);
				}
			}
			
			System.out.println(ret?"Yes":"No");
		}
		br.close();
	}

}
