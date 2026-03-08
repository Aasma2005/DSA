class Solution {
    public void reverseArray(int arr[]) {
        
        int i=0;
        int j=arr.length-1;
        int temp=0;
        while(i<j){
             temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
            
        }
      
    }
    public static void main(String[]args){
        int arr[]=new int[]{1, 4, 3, 2, 6, 5};
        Solution sc=new Solution();
        sc.reverseArray(arr);
        
    }
    }
