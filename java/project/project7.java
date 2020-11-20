public class project7 {
    public static void main(String[] args)
    {
        /**
         * 1984년 H시의 인구는 250만명, 연 증가율은 3.6%이고, K시의 인구는 180만명이며 연 증
        가율은 4.2%일 때, K시의 인구가 H시의 인구보다 많아질 때는 어느 해 인가를 구하는
        프로그램을 작성하시오.
         */
        int year=1984;
        double city_H=250; 
        
        double city_K=180;
        
        int currentyear=1984;
        while(true)
        {
            currentyear++;
            city_H+=city_H*0.036;
            city_K+=city_K*0.042;
            if(city_H<city_K)break;
        }
        System.out.println(currentyear);
    }
}
