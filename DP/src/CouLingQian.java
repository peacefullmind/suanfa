// 凑零钱
public class CouLingQian {
    public static int count = 0;

    // 输入 n，打印 n 个 tab 缩进
    public static void printIndent(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(" ");
        }
    }
    public static int  coinChange(int[] coins,int amount){

        if (amount==0){
            return 0;
        }
       else if (amount<0){
            return -1;
        }
       else {
        int res =500;
       for (int c :coins){
                int sub=coinChange(coins,amount-c);
                if (sub==-1) continue;
                res=Math.min(sub+1,res);
            }
        return res;}
    }

    public static void main(String[] args) {
        int [] coins={1,2,5};
        int res=coinChange(coins,11);
        System.out.println(res);

    }




}
