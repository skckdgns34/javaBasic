import java.util.Scanner;

public class Example07 {
    public static void main(String[] args) {
        boolean run = true;
        int balance = 0;
        Scanner scn = new Scanner(System.in);
        while(run){
            System.out.println("---------------------------");
            System.out.println("1.예금 2.출금 3.잔고 4.종료");
            System.out.println("---------------------------");
            int menu = scn.nextInt();
            if(menu==1){
                System.out.println("예금 선택");
                balance += scn.nextInt();
            } else if(menu==2){
                System.out.println("출금 선택");
                balance -= scn.nextInt();
            } else if(menu==3){
                System.out.println("잔고 선택");
                System.out.println("현재 잔고 : " + balance + " 입니다");
            } else if(menu==4){
                System.out.println("종료 선택");
                run = false;
            } /*else{
                System.out.println("잘못 입력");
            }*/
            
        } //end of while
        System.out.println("end of program");
    } //end of main
} //end of class