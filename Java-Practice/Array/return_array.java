public class return_array {
    static int[] give(){
        int a[]={12,56,37,54,11,1,567};
        return a;
    }
   
    public static void main(String[] args){
        int arr[]=give();
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println("for each");
        for(int j:arr){
            System.out.println(j);
        }
    }
}
