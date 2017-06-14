package c1_basic.KeypadTyping;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class GFG {
	
	/*
Input
2
geeksforgeeks
geeksquiz

Output
4335736743357
433577849
	 */
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int tc = 0; tc < T; tc++){
			char [] arr = br.readLine().toCharArray();
			StringBuffer sb = new StringBuffer();
			for(int i = 0; i < arr.length; i++){
				if(arr[i] <= 'c'){
					sb.append("2");
				}else if(arr[i] <= 'f'){
					sb.append("3");
				}else if(arr[i] <= 'i'){
					sb.append("4");
				}else if(arr[i] <= 'l'){
					sb.append("5");
				}else if(arr[i] <= 'o'){
					sb.append("6");
				}else if(arr[i] <= 's'){
					sb.append("7");
				}else if(arr[i] <= 'v'){
					sb.append("8");
				}else if(arr[i] <= 'z'){
					sb.append("9");
				}
			}
			
			System.out.println(sb.toString());
			
		}
		
		br.close();
	}
}
