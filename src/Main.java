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
		System.out.println("Give  me a name: ");
		String name = in.nextLine();
		System.out.println("Give me a country : ");
		String country = in.nextLine();
		System.out.println("Give me an event: ");
		String event = in.nextLine();
		System.out.println("Give me any time: ");
		int time = in.nextInt();
		System.out.println("Give me a decimal: ");
		double decNumber = in.nextDouble(); 
		System.out.println("Give me a song");
		String song = in.nextLine();
		
		
		
		
		
	
		System.out.println("One day, "+name+"  went to "+country+" for a "+event+". The concert was supposed to begin at "+time+" but Drake was "+decNumber+" minutes late. The first song he perfomed was "+song);
		

		
		
		
	}

}
