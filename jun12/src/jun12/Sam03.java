package jun12;

import java.util.Arrays;

public class Sam03 {
	public static void main(String[] args) {

		int[][] sam = new int[3][3];
		// index를 뽑아서 해당 위치에 1~9 순차적으로 입력하기
		for (int i = 0; i < 10; i++) { // 입력할 숫자
			int r1 = (int) (Math.random() * 3);
			int r2 = (int) (Math.random() * 3);
			if (sam[r1][r2] == 0) {
				sam[r1][r2] = i;
			} else {
				i--;
			}

		}

		for(int[] is: sam) {
			System.out.println(Arrays.toString(is));
		}
	}
}
