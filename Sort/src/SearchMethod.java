public class SearchMethod {

    //二分搜索
    //●从数组的中间元素开始，如果中间元素正好是x，而查找成功
    //●否则我们利用中间位 置将数组分为前、后两个子数组0如果x小于中间位置的元素，则进一 步查找前一个子数组否则进一步查找后-个子数组，
    //●重复以上步骤，直到找到满足条件的元素，或直到子数组不存在为止，代表查找不成功。
    public int binarySearch(int array[],int target){
        int left=0;
        int right=array.length-1;
        while(left<=right){
            int mid =left+(right-left)/2;
            if(array[mid]==target){
                return mid;
            }
            else if(target<array[mid]){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return -1;
    }
    //时间复杂度：对数级别
    //前提是排好序的数组
}
