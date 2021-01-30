import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Miro {
    public static int n;
    public static int m;
    public static int map[][];
    public static int dx[] = {-1, 1 , 0 , 0};
    public static int dy[] = {0, 0 , -1 , 1};
    public static boolean visited[][];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Queue<int[]> que = new LinkedList<int[]>();
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        map = new int[n][m];
        visited = new boolean[n][m];
        int cnt = 0 ;
        for (int i = 0 ; i < n ; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0 ; j < m ; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                visited[i][j] = false;
            }
        }
        que.add(new int[]{0,0});
        visited[0][0]=true;
        while (!que.isEmpty()) {
            int data[] = que.poll();
            cnt++;
            if (data[0] == n -1 && data[1] == m -1) {
                break;
            }
            int check = 0;
            for (int i = 0 ; i < 4 ; i++) {
                int tmpX = data[0] + dx[i];
                int tmpY = data[1] + dy[i];
                if (isOk(tmpX,tmpY) && map[tmpX][tmpY] == 1 && !visited[tmpX][tmpY]) {
                    que.add(new int[]{tmpX,tmpY});
                    visited[tmpX][tmpY] = true;
                    check++;
                }
                if (i == 3 && check == 0) {
                    cnt--;
                }
            }
        }
        System.out.printf("result = "+cnt);
    }
    public static boolean isOk(int i, int j) {
        return i < n && i > -1 && j < m && j > -1;
    }
}
