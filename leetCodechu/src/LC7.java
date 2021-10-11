// 数组
//给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。
//
//        最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
//
//        你可以假设除了整数 0 之外，这个整数不会以零开头。
//示例 1：
//
//        输入：digits = [1,2,3]
//        输出：[1,2,4]
//        解释：输入数组表示数字 123。
//        示例 2：
//
//        输入：digits = [4,3,2,1]
//        输出：[4,3,2,2]
//        解释：输入数组表示数字 4321。
//        示例 3：
//
//        输入：digits = [0]
//        输出：[1]
//
//        链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/x2cv1c/



public class LC7 {

    public static int [] plusOne(int[] digits) {
        int l=digits.length;
        int[] out=new int[l];
        for (int i=0;i<l;i++){
            out[i]=digits[i];
        }
        out[l-1]=out[l-1]+1;
        for(int j=l-1;j>=0;j--){
            if(out[j]==10&j>0){
                out[j]=0;
                out[j-1]+=1;
            }
            if (out[j]==10&&j==0){
                int[] out2=new int[l+1];
                for(int z=l-1;z>=0;z--){
                    out2[z+1]=out[z];
                }
                out2[0]=1;
                out2[1]=0;
                return out2;
                

            }
        }
        return out;
    }

    public static void main(String[] args) {
        int [] in={9,9};
        int[] out=LC7.plusOne(in);

        int n=out.length;
        for (int i=0;i<n;i++){
            System.out.println(out[i]);
        }

    }



}

