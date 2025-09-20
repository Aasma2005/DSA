class Equilibrium{
    public static void main(String[]args){
        int arr[]=new int[]{-7,1,5,2,-4,3,0};
        
        int flag=0;
        for(int i=0;i<arr.length;i++){
             int leftsum=0;
             int rigthsum=0;

             for(int j=0;j<i;j++){
                leftsum=leftsum+arr[j];
             }
             for(int j=i+1;j<arr.length;j++){
                rigthsum=rigthsum+arr[j];         
                }
        
        if(leftsum==rigthsum){
             flag=1;
            System.out.println(arr[i]);
            break;
        }
    }
    }
}