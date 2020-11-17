public class SortMethod {

    //插入排序 对于每个元素，我们将它与之前排好序的元素进行比较，找到对应的位置后并插入
    //1.从第二个元素（第一个要被排序的新元素）开始，从后向前扫描之前的元素序列
    //2.如果当前扫描的元素大于新元素，将扫描元素移动到下一位
    //3.重复步骤2，直到找到一个小于或者等于新元素的位置
    //4.将新元素插入到该位置
    //5.对于之后的元素重复步骤1~4
    //「时间复杂度」在此算法中就是计算比较的次数，第一个元素我们需要比较1次，第二个元素2次，对于第n个元素，我们需要和之前的元素比较n次，比较总数量也就是 1 + 2 + … + n = n(n + 1) / 2
    //≈ n^2。因为我们调换位置时采用「原地操作」(in place)，所以不需要额外空间，既空间复杂度为O(1)。
    public void insertSort(int array[]){
        //从第二个元素开始扫描
        for(int i=1;i<=array.length-1;i++){
            int cur=array[i];
            int j=i-1;
            //寻找位置和后移位操作
            while(j>=0&&array[j]>cur){
                array[j+1]=array[j];
                j--;
            }
            //插入操作
            array[j+1]=cur;

        }
    }


    //快排 选取一个目标元素，然后将目标元素放到数组中正确的位置。然后根据排好序后的元素，将数组切分为两个子数组，用相同的方法，在没有排好序的范围使用相同的操作。
    //分治递归

    //对于当前的数组，取最后一个元素当做基准数（pivot）
    //将所有比基准数小的元素排到基准数之前，比基准数大的排在基准数之后
    //当基准数被放到准确的位置之后，根据基数数的位置将元素切分为前后两个子数组
    //对子数组采用步骤1~4的递归操作，直到子数组的长度小于等于1为止
    public void quickSort(int[] array,int iStart,int iEnd){
        if(iStart>=iEnd) return ;
        int iFind=findAndPut(array,iStart,iEnd);
        quickSort(array,iStart,iFind-1);
        quickSort(array,iFind+1,iEnd);

    }
    public int findAndPut(int[] array,int iStart,int iEnd){
//更好理解的版本
        int holdNum=array[iEnd];//选择右边的，则左边的指针先走；
        int left=iStart;
        int right=iEnd;
        while(left<right){
            while(array[left]<=holdNum&&(left<right)){
                left++;
            }
            while(array[right]>=holdNum&&(left<right)){
                right--;
            }
            if(left<right){
                change(array,left,right);
            }
        }
        //跳出的结果是left==right；
        change(array,left,iEnd);
        return left;


    }
    public void change(int[] array,int i,int j){
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }


    //归并排序
    //先通过递归拆分，然后再合并两个有序数组
    //调试方法：测试样本尽可能小，方便定位问题，然后利用端点调试。
    public void mergeSort(int[] array){
        int len= array.length-1;
        mergeSort(array,0,len);
    }
    public void mergeSort(int[] array,int i,int j){

        if (j>i){
            int mid=(i+j)/2;
            mergeSort(array,i,mid);
            mergeSort(array,mid+1,j);
            merge(array,i,mid,j);
        }

    }
    public void merge(int[] array,int i, int mid,int j){
        //合并两个有序数组
        int[] temp=(int[])array.clone();
        int irun=i;
        int jrun=mid+1;
        int krun=i;
        while(irun<=mid&&jrun<=j){
            if(array[irun]<=array[jrun]){
                temp[krun]=array[irun];
                irun++;
                krun++;
            }
            else{
                temp[krun]=array[jrun];
                jrun++;
                krun++;

            }
        }
        while(irun<=mid){
            temp[krun]=array[irun];
            krun++;
            irun++;
        }
        while(jrun<=j){
            temp[krun]=array[jrun];
            krun++;
            jrun++;
        }
        for (int myi=i;myi<=j;myi++){
            array[myi]=temp[myi];
        }




    }
    

}
