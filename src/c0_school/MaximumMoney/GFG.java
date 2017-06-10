package c0_school.MaximumMoney;

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws Exception {
		//code
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		for(int tc = 0; tc < T; tc++){
			int N, M;
			String [] input = br.readLine().split(" ");
			N = Integer.parseInt(input[0]);
			M = Integer.parseInt(input[1]);

			int ret = (N / 2) * M + (N & 1) * M;
			System.out.println(ret);
		}

		br.close();
	}
}
