import java.util.Scanner;

public class project14 {
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
