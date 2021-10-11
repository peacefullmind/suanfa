//给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
//
//        示例:
//
//        输入: [0,1,0,3,12]
//        输出: [1,3,12,0,0]
//        说明:
//
//        必须在原数组上操作，不能拷贝额外的数组。
//        尽量减少操作次数。
//        链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/x2ba4i/

public class LC8 {
    public static void moveZeroes(int[] nums) {
        int len=nums.length;
        //头指针
        int i=0;
        //尾指针
        int j=len-1;
       while (i<j){
           while (nums[j]==0&&j>0){
               j-=1;
           }
           if(j==0){
               return;
           }
           if(nums[i]==0){
               int z=i;
               while (z<j){
                   nums[z]=nums[z+1];
                   z++;
               }
               nums[z]=0;

           }
           if(nums[i]!=0){
               i++;
           }


       }



    }


    public static void main(String[] args) {
        int[] out={0,0,1};
        moveZeroes(out);

        int n=out.length;
        for (int i=0;i<n;i++){
            System.out.println(out[i]);
        }

    }

}
