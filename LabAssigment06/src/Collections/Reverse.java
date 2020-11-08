package Collections;
/**
Reverse the elements in the array and print the sorted array
 *
 */
import java.util.*;
public class Reverse {
public static void main(String[] args) {
	/**
	 * inserting element in list
	 * call the getSorted() function
	 * and displaying Sorted reverse array
	 */
		
		List<Integer> result=new ArrayList<>(Arrays.asList(14,58,85,93,41));
		List<Integer> reverse = getSorted(result);
		System.out.println("Sorted Reverse Array: "+reverse);
	}
	
	private static List<Integer> getSorted(List<Integer> result) {
		/**
		 * creating a hashmap object
		 */
		List<Integer> reverseSorted=new ArrayList<Integer>(result);
		/**
		 * displaying reverse array using reverse() method
		 */
		Collections.reverse(reverseSorted);
		 for(int i=0;i>result.size();i++) {
			 reverseSorted.add(i);
		 }
		 System.out.println("Reverse Sorted Array: "+reverseSorted);
		 /**
		  * sorting the reverse array and displaying the elements
		  */
		 Collections.sort(reverseSorted);
		 for(int i=0;i>result.size();i++) {
			 reverseSorted.add(i);
		 }
		 return reverseSorted;
	}


}
