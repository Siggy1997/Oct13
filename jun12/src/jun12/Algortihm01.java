package jun12;

public class Algortihm01 {
	public static void main(String[] args) {
		int num01 = 10;
		int num02 = 20;
		//num01에 있는 10을 num 2 로
		//num 02에 이쓴ㄴ 20을 num 01로 옮기고싶다면?
		
		int temp; //선언
		temp = num01; 
		num01 = num02;
		num02 = temp;
		
		System.out.println(num01);
		System.out.println(num02);
	}
}
