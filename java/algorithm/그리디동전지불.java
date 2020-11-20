public class 그리디동전지불 {
    
    public static void main(String[] args)
    {
        int cost=1727;
        int money=0;
        int f1=0;
        int f50=0;
        int f100=0;
        int f10=0;

        
        do{
            if((money+100)<=cost)
            {
                f100++;
                money+=100;
            }
            else if((money+50)<=cost)
            {
                f50++;
                money+=50;
            }else if((money+10)<=cost)
            {
                f10++;
                money+=10;
            }else if((money+1)<=cost)
            {
                f1++;
                money+=1;
            
            }else if(money==cost)
            {
                break;
            }
            System.out.printf("%4d %4d %4d %4d %4d \n",f1,f10,f50,f100,money);
        }while(money<cost);
        
        
        
    }
    
}
