import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class skillcheck {
/*
n개의 음이 아닌 정수가 있습니다. 이 수를 적절히 더하거나 빼서 타겟 넘버를 만들려고 합니다. 예를 들어 [1, 1, 1, 1, 1]로 숫자 3을 만들려면 다음 다섯 방법을 쓸 수 있습니다.

-1+1+1+1+1 = 3
+1-1+1+1+1 = 3
+1+1-1+1+1 = 3
+1+1+1-1+1 = 3
+1+1+1+1-1 = 3
사용할 수 있는 숫자가 담긴 배열 numbers, 타겟 넘버 target이 매개변수로 주어질 때 숫자를 적절히 더하고 빼서 타겟 넘버를 만드는 방법의 수를 return 하도록 solution 함수를 작성해주세요.

제한사항
주어지는 숫자의 개수는 2개 이상 20개 이하입니다.
각 숫자는 1 이상 50 이하인 자연수입니다.
타겟 넘버는 1 이상 1000 이하인 자연수입니다.
입출력 예
numbers	target	return
[1, 1, 1, 1, 1]	3	5
입출력 예 설명
문제에 나온 예와 같습니다.

*/
    public static void main(String[] args){
        Solution s=new Solution();
        System.out.println(s.solution(null,1));

    }

    static class Solution {
        public int solution(int[] numberss, int target) {
            int [] numbers={1,1,1,1,1};
            target=3;
            int answer=0;
            int sum=0;
            List<Integer> mlist=new ArrayList<Integer>();
            List<Integer> slist=new ArrayList<Integer>();



            //마이너스 적용 인덱스 길이
            for(int mlen=1;mlen<=numbers.length;mlen++)
            {
                //인덱스 위치
                for(int i=0;i<5;i++)
                {
                    //마이너스 인덱스의 갯수가 최대길이를 넘지않는 한에서 적용
                    if(i+mlen-1<numbers.length)
                    {
                        //마이너스는 마이너스 길이만큼의 인덱스 갯수에 적용
                        for(int m=0;m<mlen;m++)
                        {

                            System.out.printf("i: %4d m: %4d im: %4d\n",i,m,i+m);
                            if((i+m)<numbers.length){
                                sum-=numbers[i+m];
                                mlist.add(i+m);
                            }


                        }
                        //마이너스 적용외 인덱스엔 모두 가산
                        for(int p=0;p<numbers.length;p++)
                        {
                            if(!mlist.contains(p))
                            {
                                mlist.add(p);
                                sum+=numbers[p];
                            }
                        }

                        System.out.printf("mlen: %4d sum: %4d\n",mlen,sum);
                    }
                    slist.add(sum);
                    mlist.clear();
                    sum=0;
                }
                System.out.println("");
            }

            //타겟과 동일한 합산결과의 갯수
            int count=0;
            for(int x: slist)
            {
                if(target==x)
                {
                    count++;
                }
            }

            answer=count;


            return answer;
        }

    }
}
