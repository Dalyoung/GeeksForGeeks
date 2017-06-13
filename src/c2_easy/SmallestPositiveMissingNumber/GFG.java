package c2_easy.SmallestPositiveMissingNumber;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class GFG {
	/*
Input:
2
5
1 2 3 4 5
5
0 -10 1 3 -20
Output:
6
2

1
6
0 -10 1 3 -20 4

	 */
	public static void main(String[] args) throws Exception{
		GFG g = new GFG();
		//g.solve();
		g.solve2();
		
	}
	
	public void solve() throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		for(int tc = 0; tc < T; tc++){
			int N = Integer.parseInt(br.readLine());
			String [] input = br.readLine().split(" ");
			Set<Integer> set = new HashSet<>();
			
			for(int i = 0; i < N; i++){
				int temp = Integer.parseInt(input[i]);
				if(temp > 0){
					set.add(temp);
				}
			}
			
			int ret = 1;
			while(true){
				if(set.contains(ret)){
					ret++;
				}else{
					break;
				}
			}
			System.out.println(ret);
		}
		
		br.close();
	}
	
	public void solve2() throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		int arr[] = new int[101];
		for(int tc = 0; tc < T; tc++){
			int N = Integer.parseInt(br.readLine());
			String [] input = br.readLine().split(" ");
			
			for(int i = 0; i < N; i++){
				arr[i] = Integer.parseInt(input[i]);
			}
			
			int shift = segregate (arr, N);
			int arr2[] = new int[N-shift];
			int j=0;
			for(int i=shift;i<N;i++)
			{
				arr2[j] = arr[i];
				j++;
			}    
			// Shift the array and call 
			// findMissingPositive for
			// positive part
			int ret = findMissingPositive(arr2, j);
			System.out.println(ret);
//			System.out.println(Arrays.toString(arr));
		}
		
		br.close();
	}
	
	/* Utility function that puts all non-positive 
    (0 and negative) numbers on left side of 
    arr[] and return count of such numbers */
	int segregate (int arr[], int size)
	{
		int j = 0, i;
		for(i = 0; i < size; i++)
		{
			if (arr[i] <= 0)  
			{
				int temp;
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				// increment count of non-positive 
				// integers
				j++;  
			}
		}

		return j;
	}
	
	/* Find the smallest positive missing 
    number in an array that contains
    all positive integers */
	int findMissingPositive(int arr[], int size)
	{
//		System.out.println(size);
//		System.out.println(Arrays.toString(arr));
		int i;

		// Mark arr[i] as visited by making 
		// arr[arr[i] - 1] negative. Note that 
		// 1 is subtracted because index start 
		// from 0 and positive numbers start from 1
		for(i = 0; i < size; i++)
		{
			if(Math.abs(arr[i]) - 1 < size && arr[Math.abs(arr[i]) - 1] > 0)
				arr[Math.abs(arr[i]) - 1] = -arr[Math.abs(arr[i]) - 1];
		}
//		System.out.println(Arrays.toString(arr));
		// Return the first index value at which 
		// is positive
		for(i = 0; i < size; i++)
			if (arr[i] > 0)
				return i+1;  // 1 is added becuase indexes 
		// start from 0

		return size+1;
	}
	
}
