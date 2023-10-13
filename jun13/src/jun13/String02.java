package jun13;

public class String02 {
	public static void main(String[] args) {

		// 이메일 판별하기
		// poseidon@kakao.com
		// contain
		// email.contains("@");

		String email = "poseidon@kakao.com";
		System.out.println(email.indexOf('@')); // -1 : 없다
		if (email.indexOf('@') == -1) {
			System.out.println("email 형식이 아닙니다");
		} else {
			// System.out.println("올바른 email입니다");
			String id = email.substring(0, email.indexOf('@'));
			String server = email.substring(email.indexOf('@') + 1, email.length());
			System.out.println("아이디 : " + id);
			System.out.println("서버 : " + server);

			// endWith()
			/*
			 * System.out.println(email.endsWith(".com"));
			 * System.out.println(email.endsWith(".net")); //.com //.net
			 * 
			 * .org
			 */
			// .co.kr
			if (email.endsWith(".com") || email.endsWith(".net")) {
				System.out.println("올바른 서버 입니다");
			}
			
			String msg = String.join("",id, "님 반갑습니다");// 연결자, 값1, 값2
			System.out.println(msg);

		}

	}
}
