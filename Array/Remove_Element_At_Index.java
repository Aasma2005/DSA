public class Remove_Element_At_Index {
    public static void main(String[]args){
        int arr[]=new int[]{1,2,3,4,5};
        int index=2;

        for(int i=0;i<arr.length;i++){
            if(i==index){
               continue;
            }
            System.out.print(arr[i]+ " ");
        }
    }
    
}
