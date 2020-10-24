/**
Author:Supriya 
Date:23/10/2020
Desc:Create a method which accepts an array of integer elements and return the second smallest element in the array
*/
import java.util.*;
public class SecondSmallest {
	public static void getSecondSmallest(int []arr) {
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(arr[1]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
				int arr[]=new int[5];
				for(int i=0;i<arr.length;i++) {
					arr[i]=sc.nextInt();
				}
				getSecondSmallest(arr);
		

	}

}
