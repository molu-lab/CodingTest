import java.util.Scanner;

public class project14 {
    /**
     * 사용자로부터 숫자 n을 입력받아, 다음 공식이 성립하는 k의 최대값을 계산하는 프로그
    램을 작성해 보자. 
    2^k<=n
     * @param args
     */
    public static void main(String[] args)
    {
        Scanner scan =new Scanner(System.in);
        System.out.print("수를 입력해 주세요 : ");
        int num=scan.nextInt();
        int k, sum;
        k=0;
        sum=1;
        
        while(sum<=num)
        {
                k++;
                sum*=2;
        }
        System.out.println("k:"+(k-1));
    }
    
}
