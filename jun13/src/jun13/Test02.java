package jun13;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

//사용하지 않는 import 지우기 : ctrl + shift + o


//아스키 코드 시계
public class Test02 {
	public static void main(String[] args) {
		// 1시 : 1
		//3시  : 11
		//10 1010
		//11 1011
		//12 1100
		System.out.println(Integer.toBinaryString(12));
		//      1    1 1 1 0 0
		//      32 16 8 4 2 1
		System.out.println(32+16+8+4);
		
		//Date
		LocalDate ld = LocalDate.now(); //
		System.out.println(ld);
		System.out.println(ld.getYear());
		System.out.println(ld.getMonth()); //영어식
		System.out.println(ld.getMonthValue()); //숫자
		System.out.println(ld.getDayOfMonth());
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt.getHour());
		System.out.println(ldt.getMinute());
		System.out.println(ldt.getSecond());
		
		System.out.println(Integer.toBinaryString(ldt.getHour()));
		System.out.println(Integer.toBinaryString(ldt.getMinute()));
		System.out.println(Integer.toBinaryString(ldt.getSecond()));
		
	


		int i =4 ;
		int h = ldt.getHour();
		int[] hour = new int[5];
		while(h!=0) {
			hour[i--] = h%2;
			h/=2;
		}
		System.out.println(Arrays.toString(hour));

		
		int j = 5;
		int m = ldt.getMinute();
		int[] min = new int[6];
		
		while(m!=0) {
			min[j--] = m%2;
			m/=2;
		}
		
		System.out.println(Arrays.toString(min));
		
		int k=5;
		int s = ldt.getSecond();
		int[] sec = new int[6];
		while(s!=0) {
			sec[k--] = s%2;
			s/=2;
		}
		System.out.println(Arrays.toString(sec));
		
		
		
		
	}
}
