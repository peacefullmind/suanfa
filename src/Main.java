import java.util.Arrays;
public class Main {

    public static void main(String[] args)
    {
        int[] caseArray= {1,2,3,4,5,6,7,8,9,10,11,12,13};
        SearchMethod searchMethod=new SearchMethod();
        int result=searchMethod.binarySearch(caseArray,11);
        System.out.println("二分查找的结果是："+result);

        int[] caseArray2= {10,11,12,13,1,2,3,4,5,6,7,8,9};
        SortMethod sortmethod=new SortMethod();
        sortmethod.insertSort(caseArray2);
        System.out.println("插入排序的结果是："+Arrays.toString(caseArray2));

        int[] caseArray3= {10,11,12,13,1,2,3,7,3,9,22,1};
        SortMethod quickmethod=new SortMethod();
        sortmethod.quickSort(caseArray3,0, caseArray3.length-1);
        System.out.println("快排的结果是："+Arrays.toString(caseArray3));

        int[] caseArray4= {10,3,7,9,6,2,12,1};
        SortMethod mergemethod=new SortMethod();
        sortmethod.mergeSort(caseArray4);
        System.out.println("归并排序的结果是："+Arrays.toString(caseArray4));



    }




}
