package interviewcode.Demo;

public class ChangeOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,2,3,4,5,6,7};
		//Output - 4567123
		int arrLen = arr.length;

		for(int i=3;i<=arrLen-1;i++) {

			System.out.print(arr[i]);			
		}
		for(int j=0;j<arrLen-4;j++) { 
			System.out.print(arr[j]); 
		}
	}
}
