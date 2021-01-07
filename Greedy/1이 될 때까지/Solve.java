package 그리디알고리즘_1이될때까지;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solve {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int count = 0;
		
		while (n > 1) {
			if (n % k == 0) {
				n = n / k;
				count++;
			} else {
				n--;
				count++;
			}
		}
		
		System.out.println("Answer = "+ count);
	}

}
