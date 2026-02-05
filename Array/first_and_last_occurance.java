public class first_and_last_occurance {
    public int[] firstlastoccurance(int arr[], int x){
        int first=-1;
        int last=-1;
for(int i=0;i<arr.length;i++){
    if(arr[i]==x){
        if(first== -1){
            first=i;
        }
        last=i;
    }

}
 return new int[]{first, last};

    }
    
    public static void main(String[]args){
        int arr[]=new int[]{1,3,3,4};
        int x=3;
        first_and_last_occurance fl=new first_and_last_occurance();
        int[] result=fl.firstlastoccurance(arr, x);
        System.out.println("First and last occurrence indices: [" + result[0] + ", " + result[1] + "]");
    }
    
}
