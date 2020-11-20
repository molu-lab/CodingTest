import java.util.Scanner;

public class project16 {
    /**
     * 길이가 10인 배열을 선언하고 총 10개의 정수를 입력받는다. 단, 입력받은 숫자가 홀수
이면 앞에서부터 채워나가고, 짝수이면 뒤에서부터 채워나가는 형식을 취하기로 한다. 예
를 들어 1,2,3,4,5,6,7,8,9,10을 입력했다면, 배열에는 1,3,5,7,9,10,8,6,4,2의 순으로 저장된다. 프로그램을 작성해보자
     * 
     */
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
