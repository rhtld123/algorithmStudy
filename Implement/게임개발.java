package asdf;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ���Ӱ��� {

	public static void main(String[] args) throws IOException {
		int result = 1;
		int dx[] = new int[] {-1,0,1,0}; //�� �� �� ��
		int dy[] = new int[] {0,1,0,-1}; //�� �� �� ��
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int map[][] = new int[n][m];
		
		st = new StringTokenizer(br.readLine());
		int characterX = Integer.parseInt(st.nextToken());
		int characterY = Integer.parseInt(st.nextToken());
		int characterLook = Integer.parseInt(st.nextToken());
		
		
		for (int i = 0 ; i < n ; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m ; j++) {
				int data = Integer.parseInt(st.nextToken());
				map[i][j] = data;
			}
		}
		
		boolean isCheckMap[][] = new boolean[n][m];
		
		for (int i = 0 ; i < n ; i++) {
			for (int j = 0; j < m ; j++) {
				if (map[i][j] == 0) {
					isCheckMap[i][j]=false;
				} else {
					isCheckMap[i][j]=true;
				}
			}
		}
		
		isCheckMap[characterX][characterY]=true;
		
		while (true) {
			/* �ݽð� ���� 90�� ȸ�� */
			if (characterLook - 1 < 0) {
				characterLook = 3;
			} else {
				characterLook--;
			}
			/* ����, ������ ���� ĭ �� �� �̵� */
			if (map[characterX+dx[characterLook]][characterY+dy[characterLook]] == 0
				&& !isCheckMap[characterX+dx[characterLook]][characterY+dy[characterLook]]) {
				characterX+= dx[characterLook];
				characterY+= dy[characterLook];
				isCheckMap[characterX][characterY]=true;
				result++;
			} else {
				int check = 0;
				/* �� ���� ��� ���� ���̰ų� �ٴ��� ��� */
				for (int i = 0 ; i < 4 ; i++) {
					if (map[characterX+dx[i]][characterY+dy[i]] == 1
							|| isCheckMap[characterX+dx[i]][characterY+dy[i]]) {
						check++;
					}
				}
				if (check == 4) {
					if (characterLook == 0 ) {
						if (map[characterX+1][characterY] == 1) {
							break;
						} else {
							characterX++;
							result++;
						}
					}
					if (characterLook == 1 ) {
						if (map[characterX][characterY-1] == 1) {
							break;
						} else {
							characterY--;
							result++;
						}
					}
					if (characterLook == 2 ) {
						if (map[characterX-1][characterY] == 1) {
							break;
						} else {
							characterX--;
							result++;
						}
					}
					if (characterLook == 3 ) {
						if (map[characterX][characterY+1] == 1) {
							break;
						} else {
							characterY++;
							result++;
						}
					}
				}
				
			}
			
		}
		
		
		System.out.println(result);
	}

}
