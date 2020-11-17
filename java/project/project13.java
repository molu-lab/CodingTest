public class project13 {
    public static void main(String[] args)
    {
        int money=3500;
        int cost=0;
        for(int bread=1;(bread*500)<=money;bread++)
        {
            for(int cookie=1;(cookie*700)<=money;cookie++)
            {
                for(int drink=1;(drink*400)<=money;drink++)
                {
                   cost=(bread*500)+(cookie*700)+(drink*400);
                   
                   if(cost==3500)
                   {
                       String res="bread:"+bread+"  "+
                                  "cookie:"+cookie+"  "+
                                  "drink:"+drink+"  "+
                                  "cost:"+cost;
                       
                       System.out.println(res); 
                   }
                }
            }
        }
      
    }
    public static void test()
    {
        for(int i=500;i<=3500;i+=500)
        {
            for(int j=700;j<=3500;j+=700)
            {
                for(int n=400;n<=3500;n+=400)
                {
                    int result=i+j+n;
                    if(result==3500)System.out.println(
                        "bread:"+
                        i+
                        ", "+                        
                        "cookie:"+
                        j+
                        ", "+
                        "drink:"+
                        n+
                        "   합계:"+
                        result);
                }
            }
        }
    }
}
