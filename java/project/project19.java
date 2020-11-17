public class project19 {
    public static void main(String[] args){
        int[][] rect={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        rect_1nd(rect);
        rect_2nd(rect);
        rect_3nd(rect);
        rect_4nd(rect);

    }
    public static void rect_2nd(int[][] rect)
    {
        for(int i=0;i<4;i++)
        {
            for(int j=3;j>=0;j--)
            {
                System.out.printf("%4d",rect[j][i]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void rect_3nd(int[][]rect)
    {
        for(int i=3;i>=0;i--)
        {
            for(int j=3;j>=0;j--)
            {
                System.out.printf("%4d",rect[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void rect_4nd(int[][]rect)
    {
        for(int i=3;i>=0;i--)
        {
            for(int j=0;j<4;j++)
            {
                System.out.printf("%4d",rect[j][i]);
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void rect_1nd(int[][] rect)
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
