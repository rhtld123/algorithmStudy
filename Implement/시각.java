package asdf;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ½Ã°¢ {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int result = 0;
		for (int i = 0 ; i <= n ; i++) {
			for (int j = 0 ; j < 60 ; j++) {
				for (int k = 0 ; k < 60 ; k++) {
					String time = Integer.toString(i) + Integer.toString(j) + Integer.toString(k);
					if (time.contains("3")) {
						result++;
					}
				}
			}
		}
		System.out.println(result);
	}

}
