import java.util.*;
public class perfectnum {
    public static void main(String[] args){
        Scanner nums = new Scanner(System.in);
        System.out.println("ENter number to check: ");
        int n  = nums.nextInt();
        int sum =0;
        for(int i=1; i<n; i++){
            if(n%i==0){
                sum =sum + i;
            }
        }
        if(sum == n){
            System.out.println("YES: PERFECT NUMBER");
        }else{
            System.out.println("NO: NOT PERFECT NUMBER");
        }
    }
}
