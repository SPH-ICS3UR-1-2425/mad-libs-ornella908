import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		/*
		 * MadLibs Program
		 * Author: Ornella Gaju 
		 * Class: ICS3U
		 * Date: Sept. 16, 2024
		 * Make a program that asks for 10 inputs
		 * reads them into variables, and then prints out a story
		 * Make sure to include Strings, ints, and doubles!
		 */
		
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to Mad Libs!");
		System.out.println("Give  me a name?");
		
		String name = in.nextLine();
		int num1 = in.nextInt();
		System.out.println("Give me a place: ");
		//flush
		String place = in.nextLine();
		System.out.println("Give me an event: ");
		String event = in.nextLine();
		System.out.println("Give me any time: ");
		
		System.out.println("One day, "+name+"  went to "+place+" for "+name+" "+event+".  ");
		

		
		
		
	}

}
