class Search{
    public int SearchElement(int arr[], int element, int start, int end){
        if(start>end){
            return -1;
        }
        else{
            int mid=start+end/2;
            if(arr[mid]==element){
                return mid;
            }
            if(arr[mid]>element){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return SearchElement(arr, element, start, end);
        
    }
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,3,4,5,6,7,8,9};
        int element=7;
        Search sc=new Search();
        int index=sc.SearchElement(arr, element, 0, arr.length-1);
        if(index==-1){
            System.out.println("element not found");
        }
        else{
            System.out.println("element found at index"+index);
        }

        
    }
}