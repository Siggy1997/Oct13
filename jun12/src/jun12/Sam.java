package jun12;

import java.util.Arrays;

//3X3배열에 1~9까지 랜덤하게 입력하기
public class Sam {
	public static void main(String[] args) {

		int[][] sam = new int[5][5];

		// [0,0] [0,1] [0,2]
		// [1,0] [1,1] [1,2]
		// [2,0] [2,1] [2,2]

		int num = 1;
		for (int i = 0; i < sam.length; i++) {

			for (int j = 0; j < sam[i].length; j++) {

				int temp = (int) (Math.random() * 25) + 1;

				System.out.println("뽑은 숫자 : " + temp);
				boolean check = false;

				Check: for (int k = 0; k < sam.length; k++) {

					for (int k2 = 0; k2 < sam[i].length; k2++) {
						// 맨 처음에는 temp와 같을 수 없으므로 else로 넘어가서 대입한다
						// 2번째 부터는 동일할 수 있으므로 검사를 해서
						// 같은거는 j--를 하여 다시 하고 중복체크를한다

						if (temp == sam[k][k2]) {
							check = true;
							break Check;

						}
					}
				}
				if (check) {
					j--;
				} else {
					sam[i][j] = temp;
				}
			}

		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < sam.length; j++) {

				System.out.print(sam[i][j]);
			}

		}
	}
}
