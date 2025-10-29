public class prg6 {
    public static void main(String[] args) {
        int arr[]=new int[]{2,4,3,5,6};
        int MinEle=Integer.MAX_VALUE;
        int SecondminEle=Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]<MinEle){
                SecondminEle=MinEle;
                MinEle=arr[i];

            }
            else if(arr[i] < SecondminEle && arr[i] != MinEle){
                SecondminEle=arr[i];
            }
        }
        System.out.println("Minimum element"+" "+MinEle);
        System.out.println("Minimum element"+" "+SecondminEle);
    }
    
}
