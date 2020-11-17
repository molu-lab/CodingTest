import java.util.Scanner;

public class project9 {
    public static void main(String[] args)
    {
        int pre_sum,post_sum;
        for(int i=1;i<=500;i++)
        {
            pre_sum=0;
            for(int j=1;j<=i-1;j++)
            {
                pre_sum+=j;
            }
            post_sum=i+i+1+2;
            
            if(pre_sum==post_sum)
            {
                System.out.println("pre:"+pre_sum);
                System.out.println("post:"+post_sum);
                System.out.println("결과 값 : "+i);
            }
        }
    }
}
