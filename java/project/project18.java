public class project18 {
    public static void main(String[] args)
    {
        int[] num={1,2,3,4,5,6,7,8,9,10};
        int temp;
        for(int i=0;i<10;i++)
        {
            for(int j=i+1;j<10;j++)
            {
                if(num[i]<num[j])
                {
                    temp=num[i];
                    num[i]=num[j];
                    num[j]=temp;
                }
            }    
        }
        for(int i=0;i<10;i++)
        {
            System.out.print(num[i]+" ");
        }
        
    }
}
