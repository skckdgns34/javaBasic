
public class BitReverseOperatorExample{
	
	public static void main(String[] args){
		int num1 = 10;
		int num2 = ~num1;  //   1' complement
		int num3 = num2 + 1; // 2' complement
		
		//java conflict
		
		String returnValue = toBinaryString(num1);
		System.out.println(returnValue);
		
		 returnValue = toBinaryString(num2);
		System.out.println(returnValue);
		
		 returnValue = toBinaryString(num3);
		System.out.println(returnValue);
	}
	
	public static String toBinaryString(int val){
		String str = Integer.toBinaryString(val);
		while(str.length() < 32) {
			str = "0" + str;
		}
		return str;
		
	}
	
}