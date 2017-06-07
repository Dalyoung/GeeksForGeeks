package easy.GreaterOnRightSide;

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int arr[] = new int[1000];
		Num nums[] = new Num[1000];
		int T = Integer.parseInt(br.readLine());
		for(int tc = 0; tc < T; tc++){
			int N = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for(int i = 0; i < N; i++){
				arr[i] = Integer.parseInt(st.nextToken());
				nums[i] = new Num(arr[i], i);
			}
			
			Arrays.sort(nums, 0, N, new Comparator<Num>() {

				@Override
				public int compare(Num arg0, Num arg1) {
					// TODO Auto-generated method stub
					if(arg1.v != arg0.v){
						return arg1.v - arg0.v;
					}else{
						return arg0.i - arg1.i;
					}
				}
			});
			
			
			int index = 0;
			for(int i = 0; i < N; i++){
				while(index < N){
					if(nums[index].i > i){
						break;
					}else{
						index++;
					}
				}
				if(index != N){
					arr[i] = nums[index].v;
				}else{
					arr[i] = -1;
				}
			}
			for(int i = 0; i < N; i++){
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			
		}
		br.close();
	}
	
	static class Num{
		int v;
		int i;
		public Num(int v, int i){
			this.v = v;
			this.i = i;
		}
		@Override
		public String toString() {
			return "Num [v=" + v + ", i=" + i + "]";
		}
		
		
	}
}
