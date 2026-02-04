class SearchElement{
    public static void main(String[]args){
        int[] arr=new int[]{1,2,3,4};
        int x=3;
        int index=-1;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                index=i;
                break;
              
            }
        }
          System.out.println("index at"+index);
    }
}