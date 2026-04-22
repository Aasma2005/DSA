class print_n_to_1{
    public void printNto1(int n){
        for(int i=n;i>=1;i--){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int n=10;
        print_n_to_1 obj=new print_n_to_1();
        obj.printNto1(n);
    }
}