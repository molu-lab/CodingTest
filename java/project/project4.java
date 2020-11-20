public class project4 {
    public static void main(String[] args)
    {

       /**
        * 1~50 까지의수중 소수를 찾기
        */


        int i,j;
        System.out.println("1~50까지의 소수들");
        for(i=2;i<=50;i++)
        {
            for(j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    break;
                }
            }
            if(i==j)System.out.print(i+" ");
        }
    }
}
