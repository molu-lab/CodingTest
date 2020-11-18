import java.util.Scanner;

public class project20 {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("하나의 수를 입력 : ");
        int num=scan.nextInt();
        int [][] rect=new int[num][num];
        System.out.println(num+"x"+num+"공간 생성");
        rect=inputdata(rect,num);
        rect_print(rect);
    }
    public static int[][] inputdata(int[][] rect, int len)
    {
        int current_x=0;
        int current_y=0;
        int max_x=len;
        int max_y=len;
        int min_x=0;
        int min_y=0;
        int d=0;//0,1,2,3
        int count=1;
        while(count<=len*len)
        {
            switch(d)
            {
                case 0://오
                {
                   if(current_x<max_x)
                   {
                       rect[current_y][current_x]=count;
                       current_x++;
                       count++;
                   }else
                   {
                       current_x-=1;
                       current_y+=1;
                       min_y+=1;
                       d=1;
                   } 
                   break;
                   
                }
                    
                case 1://밑
                {
                    if(current_y<max_y)
                    {
                        rect[current_y][current_x]=count;
                        current_y++;
                        count++;
                    }else
                    {
                        current_y-=1;
                        current_x-=1;
                        max_x-=1;
                        d=2;
                    }
                    break;
                }
                case 2:///왼
                {
                    if(current_x>=min_x)
                    {
                        rect[current_y][current_x]=count;
                        current_x--;
                        count++;
                    }else
                    {
                        current_x+=1;
                        current_y-=1;
                        max_y-=1;
                        d=3;
                    }
                    break;
                }
                case 3://위
                {
                    if(current_y>=min_y)
                    {
                        rect[current_y][current_x]=count;
                        current_y--;
                        count++;
                    }else
                    {
                        current_y+=1;
                        current_x+=1;
                        min_x+=1;
                        d=0;
                    }
                    break;
                }
                    

            }
            rect_print(rect);
            
            
        }
            
        return rect;
        
    }
    public static void rect_print(int[][]rect)
    {
        for(int i=0;i<rect.length;i++)
        {
            for(int j=0;j<rect[i].length;j++)
            {
                System.out.printf("%4d",rect[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
}
