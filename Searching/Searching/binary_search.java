//For example: Consider the array 
// arr[] = {10, 50, 30, 70, 80, 20, 90, 40} and key = 30

class binary_search{
    public static void main(String[] args) {
        int arr[]=new int[]{10,50,30,70,80,20,90,40};
        int key=30;

        binary_search bs=new binary_search();
        int result=bs.search(arr,key);
        if(result==-1){
            System.out.println("element not found");
        }
        else{
            System.out.println("element found at index"+" "+result);
        }
    }
    int search(int arr[], int key){


        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    
}