import java.util.Scanner;

public class project11 {

    /*
    * 두 개의 정수(시작 및 끝단)를 입력받아 구구단을 출력하는 프로그램을 작성해 보자.
         단, 두 개의 숫자를 입력할 때 순서에 자유로워야 한다. 즉, 5와 3을 입력하건 3과 5를 입력
        하건 같은 결과를 출력하여야 한다.
     */
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("시작 구구단 명 : ");
        int num1=scan.nextInt();
        System.out.print("끝단 구구단 명 : ");
        int num2=scan.nextInt();

        if(num1>num2)
        {
            int temp=num1;
            num1=num2;
            num2=temp;
        }
        for(int i=num1;i<=num2;i++)
        {
            for(int j=1;j<=9;j++)
            {
                System.out.println(i+"x"+j+"="+(i*j));
            }
            System.out.println();
        }

    }
}
