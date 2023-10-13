package jun13;

import java.util.Scanner;

public class Example02_2 {
	public static void main(String[] args) {

		 Scanner sc = new Scanner(System.in);
		 String data = sc.nextLine()+" ";
	
		String a= "";
		int count = 1;
		for (int i = 0; i < data.length()-1; i++)
			if (data.charAt(i) == data.charAt(i+1))
				count++;
	
			else {
				a = a + data.charAt(i) + (count);
	
				// data.charAt(i) + (count)
				// data.charAt(i) + (count) + data.charAt(i) + (count)
				// data.charAt(i) + (count) + data.charAt(i) + (count) + data.charAt(i) + (count)
				count = 1;
			}
		System.out.println(a);
	}
}
