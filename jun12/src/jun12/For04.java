package jun12;

public class For04 {
	public static void main(String[] args) {
		A: for (int i = 0; i < 10; i++) {
			B: for (int j = 0; j < 10; j++) {
				for (int j2 = 0; j2 < 10; j2++) {
					if(j * 10 +j2 ==11) {
						break;
					}else if(j==3) {
						continue;
					}else if (i==2) {
						continue A;
					}
					System.out.println(i+""+ j + j2);
					
				}
			}
		}

	}
}
