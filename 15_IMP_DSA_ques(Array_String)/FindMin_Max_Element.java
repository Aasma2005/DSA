public class FindMin_Max_Element {
    public static void main(String[] args) {
        int[] arr=new int[]{3,2,1,56,10000,167};
        int min=arr[0];
        int max=arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
            
        }
        System.out.println("min"+ " "+ min + "max"+ " "+max);
    }
    
}
