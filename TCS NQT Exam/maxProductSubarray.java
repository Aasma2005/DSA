class maxProductSubarray{

    public int maxProduct(int[] arr){

        int maxProd=arr[0];
        for(int i=0;i<arr.length;i++){
            int mul=1;
            for(int j=i;j<arr.length;j++){
                mul*=arr[j];
                maxProd=Math.max(maxProd, mul);
            }
        }
        return maxProd;
    }
    public static void main(String[] args) {
        int arr[]=new int[]{-1,6,-3,-10,0,2};
        maxProductSubarray obj=new maxProductSubarray();
        System.out.println(obj.maxProduct(arr));
    }
}