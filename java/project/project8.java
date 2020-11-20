import java.util.Scanner;

public class project8 {
    public static void main(String[] args)
    {
        /**
         * 윤년 계산
         */
        Scanner scan=new Scanner(System.in);
        System.out.print("태어난 연도를 입력해 주세요 : ");
        int year=scan.nextInt();
        if(((year%4==0)||(year%400==0))&&(year%100!=0))
        {
            System.out.println("윤년입니다.");
        }
        else{
            System.out.println("윤년이 아닙니다.");
        }
    }
}
