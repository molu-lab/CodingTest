public class project7 {
    public static void main(String[] args)
    {
        int year=1984;
        double city_H=250; 
        double increment_H=3.6;
        double city_K=180;
        double increment_K=4.2;
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
