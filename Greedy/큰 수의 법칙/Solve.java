package 그리디알고리즘_큰수의법칙;

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
		int k = Integer.parseInt(st.nextToken());

		int numberArray[] = new int[n];

		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < n; i++) {
			numberArray[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(numberArray);
		int firstMaxNum = numberArray[n-1];
		int secondMaxNum = numberArray[n-2];
		
		int idx=0;
		int sum=0;
		while (idx < m) {
			if (idx > 0 && idx % k == 0) {
				sum+= secondMaxNum;
				idx++;
			} else {
				sum+=firstMaxNum;
				idx++;
			}
		}
		
		System.out.println("answer = " + sum);
	}
}
