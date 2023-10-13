package jun13;

import java.util.Scanner;

//이상한 회사의 엘리베이터
public class Switch04 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("직급을 선택하세요");
		System.out.print("1.인턴\t2.대리\t3.과장\t4.부장\t5.사장");

		int input = sc.nextInt();

		System.out.println("당신이 올라갈 수 있는 층은");

		switch (input) {

		case 5:
			System.out.print("5층, ");
		case 4:
			System.out.print("4층, ");
		case 3:
			System.out.print("3층, ");
		case 2:
			System.out.print("2층, ");
		case 1:
			System.out.print("1층입니다");
		}
 
	}
}
