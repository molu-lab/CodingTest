public class project10 {
    /**
     * 0. 중첩된 반복문을 이용하여 아래와 같은 형태로 구구단표를 출력하는 프로그램을 작성하
        시오.
        1단 2단 3단 1단 4단 7단
        4단 5단 6단 2단 5단 8단
        7단 8단 9단 3단 6단 9단
     */
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
