import java.util.Scanner;

public class project15 {
    /**
     * 사용자로부터 10진 정수(양수)를 하나 입력받은 다음, 이를 2진수로 변환해서 출력하는
프로그램을 작성해 보자. 
     * 
     */
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
