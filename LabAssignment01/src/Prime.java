import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,count; 
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number upto which you want the prime numbers:");
		n=sc.nextInt();
		for(j = 1; j <= n; j++)
		{
			count = 0;
		    for (i = 2; i <= j/2; i++)
		    {
		    	if(j % i == 0)
		    	{
		    		count++;
		    		break;
		    	}
		    }
		    if(count == 0 && j != 1 )
		    {
		    	System.out.print(j + " ");
		    }  
		}
	}
}