class Demo{
    
        static int replaceElement(int num){
            String str= String.valueOf(num);
            str=str.replace('0','5');
            int result=Integer.parseInt(str);
            return result;
        }
        public static void main(String[] args) {
            
            int res=replaceElement(1005);
            System.out.println(res);
    }
}