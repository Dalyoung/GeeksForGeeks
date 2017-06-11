package c0_school.CheckIfGivenFourPointsFromASquare;

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws Exception {
		//code
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int px[] = new int[4];
		int py[] = new int[4];
		for(int tc = 0; tc < T; tc++){
			String input[] = br.readLine().split(" ");
			for(int i = 0; i < 4; i++){
				px[i] = Integer.parseInt(input[i*2]);
				py[i] = Integer.parseInt(input[i*2+1]);
			}
			int d1 = (int)(Math.pow(px[0] - px[1], 2) + Math.pow(py[0] - py[1], 2));
			int d2 = (int)(Math.pow(px[0] - px[2], 2) + Math.pow(py[0] - py[2], 2));
			int d3 = (int)(Math.pow(px[0] - px[3], 2) + Math.pow(py[0] - py[3], 2));
			
			
			int ret = 0;
			if(d1 != d2 && d2 != d3 && d1 != d3){
				ret = 0;
			}
			else if(d1 == d2 && d1 == d3){
				ret = 0;
			}
			else if(d1 == d2){
				if(d3 == (int)(Math.pow(px[1] - px[2], 2) + Math.pow(py[1] - py[2], 2))){
					ret = 1;
				}else{
					ret = 0;
				}
			}
			else if(d1 == d3){
				if(d2 == (int)(Math.pow(px[1] - px[3], 2) + Math.pow(py[1] - py[3], 2))){
					ret = 1;
				}else{
					ret = 0;
				}
			}
			else if(d2 == d3){
				if(d1 == (int)(Math.pow(px[2] - px[3], 2) + Math.pow(py[2] - py[3], 2))){
					ret = 1;
				}else{
					ret = 0;
				}
			}
			
			
			System.out.println(ret);
		}
		
		br.close();
	}
}

/*
Input:
2
20 20 20 10 10 20 10 10
10 10 10 10 20 10 20 30

Output:
1
0
*/
