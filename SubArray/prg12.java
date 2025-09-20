//print composites of 9 

public class prg12 {
    public static int composite(int num){
        
        int count=0;
        for(int i=1;i<=num;i++){
            
            if(num % i==0){
                System.out.println(i);
                count++;
            }
        }
        return count;

    }
    public static void main(String[]args){
        int num=9;
        int count = composite(num);


        
        if(count>2){
            System.out.println("composite number");
        }
        else{
            System.out.println("not composite number");
        }
        
    }
    
    
    
    }

    
    

