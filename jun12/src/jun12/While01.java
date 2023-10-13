package jun12;
//무한 반복문

//while, do~while
/*
 * while은 보통 무한 반복을 실행하다가 특정 조건이 되면 탈출하도록합니다
 * 많이 사용됩니다
 * 채팅이나 게임 등 무한 반복이 필요한 로직에서 활용됩니다
 */
public class While01 {
	public static void main(String[] args) {
		int num = 1;
		boolean b = 1 + 3 == 2;
		//조건식이 참이라면 무한 반복합니다
		while (num < 10) { // 조건식
			System.out.println(num + "참입니다"); // 조건식이 참일때 실행;
			num++;
		}

	}
}
