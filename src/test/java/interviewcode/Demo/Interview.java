package interviewcode.Demo;

public class Interview {


	//String - MyIndiaisgoodIndia 
	//String - India

	public static void main(String[] args) {

		String str = "MyIndiaisgoodIndia";
		String[] strArray = str.split("y");
		
		for(String itrStr:strArray) {
			
			System.out.println(itrStr);
		}
	}
}
