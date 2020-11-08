package Collections;
/**
 * character array and count the number of times each character is present in the array.
 */
import java.util.*;
public class CountCharacter {

	public static void main(String[] args) {
		/**
		 *calls the countChars function and prints the value
		 */
		char[] characters= {'s','r','a','r','a','a','y'};
		Map<Character,Integer> characterOccurence=countChars(characters);
		System.out.println(characterOccurence);
	}	

	private static Map<Character, Integer> countChars(char[] character) {
		/**
		 * creating a hashmap object
		 */
		Map<Character,Integer> countChar=new HashMap<Character,Integer>();
		/**
		 * check the character one by one and check whether it is same or not if same then add +1 else
		 * add 1
		 */
		for(char ch:character) {
			if(countChar.containsKey(ch)) {
				countChar.put(ch,countChar.get(ch)+1);
			}
			else {
				countChar.put(ch,1);
			}
		}
		/**
		 * put all the character with the occurrence
		 */
		for(Map.Entry<Character,Integer> entry: countChar.entrySet()) {
			countChar.put(entry.getKey(),entry.getValue());
		}
		return countChar;
	}
}
