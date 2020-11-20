import java.util.Scanner;

public class project3
{
    /*
      두 수를 입력 받아 사각형 그리기 
    */
    public static void print(String str)
    {
        System.out.print(str);
    }
    public static String[][] inputData(String[][] rect,int rectx, int recty){
        for(int i=0;i<recty;i++)
        {
            for(int j=0;j<rectx;j++)
            {
                if((i==0)||(i==recty-1)||(j==0)||(j==rectx-1))
                    rect[i][j]="*";
                else
                    rect[i][j]=" ";
                
            }
        }
        return rect;
    }
    public static void dataOutPrint(String[][] rect,int rectx,int recty){

        for(int i=0;i<recty;i++)
        {
            for(int j=0;j<rectx;j++)
            {
                System.out.print(rect[i][j]);
            }
            System.out.println("");
        }
    }
    public static void main(String[] args)
    {
      
        Scanner scan =new Scanner(System.in);

        print("사각형의 가로 넓이 값 :");
        int rectx=scan.nextInt();
        print("사각형의 세로 넓이 값 :");        
        int recty=scan.nextInt();

        String[][] rect=new String[recty][rectx];

        rect=inputData(rect,rectx,recty);
        dataOutPrint(rect, rectx, recty);
    }
}