package medium.CountSubsequencesOfTypeABC;

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = Integer.parseInt(sc.nextLine());
		for(int tc = 0; tc < T; tc++){
			String str = sc.nextLine();
			int aCount = 0, bCount = 0, cCount = 0;
			
			for(int i = 0; i < str.length(); i++){
				if(str.charAt(i) == 'a'){
					aCount = (1 + 2 * aCount);
				}
				else if(str.charAt(i) == 'b'){
					bCount = (aCount + 2 * bCount);
				}
				else if(str.charAt(i) == 'c'){
					cCount = (bCount + 2 * cCount);
				}
			}
			
			System.out.println(cCount);
		}
	}
}