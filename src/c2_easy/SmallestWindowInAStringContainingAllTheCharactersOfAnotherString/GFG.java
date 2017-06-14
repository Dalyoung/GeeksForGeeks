package c2_easy.SmallestWindowInAStringContainingAllTheCharactersOfAnotherString;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class GFG {
	/*
Input:
2
timetopractice
toc
zoomlazapzo
oza

Output:
toprac
apzo


1
timetopractice
toc
	 */
	public static void main(String[] args) throws Exception{
		GFG g = new GFG();
		g.solve();
		
	}
	
	public void solve() throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int MAX = 256;
		int T = Integer.parseInt(br.readLine());
		for(int tc = 0; tc < T; tc++){
			char text[] = br.readLine().toCharArray();
			char window[] = br.readLine().toCharArray();
			int countText[] = new int[MAX];
			int countWindow[] = new int[MAX];
			
			int windowLength = window.length;
			int textCount = 0;
			for(int i = 0; i < windowLength; i++){
				countWindow[window[i]]++;
			}
			//System.out.println(Arrays.toString(countWindow));
			int start = 0;
			int fromIndex = -1;
			int minLength = Integer.MAX_VALUE;
			//int toIndex = 0;
			for(int i = 0; i < text.length; i++){
				if(countWindow[text[i]] != 0){
					countText[text[i]]++;
					if(countWindow[text[i]] >= countText[text[i]]){
						textCount++;
					}
					
					if(textCount == windowLength){
						while(countText[text[start]] == 0 || countText[text[start]] > countWindow[text[start]]){
							if(countText[text[start]] != 0 && countText[text[start]] > countWindow[text[start]]){
								countText[text[start]]--;
							}
							start++;
						}
						
						if(minLength > i - start + 1){
							minLength = i - start + 1;
							fromIndex = start;
						}
					}
				}
				
			}
			//System.out.println(start + "," + fromIndex + "," + minLength);
			if(fromIndex != -1){
				for(int i = fromIndex; i < fromIndex + minLength; i++){
					System.out.print(text[i]);
				}
				System.out.println();
			}else{
				System.out.println(-1);
			}
		}
		
		br.close();
	}
	
	
}
