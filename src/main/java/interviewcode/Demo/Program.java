package interviewcode.Demo;

public class Program {

	public static void main(String[] args) {
		
		String str = "testing@,$123";
		
		char[] ch = str.toCharArray();
		
		for(char chItr:ch) {
			
			if(!(Character.isAlphabetic(chItr) || Character.isDigit(chItr))) {
				
				System.out.println(chItr);				
			}			
		}		
	}
}
