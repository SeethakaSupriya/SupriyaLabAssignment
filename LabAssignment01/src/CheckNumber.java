import java.util.*;
public class CheckNumber {
	public static boolean NumberCheck(int number) {
		String s=Integer.toString(number);
		char ch;
		int flag=0;
		for(int i=0;i<s.length()-1;i++) {
			ch=s.charAt(i);
			if(ch>s.charAt(i+1)) {
				flag=1;
				break;
			}
		}
		if(flag==1) {
			return false;
		}
		else
			return true;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		System.out.println(NumberCheck(number));

	}

}
