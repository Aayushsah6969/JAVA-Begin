class smallest_in_array{
    static void min(int arr[]){
        int min =arr[0];
        for(int i=0; i<arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("Smallest in the array is: "+min);
    }
    public static void main(String args[]){
        int arr[] = {11, 88, 2, 66, 11, 77, 3, 7};
        min(arr);
    }
}