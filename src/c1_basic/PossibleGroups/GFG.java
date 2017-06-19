package c1_basic.PossibleGroups;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class GFG {
	
	/*
Input
2
5
3 6 7 2 9
4
2 1 3 4

Output
8
4
	 */
	public static void main(String[] args) throws Exception {
//		solve1();
		solve2();
		
	}
	
	public static void solve1() throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int arr[] = new int[80];
		for(int tc = 0; tc < T; tc++){
			int N = Integer.parseInt(br.readLine());
			String [] input = br.readLine().split(" ");
			for(int i = 0; i < N; i++){
				arr[i] = Integer.parseInt(input[i]);
				
			}
			int count = 0;
			for(int i = 0; i < N-1; i++){
				for(int j = i+1; j < N; j++){
					if((arr[i] + arr[j]) % 3 == 0){
						count++;
					}
					for(int k = j+1; k < N; k++){
						if((arr[i] + arr[j] + arr[k]) % 3 == 0){
							count++;
						}
						
					}
				}
			}
			System.out.println(count);
		}
		
		br.close();
	}
	
	
	/*
1. Hash all elements in a count array based on remainder, i.e, 
   for all elements a[i], do c[a[i]%3]++;
2. Now c[0] contains the number of elements which when divided
   by 3 leave remainder 0 and similarly c[1] for remainder 1 
   and c[2] for 2.
3. Now for group of 2, we have 2 possibilities
   a. 2 elements of remainder 0 group. Such possibilities are 
      c[0]*(c[0]-1)/2
   b. 1 element of remainder 1 and 1 from remainder 2 group
      Such groups are c[1]*c[2].
4. Now for group of 3,we have 4 possibilities
   a. 3 elements from remainder group 0.
      No. of such groups are c[0]C3
   b. 3 elements from remainder group 1.
      No. of such groups are c[1]C3
   c. 3 elements from remainder group 2.
      No. of such groups are c[2]C3
   d. 1 element from each of 3 groups. 
      No. of such groups are c[0]*c[1]*c[2].
5. Add all the groups in steps 3 and 4 to obtain the result.
	 */
	
	public static void solve2() throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int arr[] = new int[80];
		for(int tc = 0; tc < T; tc++){
			int N = Integer.parseInt(br.readLine());
			String [] input = br.readLine().split(" ");
			int c[] = new int[3];
			for(int i = 0; i < N; i++){
				arr[i] = Integer.parseInt(input[i]);
				c[arr[i]%3]++;
			}
			int count = 0;
			count += c[0] * (c[0] - 1) / 2;
			count += c[1] * c[2];
			count += c[0] * (c[0] - 1) * (c[0] - 2) / 6;
			count += c[1] * (c[1] - 1) * (c[1] - 2) / 6;
			count += c[2] * (c[2] - 1) * (c[2] - 2) / 6;
			count += c[0] * c[1] * c[2];
			
			//System.out.println(Arrays.toString(c));
			System.out.println(count);
		}
		
		br.close();
	}
}
