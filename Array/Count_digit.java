class Count_digit{
    public static void main(String[] args) {
        Count_digit obj=new Count_digit();
        int n=12345;
        System.out.println(obj.countdigit(n));
    }
    public int countdigit(int n){
        if(n==0)
            return 1;
        int count=0;
        while(n !=0){
            n=n/10;
            count++;
        }
        return count;
    }
    
}