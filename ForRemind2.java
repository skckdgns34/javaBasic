
public class ForRemind2 {
    public static void main(String[] args) {
        int sum = 1;
        for(int i=1; i<=10; i++){
            if((i % 2) == 0 && (i % 3) == 0){
                System.out.println(i + "2,3의 공통 배수");
            } else if((i % 2) == 0 || (i % 3) == 0){
                System.out.println(i + "2또는 3의 배수");
                continue;
            }    
        }
    System.out.println("end of program");
    }
}