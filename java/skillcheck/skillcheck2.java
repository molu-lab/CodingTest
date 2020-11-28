import java.util.ArrayList;
import java.util.List;

public class skillcheck2 {
/*





*/


    public static void main(String[] args)
    {
        int n=10000;
        List<Integer> list=fib(n);
        for(int x:list)
        {
            System.out.println(x);
        }
        System.out.println("result: "+list.get(n));

    }
    //%1234567
    public static List<Integer> fib(int n)
    {
        List<Integer> list =new ArrayList<Integer>();
        for(int i=0;i<=n;i++)
        {
            if(i==0){
                list.add(0);
            }else if(i==2||i==1)
            {
                list.add(1);
            }else{
                list.add((list.get(i-1)+list.get(i-2))%1234567);

            }
        }
        return list;
    }

    //롱 타입 fib
    public List<Long> fib_long(int n)
    {
        List<Long> list =new ArrayList<Long>();
        for(int i=0;i<=n;i++)
        {
            if(i==0){
                list.add(new Long(0));
            }else if(i==2||i==1)
            {
                list.add(new Long(1));
            }else{
                list.add(new Long(list.get(i-1)+list.get(i-2)));

            }
        }
        return list;
    }


}
