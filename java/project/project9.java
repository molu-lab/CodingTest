import java.util.Scanner;

public class project9 {
    public static void main(String[] args)
    {
        /**
         *  숫자 1에서 500사이에 존재하는 numeric center를 구하는 프로그램을 작성하시
            오.(numeric center는 어떤 숫자 n에 대해 1부터 n-1까지의 pre-sum이 n+1과 n+2의 합
            (post-sum)과 같아지는 숫자 n을 말한다.
         */
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
