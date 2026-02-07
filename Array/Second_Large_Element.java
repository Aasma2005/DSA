public class Second_Large_Element {
    public int Second_LargestElement(int[]arr) {
        int maxEle=Integer.MIN_VALUE;
        int secondMaxEle=Integer.MIN_VALUE;
        

        for(int i=0;i<arr.length;i++){
            if(arr[i]>maxEle){
                secondMaxEle=maxEle;
                maxEle=arr[i];
            }
            else if(arr[i]<maxEle && arr[i]>secondMaxEle){
                secondMaxEle=arr[i];
            }
        }
        if(secondMaxEle==Integer.MIN_VALUE){
            return -1;
        }
        return secondMaxEle;

    }
    public static void main(String[] args) {
        int arr[]=new int[]{12,43,23,67,89,90};
        Second_Large_Element sc=new Second_Large_Element();
        
        System.out.println(sc.Second_LargestElement(arr));
    }
    
}

    
