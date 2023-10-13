package jun12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;


//중복 없이 로또 번호 뽑기
public class DoWhile02 {
	public static void main(String[] args) {

		int[] lotto = new int[6]; // 1~45
		for (int i = 0; i < lotto.length; i++) {
			int random = (int) (Math.random() * 45) + 1;
			lotto[i] = random;
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--;
				}
			}

		}

		// print
		System.out.println(Arrays.toString(lotto));

		
		System.out.println("");
		System.out.println("");
		System.out.println("");

		 // 추후에 배울 정말 쉬운 방법1
	      // 중복을 저장하지 않는 자료형을 이용하는 방법
	      // Set 자료형 생성하기
	      Set<Integer> lotto2 = new HashSet<Integer>();
	      
	      //lotto의 내부 크기가 6보다 작으면 실행
	      while (lotto2.size() < 6) {
	         //값 저장하기
	         lotto2.add((int) (Math.random() * 45) + 1);
	      }
	      
	      System.out.println("출력");
	      System.out.println(lotto2);//출력      
	      //정렬하기
	      ArrayList<Integer> lottoSort 
	               = new ArrayList<Integer>(lotto2);
	      Collections.sort(lottoSort);
	      System.out.println("정렬");
	      System.out.println(lottoSort);
	      
	      
	      
	      
	// 내일 해야 할 것
	// 스위치, 동적 가변배열, 배열 복사, String용법, 객체지향(212) 
	      
	   }
	}