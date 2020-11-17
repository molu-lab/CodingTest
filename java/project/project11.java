import java.util.Scanner;

public class project11 {
    
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("시작 구구단 명 : ");
        int num1=scan.nextInt();
        System.out.print("끝단 구구단 명 : ");
        int num2=scan.nextInt();

        if(num1>num2)
        {
            int temp=num1;
            num1=num2;
            num2=temp;
        }
        for(int i=num1;i<=num2;i++)
        {
            for(int j=1;j<=9;j++)
            {
                System.out.println(i+"x"+j+"="+(i*j));
            }
            System.out.println();
        }

    }
}
