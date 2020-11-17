import java.util.Scanner;

public class project16 {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int[] num=new int[10];
        int temp;
        int a=0,b=9;
        for(int i=0;i<10;i++)
        {
            System.out.print(i+"번째 정수 입력 : ");
            temp=scan.nextInt();
            if(temp%2==0)
            {
                num[b]=temp;
                b--;
                
            }
            else{
                num[a]=temp;
                a++;
            }
        }
        for(int i=0;i<10;i++)
        {
            System.out.print(num[i]+" ");
        }
    }
}
