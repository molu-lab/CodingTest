import java.util.Scanner;

public class project17 {
    /*
    회문은 앞으로 읽으나 뒤로 읽으나 차이가 없는 단어를 뜻한다. 인자로 전달되는 영단
어가 회문인지 아닌지를 판단해서 그 결과를 출력하는 기능의 메소드를 정의하고, 적절
한 main메소드를 정의해보자.

*/

    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("인자 입력 : ");
        String str=scan.next();
        test(str.toCharArray());
    }
    public static void test(char[] c)
    {
        int len=c.length;
        int maxindex=len-1;
        for(int i=0;i<len;i++)
        {
            if(c[i]!=c[(maxindex)-i])
            {
                System.out.println("회문이 아닙니다.");
                return;
            }
         

        }
        System.out.println("회문입니다.");
    }
    
}
