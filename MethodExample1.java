
public class MethodExample1 {
    public static void main(String[] args) {
        // System.out.println("result: " + sum(2,3));
        // System.out.println("result: " + sum(2,3,4));
        // System.out.println("result: " + sum(2.5,3.5));
        // System.out.println("1~5까지 합: " + tosum(1,-5));
        // printStar(2,5);
        // printStar(2);
        // printDouble(10);
        // printDouble(5,8);
        // printString("Hello ","Choi");
        // printStar(3,"Hello");
        // printGugudan(8);
        printTriangle(5);
    }
    public static void printTriangle(int a){
        for(int i = 1; i<=a; i++){    
            for(int j = 1; j<=i ; j++){
            System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void printGugudan(int dan){
        for(int i = 1; i<=9; i++){
            System.out.println(dan + "*" + i + "=" + (dan*i));
        }
    }
    public static void printString(String str, String name) {
        System.out.println(str + name);
    }
    public static void printDouble(int a){
        System.out.println(a*2);
    }
    public static void printDouble(int a, int b){
        System.out.println("결과값은: " + a*b); 
    }
    public static int sum(int a,int b){
        return a+b;
    }
    public static int sum(int a,int b,int c){
        return a+b+c;
    }
    public static double sum(double a,double b){
        return a+b;
    }
    public static void printStar(int a, int b){
        if (a <= b) {
            for (int i = a; i <= b; i++) {
                for(int j = 1; j<=a; j++){
                    System.out.print("*");
                }
                a++;
                System.out.println();
            }
        } else {
            System.out.println("앞에꺼 더 작게");
        }
    }
    public static void printStar(int a){
        for(int i=1; i<=a; i++){
            System.out.println("*****");
        }
    }
    public static void printStar(int a, String str){
        for(int i=1; i<=a; i++){
            System.out.println(str);
        }
    }
    public static int tosum(int a,int b){
        int sum = 0;
        for(int i=a; i<=b; i++){
            sum += i;
        }
        return sum;
    }

}