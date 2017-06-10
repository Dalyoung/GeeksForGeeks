package c2_easy.CountSubstrings;

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		int arr[] = new int[101];
		arr[2] = 1;
		for(int i = 3; i <= 100; i++){
			arr[i] = arr[i-1] + i-1;
		}
		Scanner sc = new Scanner(System.in);
		int T = Integer.parseInt(sc.nextLine());
		
		for(int tc = 0; tc < T; tc++){
			String str = sc.nextLine();
			int count = 0;
			for(int i = 0; i < str.length(); i++){
				if(str.charAt(i) == '1'){
					count++;
				}
			}
			System.out.println(arr[count]);
		}
		sc.close();
	}
}