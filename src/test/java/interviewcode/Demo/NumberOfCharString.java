package interviewcode.Demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class NumberOfCharString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "shubham kumar verma";

		char[] ch = str.toCharArray();
		Map<Character, Integer> mapValue = new HashMap<Character, Integer>();

		for(Character itrChar:ch) {

			if(mapValue.containsKey(itrChar)) {

				mapValue.put(itrChar, mapValue.get(itrChar)+1);
			}
			else {

				mapValue.put(itrChar, 1);
			}
		}

		System.out.println(mapValue);

		/*Set<Map.Entry<Character, Integer>> setvalue = mapValue.entrySet();
		for(Map.Entry<Character, Integer> itrMap:setvalue) {

			if(itrMap.getValue()>1) {

				System.out.println(itrMap.getKey()+" "+itrMap.getValue()); } }*/

	}
}