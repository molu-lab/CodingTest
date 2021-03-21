public class insertsort {
    public static void main(String[] args)
    {
        int [] num={51,20,13,24,15,26,317,48,79,101};
        sort(num);
        outdata(num);        
    }
    public static void sort(int[] data)
    {
        int temp=0;
        int len=data.length;
        for(int i=0;i<len;i++)
        {
            int loc=i-1;
            int newitem=data[i];
            while(loc>=0&&newitem<data[loc])
            {
                data[loc+1]=data[loc];
                loc--;
            }
            data[loc+1]=newitem;
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
