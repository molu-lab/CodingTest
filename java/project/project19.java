public class project19 {
    /**
     * 길이가 4x4인 int형 2차원 배열을 선언하고, 모든 요소를 아래 그림의 왼쪽과 같이 초기
화 한 후, 이를 오른쪽으로 90도씩 회전시킨 결과를 출력하는 프로그램을 작성해보자. 
     */
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
