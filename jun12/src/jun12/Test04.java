package jun12;

public class Test04 {
public static void main(String[] args) {
	 int[] a = new int[8];
     int i = 0;
     int n = 10;

     while (i<=7) {
        a[i++] = n%2;//0 ,1,0,1,0000
        n /= 2; //5 ,2,1,0
     }

     for (i = 7; i >= 0; i--) {
        System.out.print(a[i]);
     }
  }
}

//00001010
//01010000
