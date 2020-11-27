import java.util.ArrayList;
import java.util.List;

public class fibonacci_for {

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

}
