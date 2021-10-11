//数独，是否为
//请你判断一个 9x9 的数独是否有效。只需要 根据以下规则 ，验证已经填入的数字是否有效即可。
//
//        数字 1-9 在每一行只能出现一次。
//        数字 1-9 在每一列只能出现一次。
//        数字 1-9 在每一个以粗实线分隔的 3x3 宫内只能出现一次。（请参考示例图）
//        数独部分空格内已填入了数字，空白格用 '.' 表示。
//
//        注意：
//
//        一个有效的数独（部分已被填充）不一定是可解的。
//        只需要根据以上规则，验证已经填入的数字是否有效即可。

public class LC9 {
    public static boolean vavid(char[][] a){
        int[][] row=new int[9][9];
        int[][] col=new int[9][9];
        int[][] cell=new int[9][9];
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(a[i][j]=='.'){
                    continue;
                }
                int data_num_index=a[i][j]-'0'-1;
                System.out.println("data_num_index="+data_num_index);

                row[i][data_num_index]+=1;
                col[data_num_index][j]+=1;
                int myindex=i/3*3+j/3;
                cell[myindex][data_num_index]+=1;

                System.out.println("cell"+" "+myindex+" "+data_num_index+"="+cell[i/3*3+j/3][data_num_index]);
//                System.out.println("cell=");
//                System.out.println(i/3*3+j/3);
//                System.out.println(data_num_index);
//                System.out.println(cell[i/3*3+j/3][data_num_index]);
                if(row[i][data_num_index]>1 ||col[data_num_index][j]>1||cell[i/3*3+j/3][data_num_index]>1){
                    return false;
                }

            }
        }
        return true;

        
    }
    public static void main(String[] args) {
        char [][]a={{'.','.','.','.','5','.','.','1','.'},{'.','4','.','3','.','.','.','.','.'},{'.','.','.','.','.','3','.','.','1'},{'8','.','.','.','.','.','.','2','.'},{'.','.','2','.','7','.','.','.','.'},{'.','1','5','.','.','.','.','.','.'},{'.','.','.','.','.','2','.','.','.'},{'.','2','.','9','.','.','.','.','.'},{'.','.','4','.','.','.','.','.','.'}};
        boolean b=vavid(a);
        System.out.println(b);
        int l=a.length;
        System.out.println(l);



    }
}
