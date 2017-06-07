package basic.BitDifference;

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 0; tc < T; tc++){
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			String str = Integer.toBinaryString(A ^ B);
			int ret = 0;
			for(int i = 0; i < str.length(); i++){
				if(str.charAt(i) == '1'){
					ret++;
				}
			}
			
			System.out.println(ret);
		}
	}
}
