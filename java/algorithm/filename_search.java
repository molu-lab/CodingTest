import java.util.ArrayList;
import java.util.List;

public class filename_search {
    public static void main(String[] args)
    {
    }


    public static List<String> substring_names(String[] files)
    {
        List<String> list=new ArrayList<String>();
        for(String str: files)
        {
            str=str.replaceAll(" ","");
            str=str.replaceAll("-","");

            str=str.split("\\.")[0];
            System.out.println(str);
            list.add(str);
        }

        return list;
    }
    public static int[] getNumber(String str,int s)
    {
        int[] pointer=new int[2];
        pointer[0]=s;
        for(int i=s;i<str.length();i++)
        {
            if(!Character.isDigit(str.charAt(i)))
            {
                pointer[1]=i;
                break;
            }
        }
        return pointer;
    }
}
