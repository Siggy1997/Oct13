package jun13;

import java.nio.file.spi.FileSystemProvider;
import java.util.Arrays;

//String 사용법
/*
 * 문자열, "값", 값불변, 주소,참조타입(R타입) 
 * 
 */
public class String01 {
	public static void main(String[] args) {

		int num = 10;
		int num2 = 10;

		String str = new String("Hi");
		String str2 = new String("Hi");

		if (num == num2) {
			System.out.println("같습니다");
		} else {
			System.out.println("다릅니다");
		}

		if (str.equals(str2)) { // 같은 주소 비교
			System.out.println("같습니다");
		} else {
			System.out.println("다릅니다");
		}

		// 문자열 = 문자 + 문자 + 문자 ....
		char[] ch = new char[]{ '가', '&', 'A', '1' };
		String str3 = new String(ch); // 생성자는 메소드
		System.out.println(str3);

		byte[] by = new byte[] { 65, 66, 67, 68, 69, 70 };

		// new String = byte타입을 char로 바꿔주는 성질을 가짐
		String str4 = new String(by); // short, int 크기가 커서 안됨
		System.out.println(str4);

		// arraycopy랑 비슷한데 어디서 부터 시작하는지가 다름
		// 깊은 copy
		String str5 = new String(by, 0, 2);// src, 시작위치, length
		System.out.println(str5);

		System.out.println("");
		System.out.println("");

		str2 = "안녕하세요.";
		System.out.println(str2.length());

		char ch2 = str2.charAt(3);
		System.out.println(ch2);

		for (int i = 0; i < str2.length(); i++) {
			System.out.print(str2.charAt(i));
		}
		System.out.println("");
		System.out.println("");

		str2 = "가나다라마바사";
		System.out.println(str2.length());
		System.out.print(str2.charAt(6));
		System.out.println(str2.charAt(str2.length() - 1));

		String str6 = "vehnlgweohiiwaeejkweahgijgvbajkehfkagwghawjklghawejk";
		// 여기서 e가 몇개있는지 객수를 출력해주세요
		int j = 0;
		System.err.println(str6.length());
		for (int i = 0; i < str6.length(); i++) {
			if (str6.charAt(i) == 'e') {
				j++;
			}
		}
		System.out.println(j);

		String str7 = str2.concat("님"); // "가나다라마바사" 님
		System.out.println(str7);
		
		
		System.out.println(str2.contains("님"));
		System.out.println(str7.contains("님"));
		System.out.println(str7.contains("가나다"));
		
		/*
		//indexOf
		System.out.println(str7.indexOf("타"));//없으면 -1로 나옴
		System.out.println(str7.indexOf("나")); //1
		System.out.println(str7.indexOf("나다")); //1
		
		//replaceAll
		String apple = "apple";
		apple = apple.replace("ap", "");
		System.out.println(apple);

		
		//substring
		String result = str2.substring (    str7.indexOf("라")   ); //str2 ="가나다라마바사"   \\3
		System.out.println(result.length());
		System.out.println(result);
		result = str2.substring(3, 4); //시작index, 끝index
		System.out.println(result);
		
		
		//equalsIgnoreCase()
		apple = "apple";
		System.out.println(apple.equalsIgnoreCase("apple")); //대소문자 구분 x
		System.out.println(apple.equalsIgnoreCase("APPLE"));
		System.out.println(apple.equals("apple")); //대소문자 구분
		System.out.println(apple.equals("APPLE")); //대소문자 구분
	
		
		
		//getByte()
		byte[] appleByte = apple.getBytes();
		System.out.println(Arrays.toString(appleByte));
		
		
		
		
		
		*/
	}

}
