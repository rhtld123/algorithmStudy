package DFS_음료수얼려먹기;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 음료수얼려먹기 {
	
	public static int n,m;
	public static int map[][];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken()); // 세로 n
		m = Integer.parseInt(st.nextToken()); // 가로 m
		
		map = new int[n][m];
		for (int i = 0; i < n ; i++ ) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0 ; j < m ; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		int answer = 0;
		
		for (int i = 0 ; i < n ; i++) {
			for (int j = 0; j < m ; j++) {
				if (dfs(i,j)) {
					answer++;
				}
			}
		}
		
		System.out.println(answer);
	}
	public static boolean dfs(int i, int j) {
		if (i < 0 || i >=n || j < 0 || j >= m) {
			return false;
		}
		
		if (map[i][j] == 0) {
			map[i][j] = 1;
			dfs(i+1,j);
			dfs(i-1,j);
			dfs(i,j+1);
			dfs(i,j-1);
			return true;
		}
		return false;
	}

}
