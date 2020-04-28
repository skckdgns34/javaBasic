
public class ForExample {
    public static void main(String[] args) {
        int sum = 0;
        sum = sum + 1;  //sum => 1
        sum = sum + 2;  //sum => 3
        sum = sum + 3;  //sum => 6
        sum = sum + 4;  //sum => 10
        sum = sum + 5;  //sum => 15
        
        sum = 0;     
        
        for(int i=1; i<=5; i++){
            sum = sum + i;
            System.out.println(sum + ", " + i);
        }
        System.out.println("sum : " + sum);
        
        int var1 =3;
        for(int i=1, j=1; i<=9&&j<=9; i++){
            System.out.print(i + " * " + j + " = " + (i*j)+"\t");
            if(i==9){
                j++;
                i=0;
            System.out.println();
            }
        }
    }
}