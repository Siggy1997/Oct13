package jun12;

public class Test03 {
	public static void main(String[] args) {

		for (int i = 1, j = 0; i <= 5; i++) {
	         j += i;// j = j+i  //1>3>6>10>15
	         System.out.print(i);
	         if(i == 5) {
	            System.out.print(" = ");
	            System.out.print(j);
	         } else {
	            System.out.print(" + ");
	         }
	      }
	}
}
