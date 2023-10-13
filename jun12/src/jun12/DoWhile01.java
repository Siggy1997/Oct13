package jun12;
//무한 반복문 중 do~while

//while -> 조건식 검사 후 명령문장 실행
//do~while -> 명령문장 실행 후 조건식을 검사합니다

public class DoWhile01 {
	public static void main(String[] args) {

		int num = 1;
		while (num < 0) {
			System.out.println("실행합니다");
		}

		// 거짓이어도 무조건 한번은 실행합니다
		do {
			System.out.println("실행합니다(do~while)");

			// 명령 문장
		} while (num < 0);// 조건식

		// {50,36,10,98,1}

	}
}
