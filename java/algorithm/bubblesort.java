public class bubblesort {
    public static void main(String[] args)
    {
        int [] num={51,20,13,24,15,26,37,48,79,101};
        sort(num);
        outdata(num);        
    }
    public static void sort(int[] data)
    {
        int temp=0;
        int len=data.length;
        for(int i=0;i<len;i++)
        {
            for(int j=0;j<len-1-i;j++)
            {
                if(data[j]<data[j+1])
                {
                    temp=data[j];
                    data[j]=data[j+1];
                    data[j+1]=temp;
                }
            }
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
