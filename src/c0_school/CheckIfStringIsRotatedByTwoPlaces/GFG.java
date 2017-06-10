package c0_school.CheckIfStringIsRotatedByTwoPlaces;

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws Exception {
		//code
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int tc = 0; tc < T; tc++){
			String str1 = br.readLine();
			String str2 = br.readLine();
			
			String temp1 = str1.substring(2) +   str1.substring(0, 2);
			String temp2 = str1.substring(str1.length() - 2) +   str1.substring(0, str1.length() - 2);
			
		
			if(str2.equals(temp1) || str2.equals(temp2)){
				System.out.println(1);
			}else{
				System.out.println(0);
			}
		}
		br.close();
	}
}
