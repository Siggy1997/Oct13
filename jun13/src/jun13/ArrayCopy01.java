package jun13;

import java.util.Arrays;

//배열 복사
//깊은 복사
//얕은 복사

public class ArrayCopy01 {
	public static void main(String[] args) {
		
		int[] arr01 = {50, 100, 150};
		int[] arr02 = new int[3];
		//쉬운 방법
		System.arraycopy(arr01, 0, arr02, 0, 3);
		/*
		 * src: 원본대상
		 * srcPos : 원본의 어느 위치부터 읽어올것인지
		 * dest: 값을담을 배열
		 * destPos : 어느 위치에 저장할지
		 * length : 어느길이만큼 읽어올것인지 = 배열의 길이
		 */
		/*ㄴㄴㄴ
		for (int i = 0; i < arr01.length; i++) {
			arr02[i] = arr01[i];
		}
		*/
		int[] arr04 = {10, 20, 30, 40, 50};
		int[] arr05 = new int[5];
		System.arraycopy(arr04, 1, arr05, 1, 4);
		arr01[0] = 9;
		System.out.println(Arrays.toString(arr05));
		// arr05의 값을 {0,20,30,40,0};이 되게 arraycopy 해주세요 
		
		
		
		
		
		System.out.println(Arrays.toString(arr01));
		System.out.println(Arrays.toString(arr02));
		
		
		
		
		int num01 = 100;
		int num02 =num01;
		num01 = 2;
		num02 = 10;
		
		
		System.out.println(num01);
		System.out.println(num02);

	}
}
