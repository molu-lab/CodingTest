import java.util.Scanner;

public class project15 {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("10진수 한 개 입력 : ");
        int num=scan.nextInt();

        String res="";
        
        while(true)
        {
            res=(num%2)+res;
            num=num/2;

            if(num==1)
            {
                res=1+res;
                break;
            }else if(num<1)
            {
                break;
            }

            
        }
        System.out.println(res);


    }
    
}
