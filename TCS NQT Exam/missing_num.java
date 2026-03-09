class missing_num{
    public static void main(String[]args){
        int arr[]=new int[]{1,2,3,5};
        int totalnum = 0;
        int currentsum=0;
        int actualsum=0;

        for(int num:arr){
            totalnum+=num;
        }
        for(int i=1;i<=arr.length+1;i++){
             currentsum+=i;
        }
        actualsum=currentsum-totalnum;
        System.out.println(actualsum);
    }
}