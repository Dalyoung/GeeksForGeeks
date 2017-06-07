package easy.SingleNumber;

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = Integer.parseInt(sc.nextLine());
		
		for(int tc = 0; tc < T; tc++){
			int N = sc.nextInt();
			int ret = sc.nextInt();
			for(int i = 1; i < N; i++ ){
				ret = ret ^ sc.nextInt();
			}
			System.out.println(ret);
		}
		sc.close();
	}
}