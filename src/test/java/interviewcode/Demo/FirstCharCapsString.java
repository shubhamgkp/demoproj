package interviewcode.Demo;

public class FirstCharCapsString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "my name is shubham.";

		String[] splitStr = str.split(" ");

		StringBuilder strBuilder = new StringBuilder();

		for(String itrString:splitStr) {

			strBuilder.append(Character.toUpperCase(itrString.charAt(0))).append(itrString.substring(1)).append(" ");

		}
		System.out.println(strBuilder.toString());
		
		
	}
}