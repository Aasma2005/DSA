/*give the integer array of size N, return the length of the smallest subarray
which contain both the maximum of the array  minimum of array
Arr:[1,2,3,1,3,4,6,4,6,3]
min=1, max=6*/

public class prg2 {
    public static void main(String[] args) {

        int arr[] = new int[]{1,2,3,1,3,4,6,4,6,3};
        int minvalue = Integer.MAX_VALUE;
        int maxvalue = Integer.MIN_VALUE;

        int minlength = Integer.MAX_VALUE;

        // Step 1: Find min and max
        for(int i=0;i<arr.length;i++){
            if(arr[i]<minvalue) minvalue=arr[i];
            if(arr[i]>maxvalue) maxvalue=arr[i];
        }

        // Step 2: Find smallest subarray containing both min and max
        for(int i=0;i<arr.length;i++){
            if(arr[i]==minvalue){
                for(int j=i+1;j<arr.length;j++){
                    if(arr[j]==maxvalue){
                        int length = j-i+1;
                        if(minlength>length) minlength=length;
                        break; // first match from i is enough
                    }
                }
            }

            if(arr[i]==maxvalue){
                for(int j=i+1;j<arr.length;j++){
                    if(arr[j]==minvalue){
                        int length = j-i+1;
                        if(minlength>length) minlength=length;
                        break; // first match from i is enough
                    }
                }
            }
        }

        System.out.println("Minimum value = " + minvalue);
        System.out.println("Maximum value = " + maxvalue);
        System.out.println("Smallest subarray length = " + minlength);
    }
}
