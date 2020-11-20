public class selectsort {
    public static void main(String[] args)
    {
        int [] num={51,20,13,24,15,26,37,48,79,101};
        sort(num);
        outdata(num);        
    }
   public static void  sort(int[] num)
   {
        int temp;
        int len=num.length;
        for(int i=0;i<=len-1;i++)
        {
            int index=0;
            for(int j=1;j<=len-1-i;j++)
            {
                if(num[index]<num[j])
                {
                    index=j;
                }
            }
            
            temp=num[len-1-i];
            num[len-1-i]=num[index];
            num[index]=temp;            
        }
        
   }
    public static void outdata(int[] num)
    {
        for (int i=0;i<10;i++)
        {
            System.out.printf("%4d",num[i]);
        }
    }

}
