package c1_basic.PairsOfPrimeNumber;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GFG {
	
	/*
Input
2
4
8

Output
2 2
2 2 2 3 3 2

Constraints:

1 ¡Â T ¡Â 50
4 ¡Â N ¡Â 400
	 */
	public static void main(String[] args) throws Exception {
		
		boolean primes[] = new boolean[400];
		List<Integer> pList = new ArrayList<>();
		for(int i = 2; i < 220; i++){
			if(!primes[i]){
				primes[i] = true;
				pList.add(i);
				for(int j = i + i; j < 220; j+= i){
					primes[j] = true;
				}
			}
		}
		
//		System.out.println(Arrays.toString(pList.toArray()));
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int tc = 0; tc < T; tc++){
			int N = Integer.parseInt(br.readLine());
			StringBuffer sb = new StringBuffer();
			int index1 = 0;
			int index2 = 0;
			while(pList.get(index1) * 2 <= N){
				index2 = 0;
				while(pList.get(index1) * pList.get(index2) <= N){
					sb.append(pList.get(index1)).append(" ").append(pList.get(index2)).append(" ");
					index2++;
				}
				index1++;
			}
			System.out.println(sb.toString());
		}
		br.close();
	}
}
