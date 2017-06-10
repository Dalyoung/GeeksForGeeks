package c2_easy.FindingPosition;

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc = 0; tc < T; tc++){
			int N = sc.nextInt();
			
			int ret = 1;
			while(ret * 2 <= N){
				ret *= 2;
			}
			
			System.out.println(ret);
		}
		
		sc.close();
	}
}
