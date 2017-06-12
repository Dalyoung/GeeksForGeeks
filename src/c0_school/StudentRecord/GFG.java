package c0_school.StudentRecord;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class GFG {

	/*
Input:
2
2
Shrikanth 20 30 10 Ram 100 50 10
3
Adam 50 10 40 Suresh 22 1 56 Rocky 100 90 10

Output:
Ram 53
Rocky 66
	 * 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int tc = 0; tc < T; tc++){
			int N = Integer.parseInt(br.readLine());
			String [] input = br.readLine().split(" ");
			String maxName = "";
			int maxAvg = 0;
			
			for(int i = 0; i < N; i++){
				int avg = (Integer.parseInt(input[i*4+1]) + Integer.parseInt(input[i*4+2]) + Integer.parseInt(input[i*4+3])) / 3;
				if(avg > maxAvg){
					maxAvg = avg;
					maxName = input[i*4];
				}
			}
			
			System.out.println(maxName + " " + maxAvg);
		}
		br.close();
	}

}
