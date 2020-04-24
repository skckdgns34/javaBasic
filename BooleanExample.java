
public class BooleanExample{
	public static void main(String[] args){
		boolean isTrue = false;
		isTrue = true;
		
		int num1, num2;
		num1 = 5;
		num2 = 5;
		
		isTrue = num1 >= num2;
		
		if(isTrue){
			System.out.println("num1 >= num2");
		}else{
			System.out.println("num2 > num1");
		}
	}
}