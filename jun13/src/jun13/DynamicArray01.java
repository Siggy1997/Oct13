package jun13;

import java.util.Arrays;

//동적 가변 배열
/*
 * 동적 가변배열이란 배열의 길이를 동적으로 필요시에 생성하는것
 * 동적 가변 배열이 아는것은 처음부터 배열의 길이를 초기화 해서
 * 만들어 사용하지만, 동적가변배열로 하게 되면 필요시에 사용해야합니다
 */
public class DynamicArray01 {
	public static void main(String[] args) {

		char[][] stars = new char[10][]; // 동적가변배열로 선언
		System.out.println(stars.length);
		// 모든집을 돌아딘면서 동적으로 방을 만들어 줘야 사용가능합니다
		for (int i = 0; i < stars.length; i++) {
			stars[i] = new char[i + 1]; // 2차원 배열 = 배열속 배열
			for (int j = 0; j < stars[i].length; j++) {
				stars[i][j] = '*';
			}
			// print
			
			
			for (char[] cs : stars) {
				System.out.println(Arrays.toString(cs));
			}

		}
		for (int j = 0; j < stars.length; j++) {
			for (int j2 = 0; j2 < stars[j].length; j2++) {
				System.out.print(stars[j][j2]);
				
			}
			System.out.println("");
		}

	}
}
