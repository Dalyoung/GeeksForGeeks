package c1_basic.UncommonCharacters;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class GFG {
	
	/*
1
characters
alphabets

Output:
bclpr
	 */
	public static void main(String[] args) throws Exception {
		solve1();
//		solve2();
	}
	public static void solve1() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int count1[] = new int[26];
		int count2[] = new int[26];
		for(int tc = 0; tc < T; tc++){
			String s1 = br.readLine();
			String s2 = br.readLine();
			
			Arrays.fill(count1, 0);
			Arrays.fill(count2, 0);
			
			for(int i = 0; i < s1.length(); i++){
				count1[s1.charAt(i) - 'a']++;
			}
			for(int i = 0; i < s2.length(); i++){
				count2[s2.charAt(i) - 'a']++;
			}
			StringBuffer sb = new StringBuffer();
			for(int i = 0; i < 26; i++){
				if((count1[i] == 0 && count2[i] != 0) || (count1[i] != 0 && count2[i] == 0)){
					sb.append((char)(i+'a'));
				}
			}
			System.out.println(sb.toString());
			
		}
		br.close();
	}
}
