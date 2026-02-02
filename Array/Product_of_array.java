public class Product_of_array {
    public static void main(String[] args) {
        
        int arr[]=new int[]{1,2,3,4};
        long product=1;
    for(int i=0;i<arr.length;i++){
        product*=arr[i];
    }    
    System.out.println(product);
}
    
}
