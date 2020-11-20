public class project18 {
    /**
     * 정수형 배열에 저장된 요소들을 내림차순으로 정렬하는 메소드를 정의하고 이 메소드를
이용하여 정렬한 후 결과를 출력하는 프로그램을 작성해보자. public void BubbleSort(int[] array);

     */
    public static void main(String[] args)
    {
        int[] num={1,2,3,4,5,6,7,8,9,10};
        int temp;
        for(int i=0;i<10;i++)
        {
            for(int j=i+1;j<10;j++)
            {
                if(num[i]<num[j])
                {
                    temp=num[i];
                    num[i]=num[j];
                    num[j]=temp;
                }
            }    
        }
        for(int i=0;i<10;i++)
        {
            System.out.print(num[i]+" ");
        }
        
    }
}
