package c3_Medium.SmallestDistinctWindow;

import java.util.*;
import java.lang.*;
import java.io.*;

/*
Input:
2
aabcbcdbca
aaab

Output:
4
2
*/
class GFG {
	public static void main (String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int MAX = 256;
		for(int tc = 0; tc < T; tc++){
			char [] arr = br.readLine().toCharArray();
			int countTarget[] = new int[MAX];
			int countWindow[] = new int[MAX];
			int distinctCount = 0;
			for(int i = 0; i < arr.length; i++){
				if(countWindow[arr[i]] == 0){
					countWindow[arr[i]]++;
					distinctCount++;
				}
			}
			int count = 0;
			int start = 0, start_index = -1, minLength = Integer.MAX_VALUE;
			for(int i = 0; i < arr.length; i++){
				countTarget[arr[i]]++;
				if(countTarget[arr[i]] == 1){
					count++;
				}
				
				if(count == distinctCount){
					while(countTarget[arr[start]] > 1){
						countTarget[arr[start]]--;
						start++;
					}
					
					int windowLength = i - start + 1;
					if(windowLength < minLength){
						minLength = windowLength;
						start_index = start;
					}
				}
			}
			System.out.println(minLength);
		}
		
		br.close();
	}
}
