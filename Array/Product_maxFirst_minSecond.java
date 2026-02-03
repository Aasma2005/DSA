public class Product_maxFirst_minSecond {
    public int productMax_Min(int arr1[],int arr2[]){

        int max=arr1[0];
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]>max){
                max=arr1[i];
            }
        }
        int min=arr2[0];
        for(int j=0;j<arr2.length;j++){
            if(arr2[j]<min){
                min=arr2[j];
            }
        }
        return min * max;

    }
    public static void main(String[]args){
        int arr1[]=new int[]{5,7,9,3,6,2};
        int arr2[]=new int[]{1,2,6,-1,0,9};
        int product=1;
        Product_maxFirst_minSecond pd=new Product_maxFirst_minSecond();
        int result=pd.productMax_Min(arr1, arr2);
        System.out.println(result);

    }
    
}
