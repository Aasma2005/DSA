
//largest and second largest element in array
class prg5{
    public static void main(String[]args){
        int arr[]=new int[]{2,4,3,5,6};
        int MaxEle=Integer.MIN_VALUE;
        int SecondMaxEle=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>MaxEle){
                SecondMaxEle=MaxEle;
                MaxEle=arr[i];
            }
            else if(arr[i]>SecondMaxEle && arr[i]!=MaxEle){

                SecondMaxEle=arr[i];

            }
        }
        System.out.println("maxele"+" "+MaxEle);
        System.out.println("Second large element"+" "+SecondMaxEle);
        
    }
}