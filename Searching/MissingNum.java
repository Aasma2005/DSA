public class MissingNum {
    public static void main(String[]args){
        int arr[]=new int[]{1,5,4,3};

        for(int i=0;i<arr.length;i++){
            if(arr[i]!=i+1){
                System.out.println(i+1);
                break;
            }
        }
    }
}
