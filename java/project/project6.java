public class project6 {

    public static void main(String[] args)
    {
        float res=1;        
        for(float i=2;i<=100;i++)
        {
            if(i%2==0)
            {
                res-=1/i;
            }else
            {
                res+=1/i;
            }
            
        }
        System.out.println(res);
    }
    
}
