class non_repeating_number_array{
    public int firstNonRepeating(int[] arr) {
       
        for (int i = 0; i < arr.length; i++) {
            boolean foundDuplicate = false;
            
            for (int j = 0; j < arr.length; j++) {
                
                if (i != j && arr[i] == arr[j]) {
                    foundDuplicate = true;
                    break; 
                }
            }
            
            if (!foundDuplicate) {
                return arr[i];
            }
        }
      
        return 0;
    }
    public static void main(String[]args){
        int arr[]=new int[]{-1,2,-1,3,2};
        non_repeating_number_array sc=new non_repeating_number_array();
        System.out.println(sc.firstNonRepeating(arr));
}
}