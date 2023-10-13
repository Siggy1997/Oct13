package jun13;

import java.util.Arrays;


//클래스 선언
//클래스는 대문자로 시작

class Apple{
	//필드 = 변수 = 인스턴스 변수 = 초기화 하지 않아도 쓸 수 있습니다.
	String color;
	int age;
	
	//생성자 =  인스턴스를 발생하기 위한 코드 = 메소드
	
	
	//메소드
	//(메소드 안에서만) 지역변수는 초기화 해야합니다. = 선언 + 값대입 
	public void info() {
		System.out.println("색상 : " + color);
		System.out.println("나이 : " + age);
	}
}
public class String03 {
	public static void main(String[] args) {

		
		//String 클래스 속 split()메소드 입니다
		//지정된 형태를 찾아 잘라줍니다
		String tel = "010-2799-2216";
		//tel.split("자를 기호"); ---> String 배열형태로 나옵니다
		
		String[] telSplit = tel.split("-"); //-를 자를 기호로 사용
		
		System.out.println(Arrays.toString(telSplit));
		//결과 [010, 2799, 2216]
		
		String pet = "R2D2가,배고프다고,합니다"; //잘라주세요
		String[] petSplit = pet.split(",");
		System.out.println(Arrays.toString(petSplit));
		
		//우리가 스물다섯분이니 5팀 5명씩
		//6명씩 4팀 (한팀7)
		

		
		//인스턴스 만들기
	}
}
