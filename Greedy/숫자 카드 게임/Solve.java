package 그리디알고리즘_숫자카드게임;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solve {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
	 	int m = Integer.parseInt(st.nextToken());
	 	
	 	int arr[][] = new int[n][m];
	 	
	 	for (int i = 0 ; i < n ; i++) {
	 		st = new StringTokenizer(br.readLine());
	 		for (int j = 0 ; j < m ; j++) {
	 			arr[i][j] = Integer.parseInt(st.nextToken());
	 		}
	 	}
	 		 	
	 	for (int i = 0 ; i < n ; i++) {
	 		Arrays.sort(arr[i]);	
	 	}
	 	
	 	int max = 0;
	 	for (int i = 0 ; i < n ; i++) {
	 		max = Integer.max(max,arr[i][0]);	
	 	}	 	

	 	System.out.println("answer = " + max);
	}

}
