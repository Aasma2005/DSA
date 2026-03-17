public class RemoveDublicate {

    public ArrayList<Integer> removeDublicate(int[] arr){
        ArrayList<Integer> result=new ArrayList<>();
        if(arr.length==0){
            return result;
        }
        result.add(arr[0]);
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]){
                result.add(arr[i]);
            }
        }
        return result;
    }

    public static void main(String[]args){
        int arr[]=new int[]{2,2,3,3,4,5,6};
        RemoveDublicate obj=new RemoveDublicate();

        ArrayList<Integer> uniqueList = obj.removeDublicate(arr);
        System.out.println(uniqueList);

    }
}
