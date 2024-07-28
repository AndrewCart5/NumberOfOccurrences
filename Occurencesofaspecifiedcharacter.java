/****************************************
*
* Student Name: Andrew Cart
* Date Due: 11/17/2023
* Date Submitted: 11/13/2023
* Program Name: Occurences of a Specified Character
* Program Description: A method that finds the number of occurences of a specified character in a string
*
*
****************************************/


package Homework6Package;
import java.util.Scanner;
public class Occurencesofaspecifiedcharacter {

	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
		System.out.println("Please enter a string");
		String st1 = userinput.nextLine();
		System.out.println("Please enter a char");
		char a = userinput.next().charAt(0);
		System.out.println("There are " + count(st1,a)+ " instances of the character " + a + " in the string " + st1);
		

	}
	public static int count(String str, char a) {
		
		int count = 0;
		
		for(int i =0; i<str.length(); i++) {
			
			if(str.charAt(i) == a) {
				count++;
			}
			
		
		
		
		}
		return count;
	}

}
