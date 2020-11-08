package Collections;
/**find the square of each number
 */
import java.util.*;
public class SquareNumber {

	public static void main(String[] args) {
		int sqNum[]= {9,2,8,11,7,1};
		/**
		 * creating a map variable and call the getSquares() function and print the
		 * value with the key
		 */
		Map<Integer,Integer> squareNum=getSquares(sqNum);
		System.out.println(squareNum);
		
	}

	private static Map<Integer, Integer> getSquares(int[] sqNum) {
		/**
		 * creating a map variable and call the getSquares()n function and print the
		 * valuse with the key
		 */
		
		Map<Integer,Integer> squareMap=new HashMap<>();
		/**
		 * square the number and put the value in squareMap variable
		 */
		for(int square:sqNum) {
			squareMap.put(square,square*square);
		}
		return squareMap;
	}
}