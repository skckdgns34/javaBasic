
public class WhileExample {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 0; i<=5; i++){
            sum = sum + i;
        }

        int i = 1;
        sum = 0;
        while(true) {
            sum = sum + i;
          
            if (i > 5){
                break;
            }
            i++;
        }System.out.println(sum);

        
        i = 1;
        sum = 0;
        while(true){
            if(i>100){
                break;
            }
            if(i%2==1){
                sum = sum + i;
            }
            i++; 
        }System.out.println(sum);
    }
}   