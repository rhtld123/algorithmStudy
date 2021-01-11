package asdf;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class »óÇÏÁÂ¿ì {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int size = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		
		int x = 1;
		int y = 1;
		while (st.hasMoreTokens()) {
			String action = st.nextToken();
			switch (action) {
			case "L":
				if (isChecked(y-1,size)) {
					y--;
				}
				break;
			case "R":
				if (isChecked(y+1,size)) {
					y++;
				}
				break;
			case "U":
				if (isChecked(x-1,size)) {
					x--;
				}
				break;
			case "D":
				if (isChecked(x+1,size)) {
					x++;
				}
				break;
			}
		}
		System.out.println(x + " " + y);
	}
	
	public static boolean isChecked(int num, int size) {
		return num > 0 && num <= size;
	}

}
