
public class ForRemind {
    public static void main(String[] args) {
        int sum = 1;
        for(int i=1; i<=10; i++){
            if(i % 2 == 0){
                sum=sum+i;
            } else{
                System.out.println(i + " 홀수임");
                continue;

            }    
            System.out.println(i + ": 짝수");
        }
    System.out.println("sum: " + sum);

    }
}