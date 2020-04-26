
public class StringToInt {

	public static void main(String[] args) {
		
		int i = 456;
		
		String iString = getStringFromInt(i);
		
		int[] iList = new int[iString.length()];
		int[] iList2 = new int[iString.length()-1];
		
		putNumbersInList(iList, iString);
		
		System.out.println(iList[0]);
		System.out.println(iList[1]);
		
		int sum = getSum(iList);
		
		System.out.println(sum);
		
		if(sum >=10) {
			String newString = getStringFromInt(sum);
			putNumbersInList(iList2, newString);
			sum = getSum(iList2);
		}
		System.out.println(sum);
		
	}//main
	
	
	
	public static void putNumbersInList(int[] iList, String iString) {
		for (int j = 0; j < iString.length(); j ++) {
			iList[j] = iString.charAt(j);
			iList[j] = Character.getNumericValue(iList[j]);
		}//for
	}//putNumbersInList
	
	public static String getStringFromInt(int i) {
		return String.valueOf(i);
	}
	
	public static int getSum(int[] iList) {
		int sum = 0;
		for (int j = 0; j < iList.length; j++) {
			sum += iList[j];
		}
		return sum;
	}
}//class
