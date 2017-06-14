package c1_basic.RemoveCharacter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class GFG {
	
	/*
Input:
2
geeksforgeeks
mask
removeccharaterfrom
string

Output:
geeforgee

emovecchaaefom
	 */
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int MAX = 256;
		for(int tc = 0; tc < T; tc++){
			char[] s1 = br.readLine().toCharArray();
			char[] s2 = br.readLine().toCharArray();
			boolean check[] = new boolean[MAX];
			for(int i = 0; i < s2.length; i++){
				check[s2[i]] = true;
			}
			
			String str = "";
			StringBuffer sb = new StringBuffer();
			for(int i = 0; i < s1.length; i++){
				if(!check[s1[i]]){
					sb.append(s1[i]);
					str += s1[i];
				}
			}
			System.out.println(sb.toString());
			//System.out.println(str);
			
		}
		
		br.close();
	}
}
