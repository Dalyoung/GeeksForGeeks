package basic.CountTotalSetBits;

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc = 0; tc < T; tc++){
			int N = sc.nextInt();
			int ret = 0;
			for(int i = 1; i <= N; i++){
				ret += getCount(i);
			}
			System.out.println(ret);
		}
		
	}
	
	public static int getCount(int N){
		int ret = 0;
		while(N > 0){
			if((N & 1) == 1){
				ret++;
			}
			N >>= 1;
		}
		return ret;
	}
}