
public class RemindExample{  //클래스명은 첫글자 대문자로 무조건
	public static void main(String[] args){
		byte b1, b2; //변수명은 첨에 대문자x, 첫글자는 (소문자영어,$,_)만 가능
		b1 = 50;
		b2 = 70;
		int result = b1 + b2;
		System.out.println("result : " + result);
		
		int n1 = 0;
		n1 = b1; //자동 형변환
		b1 = (byte) n1; //강제 형변환(명시적 형변환)
		System.out.println("b1: " + b1 + ", n1 : " + n1);

	}
}