package c2_easy.CountOccurencesOfAnagrams;

import java.util.*;
import java.lang.*;
import java.io.*;

/*
Input:
2
forxxorfxdofr
for
aabaabaa
aaba

Output:
3
4
 */
class GFG {
	static int MAX = 123;
	public static void main (String[] args) throws Exception {
		//code
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int tc = 0; tc < T; tc++){
			char[] text = br.readLine().toCharArray();
			char[] word = br.readLine().toCharArray();
			int [] textCount = new int[MAX];
			int [] wordCount = new int[MAX];
			int textLength = text.length;
			int wordLength = word.length;
			
			for(int i = 0; i < wordLength; i++){
				wordCount[word[i]]++;
				textCount[text[i]]++;
			}
			int ret = 0;
			
			for(int i = wordLength; i < textLength; i++){
				if(checkCount(textCount, wordCount)){
					ret++;
				}
				textCount[text[i]]++;
				textCount[text[i - wordLength]]--;
			}
			
			if(checkCount(textCount, wordCount)){
				ret++;
			}
			
			System.out.println(ret);
		}
		
		br.close();
	}
	
	static boolean checkCount(int [] arr1, int [] arr2){
		for(int i = 0; i < MAX; i++){
			if(arr1[i] != arr2[i]){
				return false;
			}
		}
		return true;
	}
}
