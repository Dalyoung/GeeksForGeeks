package c1_basic.NumberOfOccurrence;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class GFG {
	
	/*
Input:
2
7 2
1 1 2 2 2 2 3
7 4
1 1 2 2 2 2 3

Output:
4
-1
	 */
	public static void main(String[] args) throws Exception {
//		solve1();
		solve2();
	}
	
	public static void solve1() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int arr[] = new int[300];
		for(int tc = 0; tc < T; tc++){
			String [] input = br.readLine().split(" ");
			int N = Integer.parseInt(input[0]);
			int X = Integer.parseInt(input[1]);
			
			input = br.readLine().split(" ");
			int count = 0;
			for(int i = 0; i < N; i++){
				arr[i] = Integer.parseInt(input[i]);
				if(arr[i] == X){
					count++;
				}
			}
			
			if(count == 0){
				System.out.println(-1);
			}else{
				System.out.println(count);
			}
		}
		br.close();
	}
	
	public static void solve2() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int arr[] = new int[300];
		int s, e, mid, first, last;
		for(int tc = 0; tc < T; tc++){
			String [] input = br.readLine().split(" ");
			int N = Integer.parseInt(input[0]);
			int X = Integer.parseInt(input[1]);
			
			input = br.readLine().split(" ");
			for(int i = 0; i < N; i++){
				arr[i] = Integer.parseInt(input[i]);
			}
			
			first = -1; last = 0;
			
			s = 0; e = N; mid = 0;
			while(s < e){
				mid = (s + e) / 2;
				if((mid == 0 || arr[mid-1] < X) && arr[mid] == X){
					first = mid;
					break;
				}else if(arr[mid] < X){
					s = mid + 1;
				}else{
					e = mid;
				}
			}
//			System.out.println(first);
			if(first == -1){
				System.out.println(first);
				continue;
			}
			
			s = 0; e = N; mid = 0;
			while(s < e){
				mid = (s + e) / 2;
				if((mid == N-1 || arr[mid+1] > X) && arr[mid] == X){
					last = mid;
					break;
				}else if(arr[mid] > X){
					e = mid;
				}else{
					s = mid + 1;
				}
			}
			System.out.println(last - first + 1);
			
		}
		br.close();
	}
}
