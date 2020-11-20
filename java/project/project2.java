import java.util.Scanner;

public class project2{
    /*
        임의의 값들을 입력받아 최댓값을 출력한다.
    */
    
    public static void main(String[] args)
    {
      
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
