public class project10 {
    public static void main(String[] args){
       
        gugudan_type2();
    }
    public static void gugudan_type1(){
        for(int j=1;j<=9;j+=3)
        {
            for(int n=1;n<=9;n++)
            {
                for(int i=0;i<3;i++)
                {
                    System.out.print("   "+(j+i)+"x"+n+"="+(j+i)*n+"    ");
                }
                System.out.println();
            }
            System.out.println();

           
        }
    }
    public static void gugudan_type2(){
        for(int i=1;i<=3;i++)
        {
            for(int n=1;n<=9;n++)
            {

                for(int j=0;j<=6;j+=3)
                {
                    System.out.print("   "+(i+j)+"x"+n+"="+(i+j)*n+"   ");
                }
                System.out.println();
            }
            
            System.out.println();
        }
    }
}
