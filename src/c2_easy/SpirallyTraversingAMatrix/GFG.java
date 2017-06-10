package c2_easy.SpirallyTraversingAMatrix;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GFG {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = 4;
		int M[][] = new int[N][N];
		int T = Integer.parseInt(br.readLine());
		for(int tc = 0; tc < T; tc++){
			for(int i = 0; i < N; i++){
				String [] input = br.readLine().split(" ");
				for(int j = 0; j < N; j++){
					M[i][j] = Integer.parseInt(input[j]);
				}
			}
			int sr = 0, er = N, sc = 0, ec = N;
//		System.out.println(er + "/" + ec);
			
			while(sr < er && sc < ec){
				for(int i = sc; i < ec; i++){
					System.out.print(M[sr][i] + " ");
				}
				sr++;
				
				for(int i = sr; i < er; i++){
					System.out.print(M[i][ec-1] + " ");
				}
				ec--;
				
				if(sr < er){
					for(int i = ec - 1; i >= sc; i--){
						System.out.print(M[er-1][i] + " ");
					}
					er--;
				}
				if(sc < ec){
					for(int i = er - 1; i >= sr; i--){
						System.out.print(M[i][sc] + " ");
					}
					sc++;
				}
			}
			System.out.println();
		}
		
		
		br.close();
	}
}
