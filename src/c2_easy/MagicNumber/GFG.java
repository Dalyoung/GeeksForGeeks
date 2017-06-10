package c2_easy.MagicNumber;

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		
		int [] arr = new int[101];
		arr[0] = 1;
		int mn = 5;
		int index = 1;
		while(index < 101){
			arr[index] = mn;
			int count = 1;
			for(int i = 1; i < index && index + i < 101; i++){
				arr[index+i] = arr[index] + arr[i];
				count++;
			}
			mn *= 5;
			index += count;
		}
		
		int T = Integer.parseInt(sc.nextLine());
		
		for(int tc = 0; tc < T; tc++){
			int N = sc.nextInt();
			System.out.println(arr[N]);
		}
		sc.close();
	}
}
