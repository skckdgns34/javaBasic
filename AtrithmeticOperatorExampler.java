
public class AtrithmeticOperatorExampler{
	public static void main(String[] agrs){
		int num1 = 5, num2 = 2;

		int result = num1/ num2;
		System.out.println("result : " + result);
		
		result = num1 % num2;
		System.out.println("result : " + result);
		
		int num3 = 123;
		if (num3 % 2 == 0) {
			System.out.println("Even");
		} else{
			System.out.println("odd");
		}
	}
}