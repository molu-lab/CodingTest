import java.util.Scanner;

public class project17 {
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
