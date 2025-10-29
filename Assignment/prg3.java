public class prg3 {
    public static void main(String[] args) {
        int[] arr=new int[]{6,2,5,2,2,6,6};
        int k=3;
       
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                  count++;
                }
            }
            if(count!=k){
                System.out.println("UniqueNum:"+" "+arr[i]);
                break;
            }
           
            }
        }

    }
    

