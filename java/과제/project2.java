import java.util.Scanner;

public class project2{

    
    public static void main(String[] args)
    {
        //3개의 수를 입력해서 이 중 최대 값을 구하는 것
        int len =3;
        int [] num=new int [len];

        Scanner scan =new Scanner(System.in);

        for(int i=0;i<len;i++)
        {
            System.out.print((i+1)+"번째 값을 입력해 주세요 : ");
            num[i]=scan.nextInt();                        
        }
        scan.close();

        System.out.println("최댓값은 "+getMax(num)+"입니다");





    }
    public static int getMax(int [] num){
        int len= num.length;
        int max=num[0];
        for(int i=0;i<len;i++)
        {
            if(max<num[i]){
                max=num[i];
            }
        }
        return max;
    }
}
