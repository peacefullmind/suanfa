import java.util.Stack;

public class calculate {
    static int calculate(String s){

        Stack stk=new Stack();
//        // 定义一个栈
//        Stack<Integer> stk;


        int num=0;
        char sign='+';
        for(int i=0;i<s.length();i++){
            char c= s.charAt(i);
            if(Character.isDigit(c)){
                num=num*10+(c-'0');
            }
            if(!Character.isDigit(c)|| i==s.length()-1){
                switch (sign){
                    case '+':
                        stk.push(num);
                        break;
                    case '-':
                        stk.push(-num);
                        break;
                }
                sign=c;
                num=0;
            }

        }

        int res=0;
        while (!stk.empty()){
            res+= (int) stk.pop();
        }

        return res;
    }
    public static void main(String[] args) {
        String s="52-32";
        int out=calculate(s);
        System.out.println(out);
    }
}
