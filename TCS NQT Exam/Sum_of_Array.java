class Sum_of_Array{
    public int SumArray(int[] arr){
        int sum=0;
        for(int num:arr){
            sum+=num;
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,3,4,5};
        Sum_of_Array obj=new Sum_of_Array();
        System.out.println(obj.SumArray(arr));
    }
}