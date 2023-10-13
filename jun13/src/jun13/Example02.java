package jun13;

public class Example02 {
	/*
	 * 문자열을 입력받아서, 같은 문자가 연속적으로 반복되는 경우에 그 반복 횟수를 표시하여 문자열을 압축하기.
	 * 
	 * 입력 예시: aaabbcccccca
	 * 
	 * 출력 예시: a3b2c6a1
	 */

	public static void main(String[] args) {
		
		String input = "aaabbcccccca";
		String a ="";
		int count = 1;
		for(int i = 0; i< input.length()-1; i++)
			
			if(input.charAt(i) == input.charAt(+1)) {
				count++;	
				a= a+input.charAt(i)+count;
			}
		System.out.println(a);
				
				
			
				
		
		
		
		
		
		
		
		
	}
}
