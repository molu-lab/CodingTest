import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class numberCheck {
    public static void main(String[] arg)
    {
        int data=56532;
        int valUnit=getNumberUnitalue(data);
        int numUnitLength=(""+valUnit).length();
        int [] result=toNumberArray(data,numUnitLength);
        int ori_data=getNumber(result,valUnit);
        System.out.printf("%d\n",ori_data);

    }
    public static int getNumber(int[] data,int valUnit)
    {
        int sum=0;

        for(int i=data.length-1;i>=0;i--)
        {
            sum+=(data[i]*valUnit);
            valUnit/=10;
        }
        return sum;
    }
    public static int getNumberUnitalue(int data){

        int temp=1;
        while((data/temp)!=0)
        {
            temp*=10;

        }
        temp/=10;

        return temp;
    }
    public static int[] toNumberArray(int num,int numUnitLength)
    {
        int [] result=new int[numUnitLength];
        int index=0;
        while(num!=0)
        {
            result[index++]=num%10;
            num/=10;
        }

        return result;
    }






}
