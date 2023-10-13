package jun13;

public class Example01 {
	/*
	 * 1부터 10,000까지 8이라는 숫자가 총 몇번 나오는가?
	 * 
	 * 8이 포함되어 있는 숫자의 갯수를 카운팅 하는 것이 아니라 8이라는 숫자를 모두 카운팅 해야 한다. (※ 예를들어 8808은 3,
	 * 8888은 4로 카운팅 해야 함)
	 */

	public static void main(String[] args) {

		// System.out.println(1*9+2*90+3*900+4*9000+4);

		char[] ei = new char[38898];

		int num = 0;
		for (int i = 1; i <= 10000; i++) {
			String s = Integer.toString(i);
			System.out.print(s.length());
			for (int j = 0; j < s.length(); j++) {
				
				if (s.charAt(j) == '8') {
					num++;
				}
			}
		}
		System.out.println("");System.out.println("");
		System.out.println(num);

	}
}
