import java.util.*;
class Search_Element{

    public int BinarySearch(int[] arr, int searchEle,int start, int end){

        if(start>end){
            return -1;
        }
        else{
            int mid=start+end/2
            if(arr[mid]==search){
                return mid;
            }
            if(arr[mid]>search){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return BinarySearch(arr, searchEle, start, end);
    }

    public static void main(String[]args){
        int arr[]=new int[]{1,2,3,4,5,6,7,8,9};
        int searchEle=7;
        Search_Elememt sc=new Search_Element();
        int index=sc.BinarySearch(arr, searchEle, 0, arr.length-1);

        if(index==-1){
            System.out.println("element not found");
        }
        else{
            System.out.println("Element found at index"+index);
        }
    
    }
}