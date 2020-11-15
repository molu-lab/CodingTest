import java.util.Scanner;

public class project1 {
    public static void main(String[] arge)
    {
        
        int num1=0;
        int num2=0;

        Scanner scan = new Scanner(System.in);

        System.out.print("1번정수 입력 : ");
        num1=scan.nextInt();
        
        System.out.print("2번정수 입력 : ");
        num2=scan.nextInt();
        
        scan.close();
        
        test(num1,num2);
        
        
    }
    public static void test(int a, int b)
    {
        if(a%b==0)
        {
            System.out.println("두 수는 나누어 떨어집니다.");
        }else{
            System.out.println("두 수는 나누어 떨어지지 않습니다.");
        }
    } 
}