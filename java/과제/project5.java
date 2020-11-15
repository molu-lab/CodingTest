public class project5 {
    
    public static void main(String[] args)
    {
        System.out.println("1~100까지 누적 합계산")   ;
        int sum=0;
        for(int i=1;i<=100;i++)
        {
            sum=0;
            for(int j=1;j<=i;j++)
            {
                sum+=j;
            }
            System.out.println(sum);
        }
    }
    
}
