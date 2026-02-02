public class Largest_Element_Array {
    public static void main(String[] args) {
        int arr[]=new int[]{1,8,7,56,90};
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
    
}
