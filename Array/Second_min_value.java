import java.util.Arrays;

public class Second_min_value {
    public static void main(String[] args) {
        
        int arr[]=new int[]{1,1,1,1,1}; 
        int n=arr.length;
        Arrays.sort(arr);

        for(int i=n-2;i>=0;i--){
            if(arr[i] !=arr[n-1]){
                System.out.println("2nd max"+ arr[i]);
                break;
            }
            else{
                System.out.println("-1");
                break;
            }
        }


    //     int minEle=Integer.MAX_VALUE;
    //     int secondMinEle=Integer.MAX_VALUE;

    //     for(int i=0;i<arr.length;i++){
    //     if(arr[i]<minEle){
    //         secondMinEle=minEle;
    //         minEle=arr[i];
    //     }
    //     else if(arr[i]>minEle && arr[i]<secondMinEle){
    //         secondMinEle=arr[i];
    //     }
    //     }
    //     if(secondMinEle==Integer.MAX_VALUE){
    //          System.out.println("Second minimum does not exist ");
    //     } else {
    //         System.out.println("Second minimum = " + secondMinEle);
    // }
    
}
}
