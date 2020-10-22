import java.util.*;
public class Power {
	public static boolean checkNumber(int n) {
		if(n%2!=0) {
			return false;
		}
		else
			return true;
	}

	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
	 System.out.println(checkNumber(n));
	}
}