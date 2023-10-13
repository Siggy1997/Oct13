package jun13;

import java.util.Arrays;
import java.util.Iterator;

public class DynamicArray02 {
	public static void main(String[] args) {

		char[][] stars = new char[10][];
		// 내부 크기를 랜덤하게 잡아주세요 1~10
		for (int i = 0; i < stars.length; i++) {
			stars[i] = new char[(int) (Math.random() * 10 + 1)];
			for (int j = 0; j < stars[i].length; j++) {
				stars[i][j] = '*';
				System.out.print(stars[i][j]);
			}
			System.out.println("");
		}
		// System.out.println(Arrays.toString(stars));
		// for (char[] sh : stars) {
		// System.out.println(Arrays.toString(sh));

		//배열 복사
		//깊은 복사 / 얕은복사
		//깊은 복사 = 값만 가져옴
		
		int[] arr03 = new int[] {50, 40, 30, 20, 10};
		int[] arr04 = arr03;
		int[] arr05 = new int[3];
		System.arraycopy(arr04, 0, arr04, 0, 3);
		arr03[0] = 88; //arr04는 값이 없음. 03바꾸면 같이 바뀜. 주소값변경
		//arr05[0] = 33;
		
		System.out.println(Arrays.toString(arr03));
		System.out.println(Arrays.toString(arr04));
		System.out.println(Arrays.toString(arr05));
		
		
		
		
	}

}
