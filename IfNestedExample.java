
public class IfNestedExample {
    public static void main(String[] args) {
        int score = 90;
        
        int num = (int)(Math.random()*6) + 1; 
        // Math.random() -> 0~1 사이의 임의의 수를 만들어 줌
        
        if(num==1){
            System.out.println("번호 1번이 나왔습니다.");
        } else if(num==2){
            System.out.println("번호 2번이 나왔습니다.");
        } else if(num==3){
            System.out.println("번호 3번이 나왔습니다.");
        } else if(num==4){
            System.out.println("번호 4번이 나왔습니다.");
        } else if(num==5){
            System.out.println("번호 5번이 나왔습니다.");
        } else{
            System.out.println("번호 6번이 나왔습니다.");
        }
        
        System.out.println("end of program.");
    }
}
