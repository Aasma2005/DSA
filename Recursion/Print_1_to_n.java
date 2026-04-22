class print_1_to_n{
    public void printNto1(int n){
        for(int i=1;i<=n;i++){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int n=10;
        print_1_to_n obj=new print_1_to_n();
        obj.printNto1(n);
    }
}