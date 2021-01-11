package asdf;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 왕실의나이트 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String target = sc.nextLine();
		String col = target.substring(0, 1);
		int row = Integer.parseInt(target.substring(1,2));
		List<int[]> step = new ArrayList<int[]>();
		step.add(new int[] {-2,-1});
		step.add(new int[] {-2,1});
		step.add(new int[] {2,1});
		step.add(new int[] {2,-1});
		step.add(new int[] {1,2});
		step.add(new int[] {1,-2});
		step.add(new int[] {-1,2});
		step.add(new int[] {-1,-2});
		
		int result = 0;
		
		for (int i = 0 ; i < step.size() ; i++) {
			int[] temp = step.get(i);
			int addCol = temp[0];
			int addRow = temp[1];
			
			char colTmp = (char)(col.charAt(0) + addCol);
			int rowTmp = row + addRow;
			
			if (colTmp >= 'a' && colTmp <= 'h' && rowTmp >= 1 && rowTmp <= 8) {
				result++;
			}
		}
		System.out.println(result);
}

}

