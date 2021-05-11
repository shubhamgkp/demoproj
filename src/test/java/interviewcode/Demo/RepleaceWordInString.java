package interviewcode.Demo;

import java.util.Scanner;

public class RepleaceWordInString {

	// String = "Mr. Jack is stupid person"
	// String output = "Mr. jack is ****** person"

	public static void main(String[] args) {

		System.out.println("Please enter a statement- ");
		Scanner sc = new Scanner(System.in);
		String inString = sc.nextLine();
		System.out.println(inString);
		String replaceString = inString.replaceAll("stupid", "*****").replace("fcuk", "****");
		System.out.println(replaceString);
	}
}