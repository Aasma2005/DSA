class prefixSumExample{
    public static void main(String[]args){

        int arr[]=new int[]{10,20,10,5,15};
        int prefixSum[]=new int[arr.length];

        prefixSum[0] = arr[0];
        System.out.print(prefixSum[0] + " ");

        for(int i=1;i<arr.length;i++){
           
            prefixSum[i]=prefixSum[i-1]+arr[i];
            System.out.print(prefixSum[i]+ " ");
        }
        
    }
}