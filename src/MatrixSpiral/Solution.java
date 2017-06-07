package MatrixSpiral;

public class Solution {
	public static void main(String[] args) {
		
		int a[][] = { {1,  2,  3,  4,  5,  6},
		        {7,  8,  9,  10, 11, 12},
		        {13, 14, 15, 16, 17, 18}
		    };
		
		/* OUTPUT:
		  1 2 3 4 5 6 12 18 17 16 15 14 13 7 8 9 10 11
		*/
		
		Solution s = new Solution();
		s.solve(a);
	}
	
	public void solve(int [][] arr){
		int sr = 0, er = arr.length, sc = 0, ec = arr[0].length;
		System.out.println(er + "/" + ec);
		
		while(sr < er && sc < ec){
			for(int i = sc; i < ec; i++){
				System.out.print(arr[sr][i] + " ");
			}
			sr++;
			
			for(int i = sr; i < er; i++){
				System.out.print(arr[i][ec-1] + " ");
			}
			ec--;
			
			if(sr < er){
				for(int i = ec - 1; i >= sc; i--){
					System.out.print(arr[er-1][i] + " ");
				}
				er--;
			}
			if(sc < ec){
				for(int i = er - 1; i >= sr; i--){
					System.out.print(arr[i][sc] + " ");
				}
				sc++;
			}
		}
		
	}
}
