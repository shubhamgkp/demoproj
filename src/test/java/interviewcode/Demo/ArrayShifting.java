package interviewcode.Demo;

public class ArrayShifting {

	static int[] temp_arr;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,2,3,4,5,6,7};
		int max=3;
		int[] output=rotateArray(arr, max);
		for(int i=0;i<output.length;i++) {
			System.out.println(output[i]);
		}
	}

	public static int[] rotateArray(int[] array,int max) {
		int len=array.length-1;
		System.out.println(len);
		int[] temp = new int[len+1];
		System.out.println(temp.length);
		int val=max-1;
		for(int i=0;i<max;i++) {
			temp[len-val]=array[i]; //6-2
			System.out.println("temp: "+temp[len-val]);
			//System.out.println(temp[len-val]);
			val--;
		}
		
		int count=0;
		for(int j=max;j<array.length;j++) { 
			temp[count]=array[j];
			count++;
		}
		return temp;
	}
}