package Collections;
/**array of integer elements and return the second smallest element in the array
 */
import java.util.*;
public class SecondSmallest {
	public static void main(String[] args) {
		Integer Array[]= {25,47,21,66,19,99};
		int secondSmallestElement=getSecondSmallest(Array);
		System.out.println("Second Smallest element is : "+secondSmallestElement);
	}

	private static int getSecondSmallest(Integer[] Array) {
		/**
		 * insert array element in a list
		 */
		List<Integer> element=Arrays.asList(Array);
		Collections.sort(element);
		/**
		 * display sorting elements and gives the second element
		 */
		System.out.println("Elements after sorting: "+element);
		Integer secondSmallest=element.get(1);
		return secondSmallest;
	}

}
