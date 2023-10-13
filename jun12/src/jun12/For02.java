package jun12;

public class For02 {
	public static void main(String[] args) {

		// (2*i)가 10보다 작을 경우 출력하세요
		for (int i = 1; i < 10; i++) {
			
			System.out.printf("%d X %d = %d\n", 2, i, 2 * i);
				// System.out.println(i + " * 2"+ "=" + 2*i);
				if(2*i >= 10) {
					break;
				}
				System.out.printf("%d X %d = %d\n", 2, i, 2 * i);
			}
		}

	}

