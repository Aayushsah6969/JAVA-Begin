
public class number_of_even_odd {
    public static void main(String args[]){
        int nums[] = new int[10];
        nums[0] = Integer.parseInt(args[0]);
        nums[1] = Integer.parseInt(args[1]);
        nums[2] = Integer.parseInt(args[2]);
        nums[3] = Integer.parseInt(args[3]);
        nums[4] = Integer.parseInt(args[4]);
        nums[5] = Integer.parseInt(args[5]);
        nums[6] = Integer.parseInt(args[6]);
        nums[7] = Integer.parseInt(args[7]);
        nums[8] = Integer.parseInt(args[8]);
        nums[9] = Integer.parseInt(args[9]);
        int even =0;
        int odd =0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] % 2 == 0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.println("Total even numbers "+even);
        System.out.println("Total odd numbres "+odd);
    }
}
