class missing_num_array{
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,3,5,4,7,9};
        int n=arr.length+1;

        int xor1=0;
        int xor2=0;

        for(int i=0;i<=n;i++){
            xor1=xor1^i;
        }
        for(int i=0;i<arr.length;i++){
            xor2=xor2^arr[i];
        }
        System.out.println(xor1^xor2);
    }
}