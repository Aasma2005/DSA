public class prg2 {
    public static void main(String[] args) {
        int[] arr=new int[]{1,4,5,2,7,8};
        int A=2;
        int B=5;
        boolean foundAll=true;

        for(int num=A;num<=B;num++){
            boolean found=false;
            for(int i=0;i<arr.length;i++){
                
                if(arr[i]==num){
                    found=true;
                    break;
                }
            }
            if(!found){
                foundAll=false;
                break;
            }
            }
            if(foundAll)
            System.out.println("yes");
            else
            System.out.println("no");
    }
    
}
