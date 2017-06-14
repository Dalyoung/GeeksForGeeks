package c1_basic.KLargestElements;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class GFG {
	
	/*
Input:
2
5 2
12 5 787 1 23
7 3
1 23 12 9 30 2 50

Output:
787 23
50 30 23
	 */
	public static void main(String[] args) throws Exception {
//		solve1();
		solve2();
	}
	
	public static void solve2() throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int arr[] = new int[1000];
		int T = Integer.parseInt(br.readLine());
		for(int tc = 0; tc < T; tc++){
			String [] input = br.readLine().split(" ");
			int N = Integer.parseInt(input[0]);
			int K = Integer.parseInt(input[1]);
			
			input = br.readLine().split(" ");
			for(int i = 0; i < N; i++){
				arr[i] = Integer.parseInt(input[i]);
			}
			PriorityQueue<Integer> pq = new PriorityQueue<>();
			
			for(int i = 0; i < N; i++){
				if(pq.size() < K){
					pq.add(arr[i]);
				}else{
					if(pq.peek() < arr[i]){
						pq.poll();
						pq.add(arr[i]);
					}
				}
			}
			String result = "";
			for(int i = 0; i < K; i++){
				result = pq.poll() + " " + result;
			}
			System.out.println(result);
//			System.out.println(Arrays.toString(arr));
		}
		br.close();
	}
	public static void solve1() throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int arr[] = new int[1000];
		int T = Integer.parseInt(br.readLine());
		for(int tc = 0; tc < T; tc++){
			String [] input = br.readLine().split(" ");
			int N = Integer.parseInt(input[0]);
			int K = Integer.parseInt(input[1]);
			
			input = br.readLine().split(" ");
			for(int i = 0; i < N; i++){
				arr[i] = Integer.parseInt(input[i]);
			}
			
			StringBuffer sb = new StringBuffer();
			for(int i = 0; i < N; i++){
				for(int j = 0; j < N-1; j++){
					if(arr[j] > arr[j+1]){
						int temp = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = temp;
					}
				}
				sb.append(arr[N-i-1]).append(" ");
				if(i+1 == K){
					break;
				}
			}
			System.out.println(sb.toString());
//			System.out.println(Arrays.toString(arr));
		}
		br.close();
	}
}
