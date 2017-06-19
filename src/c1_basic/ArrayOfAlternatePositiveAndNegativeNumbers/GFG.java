package c1_basic.ArrayOfAlternatePositiveAndNegativeNumbers;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class GFG {
	
	/*
Input
1
9
9 4 -2 -1 5 0 -5 -3 2

Output
9 -2 4 -1 5 -5 0 -3 2
	 */
	public static void main(String[] args) throws Exception {
		solve1();
//		solve2();
	}
	
	public static void solve1() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int pArr[] = new int[1000];
		int nArr[] = new int[1000];
		for(int tc = 0; tc < T; tc++){
			int N = Integer.parseInt(br.readLine());
			int p = 0;
			int n = 0;
			String [] input = br.readLine().split(" ");
			for(int i = 0; i < N; i++){
				int temp = Integer.parseInt(input[i]);
				if(temp >= 0){
					pArr[p] = temp;
					p++;
				}else{
					nArr[n] = temp;
					n++;
				}
			}
			StringBuffer sb = new StringBuffer();
			int pIndex = 0, nIndex = 0;
			while(pIndex < p && nIndex < n){
				sb.append(pArr[pIndex]).append(" ").append(nArr[nIndex]).append(" ");
				pIndex++;
				nIndex++;
			}
			while(pIndex < p){
				sb.append(pArr[pIndex]).append(" ");
				pIndex++;
				
			}
			while(nIndex < n){
				sb.append(nArr[nIndex]).append(" ");
				nIndex++;
				
			}
			
			System.out.println(sb.toString());
		}
		br.close();
	}
}
