package jun12;

//반복문을 제어합니다
public class For01 {
	public static void main(String[] args) {

		// 1~10까지 출력되는 반복문

		for (int i = 1; i < 11; i++) {
			if (i == 5) {

				System.out.println(i);
				break; // 가장 가까운 반복문을 탈출합니다.
				// break 와 continue 뒤에는 코드가 올수없음

			}

		}

		for (int i = 1; i < 11; i++) {
			System.out.println(i);
			if (i == 5) {

				continue; // continue 이하 실행문을 무시하고 다시 반복

			}
			System.out.println("continue 아래 문장입니다");
		}

	}
}
