package c0_school.OverlappingRectangles;

import java.util.*;
import java.lang.*;
import java.io.*;

public class GFG {

	/*
Input:
2
0 10 10 0
5 5 15 0
0 2 1 1
-2 -3 0 2

Output:
1
0
	 * 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		Point [] r1 = new Point[2];
		Point [] r2 = new Point[2];
		for(int tc = 0; tc < T; tc++){
			String [] input = br.readLine().split(" ");
			r1[0] = new Point(Integer.parseInt(input[0]), Integer.parseInt(input[1]));
			r1[1] = new Point(Integer.parseInt(input[2]), Integer.parseInt(input[3]));
			
			input = br.readLine().split(" ");
			r2[0] = new Point(Integer.parseInt(input[0]), Integer.parseInt(input[1]));
			r2[1] = new Point(Integer.parseInt(input[2]), Integer.parseInt(input[3]));
			
			int ret = 0;
			if((r1[0].x <= r2[0].x && r1[1].x >= r2[0].x)
					|| (r1[0].x <= r2[1].x && r1[1].x >= r2[1].x)){
				if((r1[1].y <= r2[0].y && r1[0].y >= r2[0].y)
						|| (r1[1].y <= r2[1].y && r1[0].y >= r2[1].y)){
					ret = 1;
				}
			}
			
			System.out.println(ret);
		}
		br.close();
	}

	static class Point{
		int x;
		int y;
		public Point(int x, int y){
			this.x = x;
			this.y = y;
		}
		@Override
		public String toString() {
			return "Point [x=" + x + ", y=" + y + "]";
		}
		
	}
}
