package c0_school.CompeteTheSkills;

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws Exception {
		//code
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String [] input1, input2;
		int T = Integer.parseInt(br.readLine());
		long numa = 0, numb = 0;
		for(int t = 0; t < T; t++){
		    int a = 0;
		    int b = 0;
		    input1 = br.readLine().split(" ");
		    input2 = br.readLine().split(" ");
		    
		    for(int i = 0; i < input1.length; i++){
		        numa = Long.parseLong(input1[i]);
		        numb = Long.parseLong(input2[i]);
		        if(numa < numb){
		            b++;
		        }else if(numa > numb){
		            a++;
		        }
		    }
		    System.out.println(a + " " + b);
		}
	}
}
