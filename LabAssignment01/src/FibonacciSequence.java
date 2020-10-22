import java.util.*;
public class FibonacciSequence {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n=sc.nextInt();
		System.out.println(fibonacci(n));
	}
		public static int fibonacci(int n) {
			int a=0,b=1,c;
			if(n==0 || n==1)
				return n;
			for(int i=2;i<=n;i++) {
				c=a+b;
				a=b;
				b=c;
			}
			return b;
		}
}


	