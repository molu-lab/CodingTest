import java.util.Scanner;

public class project12{
    /**
     * 두개의 정수를 입력받아 최대공약수(GCD)와 최소공배수(LCM)을 구하는 프로그램을 작
    성해보자.
     * 
     */
    public static void main(String[] args)
    {
        Scanner scan =new Scanner(System.in);
        System.out.print("1번 정수 입력 : ");
        int num1=scan.nextInt();
        System.out.print("2번 정수 입력 : ");
        int num2=scan.nextInt();
        gcd(num1,num2);
        
    }
    public static void gcd(int a, int b)
    {
        int temp;
        int num1=a;
        int num2=b;
        while(a!=0&&b!=0)
        {
            if(a>b)
            {
                a=a%b;
            }
            else
            {
                temp=a;
                a=b;
                b=temp;
            }

        }
        System.out.println("최대공약수는 : "+b);
        System.out.println("최소공배수는 : "+(num1*num2)/b);
    }
  
}