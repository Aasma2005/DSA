class RemoveDublicatee{

    public int Removedub(int[] arr){

        int n=arr.length;
        int current=arr[0];
        int dub=0;
        for(int i=1;i<n;i++){
            if(arr[i]==current){
                dub=arr[i];
            }
        }
        return dub;
        
    }
    public static void main(String[]args){
        int arr[]=new int[]{2,3,4,6,7};
        RemoveDublicatee obj=new RemoveDublicatee();
        System.out.println(obj.Removedub(arr));
    }
}